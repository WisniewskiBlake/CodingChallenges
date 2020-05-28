package AddTwoLinkedLists;

//You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
//
//        You may assume the two numbers do not contain any leading zero, except the number 0 itself.
//
//        Example:
//
//        Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
//        Output: 7 -> 0 -> 8
//        Explanation: 342 + 465 = 807.

import java.util.LinkedList;

public class AddTwoLinkedLists {
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
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode returnedList = new ListNode(0);
        int carryDigit = 0;
        ListNode l1head = l1;
        ListNode l2head = l2;

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
