package com.concurrentCollection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;

/**
 * {@link ConcurrentSkipListSet}
 */
public class ConcurrentSkipListSetTest {

    public void main() {
        addAll();
        removingWhileIteratingIsAllowed();
    }

    private void addAll() {
        List<Integer> l1 = Arrays.asList(1,2,3);
        Set<Integer> s3 = new ConcurrentSkipListSet<>();
        s3.addAll(l1);
        for(Integer item: s3) s3.add(5);
        assert s3.size() == 4;
    }

    /**
     * Removing While Iterating Is Allowed
     * iterator поддерживает удаление
     */
    private void removingWhileIteratingIsAllowed() {
        List<Integer> l1 = Arrays.asList(1,2,3);
        Set<Integer> s3 = new ConcurrentSkipListSet<>();

        Iterator<Integer> iterator = s3.iterator();
        while (iterator.hasNext()) {
            iterator.remove();
        }
        assert s3.size() == 0;
    }
}
