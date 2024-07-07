package CATII.Trees;

import CATII.Trees.Problem_a.BSTree;

// Problem b:  Test class as per the Binary Tree Lab

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

        System.out.println("\nInorder traversal:");
        tree.inorder();

        System.out.println("\nPreorder traversal:");
        tree.preorder();

        System.out.println("\nPostorder traversal:");
        tree.postorder();

        System.out.println("\nSearching for value 50:");
        System.out.println(tree.search(50) ? "Found 50" : "50 not found");

        System.out.println("\nFinding minimum and maximum values:");
        System.out.println("Minimum value: " + tree.minValue(tree.root));
        System.out.println("Maximum value: " + tree.maxValue(tree.root));

        System.out.println("\nDeleting value 34:");
        tree.delete(34);
        System.out.println("Inorder traversal after deletion:");
        tree.inorder();
    }
}
