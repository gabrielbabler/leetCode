package challenges;

public class MiddleOfTheLinkedList {

    public MergeTwoSortedLists.ListNode middleNode(MergeTwoSortedLists.ListNode head) {
        MergeTwoSortedLists.ListNode aPointer = head;
        MergeTwoSortedLists.ListNode bPointer = head;

        while(bPointer != null && bPointer.next != null) {
            aPointer = head.next;
            bPointer = head.next.next;
        }

        return aPointer;

    }
}
