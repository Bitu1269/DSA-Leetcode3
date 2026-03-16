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
    public static int Size(ListNode head){
        int size = 0;
        while(head != null){
            size++;
            head=head.next;
        }
        return size/2;
    }
    public ListNode middleNode(ListNode head) {
        if(head == null) return null;
        int count = Size(head);
        ListNode temp = head;
        for(int i=0; i<count; i++){
            temp = temp.next;
        }
        return temp;
        
    }
}