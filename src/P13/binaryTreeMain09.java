package P13;

public class binaryTreeMain09 {
    public static void main(String[] args) {
        binaryTree09 bt = new binaryTree09();
        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
        bt.add(10);
        bt.add(15);
        System.out.println("PreOrder Traversal: ");
        bt.traversePreOrder(bt.root);
        System.out.println();
        System.out.println("InOrder Traversal: ");
        bt.traverseInOrder(bt.root);
        System.out.println();
        System.out.println("PostOrder Traversal: ");
        bt.traversePostOrder(bt.root);
        System.out.println();
        System.out.println("Find Note: " + bt.find(5));
        System.out.println("Delete Node 8 ");
        bt.delete(8);
        System.out.println("PreOrder Traversal: ");
        bt.traversePreOrder(bt.root);
        System.out.println();
    }
}
