   class ListNode {
      int val;
      ListNode next;
      ListNode() {

      }
      ListNode(int val) {
          this.val = val;
      }

      ListNode(int val, ListNode next) {
          this.val = val;
          this.next = next;
      }

  }

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode rst = new ListNode(0);
        ListNode cur = rst;
        int carry = 0;

        while(l1 != null || l2 != null || carry != 0){
            int sum = carry;
            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }
            carry = sum / 10;
            cur.next = new ListNode(sum % 10);
            cur = cur.next;
        }
        return rst.next;
    }
}

// 为什么没有放rst在loop里面但是却会update？
// 因为开始的时候我们放 rst 和 cur 都是point去同一个地方，也就是看到的 rst = new ListNode(0); cur = rst;
// 这样导致了如果我update了cur.next这些，rst本身自己也会被update，所以到最后我只需要return rst.next
// 为什么是rst.next 而不是 rst？
// 主要是因为开始的时候我们放了一个0，所以rst.next才是正式开始我们要的答案