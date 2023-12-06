package DSA.LeetCode;

import java.util.PriorityQueue;

public class MergeKSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);
        ListNode sorted = new ListNode(-1);
        for (ListNode list : lists) {
            if (list != null) {
                pq.add(list);
            }
        }
        ListNode cur = sorted;
        while(!pq.isEmpty()) {
            cur.next = pq.poll();
            cur = cur.next;
            ListNode next = cur.next;
            if(next!= null)
                pq.add(next);
        }

        return sorted.next;
    }
}
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }