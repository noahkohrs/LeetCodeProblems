/*
 * @lc app=leetcode id=83 lang=java
 *
 * [83] Remove Duplicates from Sorted List
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {

        if (head == null)
            return null;

        ListNode iter = head;
        ListNode newNodeHead = new ListNode(head.val);
        ListNode newIter = newNodeHead;
        while (iter != null) {
            if (iter.val != newIter.val) {
                newIter.next = new ListNode(iter.val);
                newIter = newIter.next;
            }
            iter = iter.next;
        }
        return newNodeHead;
    }
}
// @lc code=end
