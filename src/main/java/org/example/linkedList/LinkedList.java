package org.example.linkedList;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void getHead() {
        System.out.println("Head is: " + head.value);
    }

    public void getTail() {
        System.out.println("Tail is: " + tail.value);
    }

    public void getLength() {
        System.out.println("Length is: " + length);
    }


    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public Node removeLast() {
        if (length == 0) return null;
        Node pre = head;
        Node temp = head;
        while (temp != null) {
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        if (length == 0) {
            head = null;
            tail = null;

        }
        return temp;
    }
    public void appendFirst(int value){
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst(){
        if(length == 0 ) return null;
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        if(length == 0) tail = null;
        return temp;
    }
    public Node get(int index){
        if(index < 0 || index >= length){
            return null;
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }
    public boolean set(int index, int value){
        if(index < 0 || index >= length){
            return false;
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        temp.value = value;
        return true;

    }
    public boolean insert(int index,int value){
        if(index < 0 || index > length){
            return false;
        }
        if( index== 0){
            appendFirst(value);
            return true;
        }
        if (index == length){
            append(value);
            return true;
        }
        /*
        Node newNode = new Node(value);
        Node temp = get(index-1);
        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return true;
        */
        Node newNode = new Node(value);
        Node temp = head;
        Node pre = head;
        for (int i = 0; i < index; i++){
            pre = temp;
            temp = temp.next;
        }

        pre.next = newNode;
        newNode.next = temp;
        length++;
        return true;
    }
}
