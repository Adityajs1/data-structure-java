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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        List<Integer> points = new ArrayList<>();
        ListNode prev = head;
        ListNode curr = head.next;
        int index = 1;

        while (curr.next != null) {
            if ((curr.val > prev.val && curr.val > curr.next.val) || (curr.val < prev.val && curr.val < curr.next.val)) {
                points.add(index);
            }

            prev = curr;
            curr = curr.next;
            index++;
        }

        if (points.size() < 2) {
            return new int[]{-1, -1};
        }

        int min = Integer.MAX_VALUE;
        for (int i = 1; i < points.size(); i++) {
            min = Math.min(min, points.get(i) - points.get(i - 1));
        }
        int max = points.get(points.size() - 1) - points.get(0);

        return new int[]{min, max};
    }
}