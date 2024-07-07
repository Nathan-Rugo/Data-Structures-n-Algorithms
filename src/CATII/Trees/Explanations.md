### Explanations

#### Step 9: Recursive Search

The recursive method compares the target value with the current node's data. If the target value is smaller, the method is called recursively on the left subtree; if larger, on the right subtree. If the value matches the current node's data, the search is successful.

When searching for the value `50` in the given tree:

1. We start at root `31`.
2. Then move to the right child `48` (50 > 31).
3. Then move to the right child `78` (50 > 48).
4. Then move to the left child `54` (50 < 78).
5. Then move to the left child `50` (50 < 54).
6. `50` is found.

#### Step 10: Recursive Delete

The recursive method locates the node to be deleted. If the node has no children, it is simply removed. If it has one child, that child replaces the node. If it has two children, the node's data is replaced with the smallest data from its right subtree, and that smallest node is then deleted.

For example, deleting the node with value `34` in the given tree:

1. We Start at root `31`.
2. The move to the right child `48` (34 > 31).
3. Then move to the left child `34` (34 < 48).
4. Node `34` found. It has no children, so it is simply removed.
5. Node `34` deleted.