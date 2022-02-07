package com.listsort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * #20210910_1046_229
 */
public class ListSort {

    public static void main(String[] args) {
        List<String> list1 = new ArrayList(Arrays.asList("leo", "Leo"));
        list1.sort((c1, c2) -> -c1.compareTo(c2));
        System.out.println(list1);

        Set<String> s = new HashSet<>(Arrays.asList("leo", "Olivia"));
//        s.sort((c1, c2) -> -c1.compareTo(c2));
        System.out.println(s);

        List<Integer> i = new ArrayList(Arrays.asList(1, 2));
        i.sort((c1, c2) -> c1.compareTo(c2));
        i.sort(Integer::compareTo);
        System.out.println(i);

        List<String> l = Arrays.asList("leo", "olivia");
        l.sort((c1, c2) -> -c1.compareTo(c2));
        System.out.println(l);
    }
}
