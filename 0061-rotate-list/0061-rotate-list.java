/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;

        int n = 1;
        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
            n++;
        }

        k = k % n;
        if (k == 0) return head;

        head = reverse(head, null);
        ListNode kNode = getKthNode(head, k);
        ListNode firstHalfHead = reverse(head, kNode);
        ListNode secondHalfHead = reverse(kNode, null);
        head.next = secondHalfHead;

        return firstHalfHead;
    }

    private ListNode reverse(ListNode start, ListNode end) {
        ListNode prev = end;
        ListNode curr = start;
        while (curr != end) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    private ListNode getKthNode(ListNode node, int k) {
        while (node != null && k > 0) {
            node = node.next;
            k--;
        }
        return node;
    }
}