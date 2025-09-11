package leetcode.problem_2_add_two_numbers;

import leetcode.datastructure_impl.ListNode;

public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2){

        int remainder = 0;
        ListNode sumHead = new ListNode(), currNode = sumHead;

        while (l1 != null || l2 != null) {

            if(l1 == null){

                l1 = new ListNode(0);

            }

            if (l2 == null) {

                l2 = new ListNode(0);

            }

            int l1Val = l1.val, l2Val = l2.val, sum = l1Val+l2Val;

            if(remainder != 0){

                sum += remainder;
                remainder =0;

            }

            String strSum = Integer.toString(sum);

            if(strSum.length()>1){

                sum = Integer.parseInt(
                    String.valueOf(
                        strSum.charAt(1)
                    )
                );

                remainder = Integer.parseInt(
                    String.valueOf(
                        strSum.charAt(0)
                    )
                );

            }

            currNode.val = sum;
            currNode.next = new ListNode();
            currNode = currNode.next;

            l1 = l1.next;
            l2 = l2.next;


        }

        if(remainder != 0){

            currNode.val = remainder;

        }

        return sumHead;

    }

}