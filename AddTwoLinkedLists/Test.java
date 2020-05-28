package AddTwoLinkedLists;

public class Test {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        ListNode l11 = new ListNode(4);
        ListNode l12 = new ListNode(3);

        l1.next = l11;
        l11.next = l12;

        ListNode l2 = new ListNode(5);
        ListNode l21 = new ListNode(6);
        ListNode l22 = new ListNode(4);

        l2.next = l21;
        l21.next = l22;

        ListNode solutionList = addTwoNumbers(l1, l2);
        while(solutionList != null) {
            System.out.println(solutionList.val);
            solutionList = solutionList.next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode returnedList = new ListNode(0);
        int carryDigit = 0;
        ListNode l1head = l1;
        ListNode l2head = l2;
        ListNode curr = returnedList;

        while(l1head != null || l2head != null) {
            int x = (l1head != null) ? l1head.val : 0;
            int y = (l2head != null) ? l2head.val : 0;
            int sum = carryDigit + x + y;
            carryDigit = sum / 10;
            returnedList.next = new ListNode(sum % 10);
            returnedList = returnedList.next;
            if(l1head != null) l1head = l1head.next;
            if(l2head != null) l2head = l2head.next;
        }
        if (carryDigit > 0) {
            returnedList.next = new ListNode(carryDigit);
        }
        return returnedList.next;
    }
}
