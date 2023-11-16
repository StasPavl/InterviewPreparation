package org.example.linkedList.doubleLinkedList;

import org.example.linkedList.LinkedList;

public class DoubleLinkedList {

    private Node head;
    private Node tail;
    private int length;


    class Node {
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
        }
    }

    public DoubleLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList(){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
    public void getHead(){
        System.out.println("Head: " + head.value);
    }
    public void getTail(){
        System.out.println("Tail: " + tail.value);
    }
    public void getLength(){
        System.out.println("Length: " + length);
    }
    public void append(int value){
        Node newNode = new Node(value);

        if (length == 0){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            length++;
        }

    }

    public Node removeLast(){
        Node temp = tail;
        if (length == 0){
            return null;
        } else {
            temp = tail;
            tail = tail.prev;
            tail.next = null;
            temp.prev = null;
            length--;
            if(length == 0){
                head = null;
                tail = null;
            }
            return temp;
        }
    }
    public void prepend(int value){
        Node newNode = new Node(value);
        if (length == 0){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        length++;
    }
    public Node removeFirst(){
        Node temp = head;
        if(length == 0){
            return null;
        } else if (length == 1) {
            head = null;
            tail = null;
        }else{
            head = head.next;
            head.prev = null;
            temp.next = null;
        }
        length--;
        return temp;
    }
}
