// LeetCode Problem: https://leetcode.com/problems/merge-two-sorted-lists/
public class MergedTwoSortedList {
}

// * Definition for singly-linked list.
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null && list2 == null){
            return null;
        }
        ListNode list3 = new ListNode(-1);
        ListNode current = list3;
        ListNode current1 = list1;
        ListNode current2 = list2;

        while(current1 != null && current2 != null){
            if(current1.val <= current2.val){
                    current.next = current1;
                    current1 = current1.next;
            }else{
                    current.next = current2;
                    current2 = current2.next;
            }
            current = current.next;
        }

        if(current1 != null){
            current.next = current1;
        }
        else{
            current.next = current2;
        }
        return list3.next;
    }
}