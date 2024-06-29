package Labs.BinarySearchTree;

public class BSMain {
    public static void main(String[] args) {
        BSTree tree = new BSTree();
        tree.insert(31);
        tree.insert(48);
        tree.insert(78);
        tree.insert(20);
        tree.insert(34);
        tree.insert(54);
        tree.insert(92);
        tree.insert(50);
        tree.inorder();
    }
}
