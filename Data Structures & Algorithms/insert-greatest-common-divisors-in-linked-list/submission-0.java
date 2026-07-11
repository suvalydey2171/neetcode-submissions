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
    public int gcd(int a, int b)
    {
        return (b==0)?a:gcd(b,a%b);
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode t=head;
        while(head.next!=null)
        {
            int a=head.val;
            int b=head.next.val;
            int v=gcd(a,b);
            ListNode temp=new ListNode(v,head.next);
            head.next=temp;
            head=head.next.next;
        }
        return t;
    }
}