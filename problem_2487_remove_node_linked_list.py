from datastructures_impl.linked_list import ListNode
from typing import Optional
import collections


def removeNodes(head: Optional[ListNode]) -> Optional[ListNode]:

    nodeStack = collections.deque()

    currentNode = head

    while currentNode:

        nodeStack.append(currentNode)

        currentNode = currentNode.next

    highestNode = None

    while len(nodeStack) > 0:

        a = nodeStack.pop()

        a.next = None

        if highestNode is None:

            highestNode = a

        elif a.val >= highestNode.val:

            a.next = highestNode

            highestNode = a

    return highestNode
