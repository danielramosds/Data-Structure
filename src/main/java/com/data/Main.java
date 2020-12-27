package com.data;

import com.data.linkedlist.LinkedList;

public class Main {
    public static void main(String[] args) {
        getLinkedList();

    }

    private static void getLinkedList() {
        LinkedList<String> linkedList = new LinkedList();

        linkedList.addLast("10");
        linkedList.addLast("20");
        linkedList.addLast("30");
        linkedList.addFirst("5");

        System.out.println(linkedList.indexOf("5"));
        System.out.println(linkedList.contains("30"));
        System.out.println(linkedList.size());

        linkedList.deleteFirst();
        System.out.println(linkedList.size());

    }
}
