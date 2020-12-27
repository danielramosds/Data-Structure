package com.data.linkedlist;

public class Node<E> {
    protected E value;
    protected Node next;

    protected Node() {
    }

    protected Node(E value) {
        this.value = value;
    }
}