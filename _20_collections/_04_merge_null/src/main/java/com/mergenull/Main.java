package com.mergenull;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BinaryOperator;

/**
 * Если значение отсутствует, то элемент из Map будет удален
 * https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Map.html#merge(K,V,java.util.function.BiFunction)
 *
 *  V oldValue = map.get(key);
 *  V newValue = (oldValue == null) ? value :
 *               remappingFunction.apply(oldValue, value);
 *  if (newValue == null)
 *      map.remove(key);
 *  else
 *      map.put(key, newValue);
 */
public class Main {

    public static void main(String... __) {
        Map map = new LinkedHashMap();
        BinaryOperator operator = (s1, s2) -> null;
        map.put("one", "1");
        map.merge("one", "1", operator);
        map.merge("two", "2", operator);
        System.out.println(map); // {two=2}
    }
}
