package org.example.PalindromLinkedList;

public class MyLinkedList {

    Node head;
    Node tail;
    int size;

    boolean isEmpty() {
        return head == null;
    }

    void add(int value) {

        Node node = new Node(value);

        if (isEmpty()) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    void print() {

        if (isEmpty())
            System.out.println("List is empty");

        else {

            Node current = head;
            while (current != null) {
                System.out.print(current.value + " -> ");
                current = current.next;

            }

            if (current == null) {
                System.out.print("null");
            }

        }

    }


    boolean isPalindrome() {

        if (head.next == null)
            return true;

        //        find the middle of linkedlist
        Node slow = head;
        Node fast = head;

        Node count = head;
        int size = 0;

        while(count !=null){
            size++;
            count = count.next;
        }




        while (fast !=null  && fast.next != null){

            slow = slow.next;
            fast = fast.next.next;
        }

        Node middle = slow;
        //System.out.println(middle.val);

//        append values of first half of linkedList to a string

        Node current  = head;
        StringBuilder firstHalf = new StringBuilder("");

        while (current != middle){
            firstHalf.append(current.value);
            current = current.next;
        }



//        append values of second half of linkedList to another string
        StringBuilder secondHalf = new StringBuilder("");

        while (middle !=null){
            if (size%2!=0){
                middle = middle.next;
            }
            secondHalf.append(middle.value);

            middle = middle.next;
        }


//        reverse string from 3 and compare it to string from 2

        secondHalf.reverse();

        // System.out.println(firstHalf + " " + secondHalf);


        return firstHalf.toString().equals(secondHalf.toString());


    }
}
