package Labs.BinarySearchTree;

public class BSTree {
    public BSTNode root;

    /* Constructor */
    public BSTree() {
        root = null;
    }

    /* Function to check if Labs.tree is empty */
    public boolean isEmpty() {
        return root == null;
    }

    /* Function to insert data */
    public void insert(int data) {
        root = insertNode(root, data);
    }

    /* Function to insert data recursively */
    public BSTNode insertNode(BSTNode node, int data) {
        if (node == null) { // Base case
            node = new BSTNode(data);
        } else { // General case
            System.out.println(node.getData());
            if (data <= node.getData()) {
                node.setLeft(insertNode(node.getLeft(), data));
            } else {
                node.setRight(insertNode(node.getRight(), data));
            }
        }
        return node;
    }

    /* Function to delete data */
    public void delete(int k) {
        if (isEmpty()) {
            System.out.println("Tree Empty");
        } else if (!search(k)) {
            System.out.println("Sorry " + k + " is not present");
        } else {
            root = delete(root, k);
            System.out.println(k + " deleted from the Labs.tree");
        }
    }

    public BSTNode delete(BSTNode root, int k) {
        if (root == null) return null;

        if (k < root.getData()) {
            root.setLeft(delete(root.getLeft(), k));
        } else if (k > root.getData()) {
            root.setRight(delete(root.getRight(), k));
        } else {
            if (root.getLeft() == null) {
                return root.getRight();
            } else if (root.getRight() == null) {
                return root.getLeft();
            }

            root.setData(minValue(root.getRight()));
            root.setRight(delete(root.getRight(), root.getData()));
        }
        return root;
    }

    public int minValue(BSTNode node) {
        int minv = node.getData();
        while (node.getLeft() != null) {
            minv = node.getLeft().getData();
            node = node.getLeft();
        }
        return minv;
    }

    /* Functions to count number of nodes */
    public int countNodes() {
        return countNodes(root);
    }

    /* Function to count number of nodes recursively */
    private int countNodes(BSTNode r) {
        if (r == null) {
            return 0;
        } else {
            return 1 + countNodes(r.getLeft()) + countNodes(r.getRight());
        }
    }

    /* Functions to search for an element */
    public boolean search(int val) {
        return search(root, val);
    }

    /* Function to search for an element recursively */
    public boolean search(BSTNode r, int val) {
        if (r == null) {
            return false;
        }

        if (val < r.getData()) {
            return search(r.getLeft(), val);
        } else if (val > r.getData()) {
            return search(r.getRight(), val);
        } else {
            return true;
        }
    }

    /* Function for inorder traversal */
    public void inorder() {
        inorderTree(root);
    }

    public void inorderTree(BSTNode r) {
        if (r != null) {
            inorderTree(r.getLeft());
            System.out.print(r.getData() + " ");
            inorderTree(r.getRight());
        }
    }

    /* Function for preorder traversal */
    public void preorder() {
        preorderTree(root);
    }

    public void preorderTree(BSTNode r) {
        if (r != null) {
            System.out.print(r.getData() + " ");
            preorderTree(r.getLeft());
            preorderTree(r.getRight());
        }
    }

    /* Function for postorder traversal */
    public void postorder() {
        postorderTree(root);
    }

    public void postorderTree(BSTNode r) {
        if (r != null) {
            postorderTree(r.getLeft());
            postorderTree(r.getRight());
            System.out.print(r.getData() + " ");
        }
    }
}
