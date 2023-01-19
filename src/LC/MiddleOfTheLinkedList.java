package LC;

import static LC.MiddleOfTheLinkedList.ListNode.middleNode;

public class MiddleOfTheLinkedList {
    // Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next;
    }

    public static ListNode middleNode(ListNode head) {
        /* normal solution
        int index = 1;
        ListNode node = new ListNode();
        node = head;
        while(node.next != null){
            node = node.next;
            index++;
        }
        index /= 2;
        node = head;
        while(index>0){
            node = node.next;
            index--;
        }
        return node;
        */
        ListNode slow = head, fast = head;
        while(fast != null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
        }
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        System.out.println(middleNode(head));
    }
}
