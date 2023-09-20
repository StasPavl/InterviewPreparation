package org.example.linkedList;

public class LinkedListRunner {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(4);

        myLinkedList.getLength();
        //length before append
        myLinkedList.append(2);
        myLinkedList.appendFirst(3);
        System.out.println("------------------");
        myLinkedList.removeFirst();
        System.out.println("my Linked list");
        myLinkedList.printList();
        myLinkedList.getLength();
        System.out.println("get node");
        System.out.println(myLinkedList.get(0).value);

        System.out.println(myLinkedList.set(0,1));
        System.out.println("my new linked list");
        myLinkedList.printList();
        System.out.println("inserting to index 2");
        myLinkedList.insert(0,3);
        myLinkedList.printList();

    }
}
