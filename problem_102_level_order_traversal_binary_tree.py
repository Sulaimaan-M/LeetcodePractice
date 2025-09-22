import collections
from typing import Optional
from datastructures_impl.tree_node import TreeNode

def levelOrder(root: Optional[TreeNode]) -> list[list[int]]:

    q = collections.deque()
    q.append(root)
    res = []

    while q:
        level = []
        lenq = len(q)

        for i in range(lenq):
                
            node = q.popleft()

            if node:
                level.append(node.val)
                q.append(node.left)
                q.append(node.right)

        if level :
                
            res.append(level)

    return res

c = TreeNode(1, TreeNode(4, TreeNode(9)), TreeNode(3, TreeNode(6), TreeNode(8)))

print(levelOrder(c))