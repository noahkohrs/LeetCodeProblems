/*
 * @lc app=leetcode id=19 lang=java
 *
 * [19] Remove Nth Node From End of List
 */

// @lc code=start
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode iter = head;
        try {
            for (int i = 0; i < n; i++) {
                iter = iter.next;
            }
            if (iter == null) {
                return head.next;
            }
            ListNode prev = head;
            while (iter.next != null) {
                iter = iter.next;
                prev = prev.next;
            }
            prev.next = prev.next.next;
            return head;
        }
        catch (NullPointerException e) {
            return new ListNode();
        }
    }
}
// @lc code=end

