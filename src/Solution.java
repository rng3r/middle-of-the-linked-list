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
    public ListNode middleNode(ListNode head) {
        if (head.next == null)
            return head;

        int length = 0;
        ListNode directHead = head;
        while (directHead != null) {
            directHead = directHead.next;
            length++;
        }

        int targetIdx = length / 2;

        int idx = 0;

        ListNode middle = head;

        while (idx < targetIdx) {
            middle = middle.next;
            idx++;
        }

        return middle;

    }
}