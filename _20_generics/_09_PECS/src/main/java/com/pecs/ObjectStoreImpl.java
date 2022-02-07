package com.pecs;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Хранилище
 * @param <K> ключ
 * @param <V> значение
 */
public class ObjectStoreImpl<K, V> implements ObjectStore<K, V> {

    /**
     * Хранилище
     */
    private Map<K, V> map = new HashMap<>();

    /**
     * Кладёт значение в хранилище по заданному ключу.
     * @param key   Ключ.
     * @param value Значение.
     */
    @Override
    public void put(K key, V value) {
        map.put(key, value);
    }

    /**
     * Читает значение из хранилища по заданному ключу.
     *
     * @param key Ключ.
     * @return Значение либо null.
     */
    @Override
    public V get(K key) {
        return map.get(key);
    }

    /**
     * Кладёт все пары ключ-значение в хранилище.
     * Производитель
     *
     * @param entries Набор пар ключ-значение.
     */
    @Override
    public void putAll(Map<? extends K, ? extends V> entries) {
        entries.forEach((K, V) -> map.put(K, V));
    }

    /**
     * Читает все значения из хранилища по заданным
     * ключам.
     *
     * @param keys Набор ключей.
     * @return Пары ключ-значение.
     */
    @Override
    public Map<K, V> getAll(Collection<K> keys) {
        Map<K, V> result = new HashMap<>();
        keys.forEach(key -> result.put(key, map.get(key)));
        return result;
    }

    /**
     * Читает из хранилища все значения, удовлетворяющие
     * заданному условию (предикату).
     *
     * @param p Предикат для проверки значений (потребитель, т.к. метод возвращает данные из коллекции с заданным типом).
     * @return Значения, удовлетворяющие предикату.
     */
    @Override
    public Collection<V> getAll(Predicate<? super V> p) {
        return map.values()
                .stream()
                .filter(p)
                .collect(Collectors.toList());
    }
}
