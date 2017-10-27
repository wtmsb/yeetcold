/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1 = new Stack<Integer>();
        Stack<Integer> s2 = new Stack<Integer>();
        ListNode head;
        while(l1 != null) {
            s1.push(l1.val);
            l1 = l1.next;
        };
        while(l2 != null) {
            s2.push(l2.val);
            l2 = l2.next;
        }
        int cout = 0;
        ListNode list = new ListNode(0);
        while (!s1.empty() || !s2.empty()) {
            int sum = 0;
            if (!s1.empty()) sum += s1.pop();
            if (!s2.empty()) sum += s2.pop();
            list.val = (sum + cout) % 10;
            cout= (sum + cout) / 10;
            head = new ListNode(cout);
            head.next = list;
            list = head;
        }
        return list.val == 0 ? list.next : list;
    }
}
