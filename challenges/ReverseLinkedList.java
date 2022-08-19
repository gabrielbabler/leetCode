package challenges;

public class ReverseLinkedList {

    public MergeTwoSortedLists.ListNode reverseList(MergeTwoSortedLists.ListNode head) {

        MergeTwoSortedLists.ListNode previous = null;

        while (head != null) {
            MergeTwoSortedLists.ListNode nextNode = head.next;
            head.next = previous;
            previous = head;
            head = nextNode;
        }
        return previous;
    }
}