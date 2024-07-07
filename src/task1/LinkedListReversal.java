package task1;

public class LinkedListReversal {
    public static ListNode reverseInGroups(ListNode head, int k) {
        if (head == null || k == 1) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = dummy, nex = dummy, pre = dummy;
        int count = 0;


        while (curr.next != null) {
            curr = curr.next;
            count++;
        }

        while (count >= k) {
            curr = pre.next;
            nex = curr.next;
            for (int i = 1; i < k; i++) {
                curr.next = nex.next;
                nex.next = pre.next;
                pre.next = nex;
                nex = curr.next;
            }
            pre = curr;
            count -= k;
        }

        if (count > 0 && count < k) {
            curr = pre.next;
            nex = curr.next;
            for (int i = 1; i < count; i++) {
                curr.next = nex.next;
                nex.next = pre.next;
                pre.next = nex;
                nex = curr.next;
            }
        }

        return dummy.next;
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next = new ListNode(7);
        head.next.next.next.next.next.next.next = new ListNode(8);

        System.out.println("Original List:");
        printList(head);

        int k = 3;
        head = reverseInGroups(head, k);

        System.out.println("Reversed List in Groups of " + k + ":");
        printList(head);
    }
}
