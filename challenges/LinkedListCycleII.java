package challenges;

public class LinkedListCycleII {

    public MergeTwoSortedLists.ListNode intersection(MergeTwoSortedLists.ListNode head) {
        MergeTwoSortedLists.ListNode slow = head;
        MergeTwoSortedLists.ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                return slow;
            }
        }
        return null;
    }

    public MergeTwoSortedLists.ListNode detectCycle(MergeTwoSortedLists.ListNode head) {
        if(head == null || head.next == null) {
            return null;
        }
        MergeTwoSortedLists.ListNode intersect = intersection(head);
        if(intersect == null) {
            return null;
        }

        MergeTwoSortedLists.ListNode start = head;
        while (intersect != start) {
            start = start.next;
            intersect = intersect.next;
        }
        return start;
    }
}
