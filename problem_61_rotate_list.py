# Definition for singly-linked list.
# class listNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
from typing import Optional
from linked_list import ListNode

def rotate(reglist : list[int], k : int) -> ListNode:

    kthIndex = len(reglist)-(k+1)

    newHead = reglist[kthIndex].next

    reglist[kthIndex].next = None

    nthIndex = len(reglist)-1

    reglist[nthIndex].next = reglist[0]

    return newHead


def rotateRight(head: Optional[ListNode], k: int) -> Optional[ListNode]:

    reglist = []

    currentNode = head

    while currentNode:

        reglist.append(currentNode)

        currentNode = currentNode.next

    if(k > len(reglist) and len(reglist) != 0):

        factor = int(k/len(reglist))

        k = k - (len(reglist)*factor)

    if k == len(reglist) or len(reglist) == 0 or k == 0:

        return head

    newHead = rotate(reglist, k)

    print(k)

    return newHead
