package edu.leetcode;
import java.util.LinkedList;
//234. Palindrome Linked List

// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class PalindromeLinkedList {

    public static boolean isPalindrome(ListNode head) {
        LinkedList<Integer> list = new LinkedList<>();
        while (head.next != null) {
            list.add(head.val);
            head = head.next;
        }
        list.add(head.val);
        if (list.size() % 2 != 0) {
            list.remove(list.size() / 2);
        }
        /*System.out.println(list.size());
        for (int i: list) {
            System.out.println(i);
        }
        System.out.println(list.peekFirst());
        System.out.println(list.peekLast());*/
        while (list.size() != 0 ) {
            if (list.peekFirst() != list.peekLast()) {
                return false;
            } else {
                list.removeFirst();
                list.removeLast();
            }
        }

        /*System.out.println(list.size());
        for (int i: list) {
            System.out.println(i);
        }*/
        return true;
    }

    public static void main(String[] args) {
        ListNode node4 = new ListNode(1);
        ListNode node3 = new ListNode(2, node4);
        ListNode node2 = new ListNode(3, node3);
        ListNode node1 = new ListNode(2, node2);
        ListNode head = new ListNode(1, node1);
        System.out.println(isPalindrome(head));
    }
}
