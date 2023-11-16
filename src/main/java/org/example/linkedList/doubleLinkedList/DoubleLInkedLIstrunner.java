package org.example.linkedList.doubleLinkedList;

public class DoubleLInkedLIstrunner {
    public static void main(String[] args) {
        DoubleLinkedList myDLL = new DoubleLinkedList(7);
        myDLL.getLength();
        myDLL.getHead();
        myDLL.getTail();
        myDLL.printList();

        System.out.println("append--------------");
        myDLL.append(8);
        System.out.println("after appending");
        myDLL.printList();

        
        System.out.println("remove last -----------");
        myDLL.removeLast();
        System.out.println("after removing last");
        myDLL.printList();
    }
}
