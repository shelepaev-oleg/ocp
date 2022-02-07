package com.concurrentCollection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * {@link CopyOnWriteArrayList} позволяет безопастно перебирать элементы, даже при измении массива
 */
public class CopyOnWriteArrayListTest {

    public void main() {
        insertBeforeTest();
        insertAfterTest();
        removingWhileIteratingIsNotAllowed();
    }

    /**
     * Iterating Over CopyOnWriteArrayList While Inserting
     * Итератор создан до того как добавлен элемент
     */
    private void insertBeforeTest() {
        CopyOnWriteArrayList<Integer> numbers = new CopyOnWriteArrayList<>(new Integer[]{1, 3, 5, 8});
        Iterator<Integer> iterator = numbers.iterator();
        numbers.add(10); // здесь будет создана новая копия массива и в нее уже будет добавлен новый элемент

        List<Integer> result = new LinkedList<>();
        iterator.forEachRemaining(result::add);
        assert result.size() == 4;
        assert numbers.size() == 5;
    }

    /**
     * Iterating Over CopyOnWriteArrayList While Inserting
     * Итератор создан после того как добавлен элемент
     */
    private void insertAfterTest() {
        CopyOnWriteArrayList<Integer> numbers = new CopyOnWriteArrayList<>(new Integer[]{1, 3, 5, 8});
        numbers.add(10); // здесь будет создана новая копия массива и в нее уже будет добавлен новый элемент
        Iterator<Integer> iterator = numbers.iterator();

        List<Integer> result = new LinkedList<>();
        iterator.forEachRemaining(result::add);
        assert result.size() == 5;
        assert numbers.size() == 5;
    }

    /**
     * Removing While Iterating Is Not Allowed
     * iterator не поддерживает удаление
     */
    private void removingWhileIteratingIsNotAllowed() {
        CopyOnWriteArrayList<Integer> numbers
                = new CopyOnWriteArrayList<>(new Integer[]{1, 3, 5, 8});

        boolean isException = false;
        try {
            Iterator<Integer> iterator = numbers.iterator();
            while (iterator.hasNext()) {
                iterator.remove();
            }
        } catch (UnsupportedOperationException e) {
            isException = true;
        }
        assert isException;
    }
}
