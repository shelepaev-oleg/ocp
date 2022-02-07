package com.binarySearch;

import java.util.*;

/**
 * #20210206_2040_234/3
 */
public class Main {

    public static void main(String[] args) {
//        Comparator<Integer> c = (Integer o1, Integer o2) -> {return o2 — o1};

        Comparator<Integer> c1 = Integer::compareTo;
        Comparator<Integer> c2 = Comparator.comparing(o -> o);
        Comparator<Integer> c3 = (o1, o2) -> o2.compareTo(o1);
        List<Integer> list = Arrays.asList(5, 4, 7, 1);
        list.sort(c1);
        System.out.println(list);

        System.out.println(Collections.binarySearch(list, 1));

        System.out.println(Collections.binarySearch(list, 1, c1));

        System.out.println(Collections.binarySearch(list, 1, c2));

        System.out.println(Collections.binarySearch(list, 1, c3));



        Comparator<Message> c4 = Comparator.comparing(Message::getMessage);
        List<Message> messageList = Arrays.asList(
                new Message("b"),
                new Message("a")
        );
        messageList.sort(c4);
        System.out.println(messageList);
        System.out.println(Collections.binarySearch(messageList, new Message("b"), c4));

    }
}

class Message {
    private String message;
    private int id;

    public Message(String message) {
        this.message = message;
        this.id = new Random().nextInt(1000);
    }
    public String getMessage() {
        return message;
    }
    public Integer getId() {
        return id;
    }
    public String toString() {
        return "[" + id + "] " + message;
    }
}
