 public class ListNode 
 {
      int val;
      ListNode next;
      ListNode(int x) 
      { 
    	  val = x; 
      }
  }
 
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {
        ListNode result = new ListNode(0);
        while(l1.next!=null && l2.next!=null)
        {
            if(l1.next == null)
            {
                ListNode x = new ListNode(0);
                x.next = null;
                l1.next = x;
            }
            if(l2.next == null)
            {
                ListNode x1 = new ListNode(0);
                x1.next = null;
                l2.next = x1;
            }
            if(l1.val + l2.val > 10)
            {
                result.val = result.val + l1.val + l2.val - 10;
                ListNode x2 = new ListNode(1);
                x2.next = null;
                result.next = x2;
            }
            else
            {
                result.val = result.val + l1.val + l2.val;
            }
            ListNode r = new ListNode(0);
            result.next = r;
        }
            if(l1.val + l2.val > 10)
            {
                result.val = result.val + l1.val + l2.val - 10;
                ListNode x2 = new ListNode(1);
                x2.next = null;
                result.next = x2;
            }
            else
            {
                result.val = result.val + l1.val + l2.val;
            }
        return result;
    }
    public static void main(String[]args)
    {
    	Solution ob = new Solution();
    	ListNode a = new ListNode(1);
    	a.next = new ListNode(2);
    	a = a.next;
    	a.next = new ListNode(3);
    	System.out.println(a.val);
    }
}
