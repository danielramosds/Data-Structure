package com.data.linkedlist;

import java.util.NoSuchElementException;

public class LinkedList<E> extends Node {


    private Node<E> first;
    private Node<E> last;

    public LinkedList() {
    }

    public void addFirst(E newFirstValue) {
        Node newFirst = new Node(newFirstValue);
        if (isEmptyList()) {
            first = last = newFirst;
        }
        newFirst.next = first;
        first = newFirst;

    }

    public void addLast(E newLastValue) {
        Node newLast = new Node(newLastValue);
        if (isEmptyList()) {
            first = last = newLast;
        }
        last.next = newLast;
        last = newLast;

    }


    public void deleteFirst() {
        if (isEmptyList()) {
            throw new NoSuchElementException();
        }

        if (first == last) {
            first = last = null;
            return;
        }

        Node temporaryNode = first.next;
        first.next = null;
        first = temporaryNode;

    }

    public void deleteLast() {
        if (isEmptyList()) {
            throw new NoSuchElementException();
        }

        if (first == last) {
            first = last = null;
            return;
        }
        Node previousFromLast = getPreviousFromLast(last);
        last = previousFromLast;
        last.next = null;


    }

    public boolean contains(E item) {
        return indexOf(item) != -1;
    }

    public int indexOf(E item) {
        int index = 0;
        Node currentNode = first;
        while (notEmptyNode(currentNode)) {
            if (currentNode.value == item) {
                return index;
            }
            currentNode = currentNode.next;
            index++;
        }
        return -1;
    }

    public int size() {
        int size = 0;
        Node currentNode = first;
        while (notEmptyNode(currentNode)) {
            currentNode = currentNode.next;
            size++;
        }
        return size;
    }

    private Node getPreviousFromLast(Node node) {
        Node current = first;
        while (current != null) {
            if (current.next == node) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    private boolean isEmptyList() {
        return first == null;
    }

    private boolean notEmptyNode(Node currentNode) {
        return currentNode != null;
    }
}
