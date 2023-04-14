package org.example.PalindromLinkedList;

public class LinkedListPalindrome {
    public static void main(String[] args) {

        MyLinkedList node = new MyLinkedList();
        node.add(1);
        node.add(2);
        node.add(3);
        node.add(4);
        node.add(4);
        node.add(3);
        node.add(2);
        node.add(1);

        System.out.println(node.isPalindrome());
    }

    }



