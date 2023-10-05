package com.bulbul.linkedList;

public class SinglyLinkedList {

    private ListNode head;

    private static class ListNode{
        private int data; // Generic type
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);

        // Now we will connect them together to form a chain
        singlyLinkedList.head.next = second;  //10 -->1
        second.next = third; //10--->1---->8
        third.next = fourth;  //10--->1---->8 --->11---> null

        singlyLinkedList.print();
        singlyLinkedList.findLength();

    }

    private void print(){
        ListNode current = head;
        while (current !=null){
            System.out.print(current.data + "--->");
            current = current.next;
        }
        System.out.println("null");
    }

    public void findLength(){
        int count =0;
        ListNode current = head;
        while (current !=null){
            count++;
            current = current.next;
        }

        System.out.println(count);
    }

}
