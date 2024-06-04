package P13;

public class binaryTreeArrayMain09 {
    public static void main(String[] args) {
        binaryTreeArray09 bta = new binaryTreeArray09();
        int[] data =  {6,4,8,3,5,7,9,0,0,0};
        int idxLast = 6;

        bta.populateData(data, idxLast);
        bta.add(2);
        System.out.print("InOrder Traversal: ");
        bta.traverseInOrder(0);
        System.out.println("");
        System.out.print("PreOrder Traversal: ");
        bta.traversePreOrder(0);
        System.out.println("");
        System.out.print("PostOrder Traversal: ");
        bta.traversePostOrder(0);
    }
}
