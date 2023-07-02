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
            if (iter.next != null)
                iter.next = iter.next.next;

            return head;
        }
        catch (NullPointerException e) {
            return new ListNode();
        }
    }
}
// @lc code=end

