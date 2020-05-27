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
        ListNode l1 = new ListNode();
        l1.val = 2;
        ListNode l11 = new ListNode();
        l11.val = 4;
        ListNode l12 = new ListNode();
        l12.val = 3;
        l1.next = l11;
        l11.next = l12;

        ListNode l2 = new ListNode();
        l2.val = 5;
        ListNode l21 = new ListNode();
        l21.val = 6;
        ListNode l22 = new ListNode();
        l22.val = 4;
        ListNode solutionList = addTwoNumbers(l1, l2);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

    }

}
