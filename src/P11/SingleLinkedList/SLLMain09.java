package P11.SingleLinkedList;

public class SLLMain09 {
    public static void main(String[] args) {
        singleLinkedList09 singLL = new singleLinkedList09();
        singLL.print();
        singLL.addFirst(890);
        singLL.print();
        singLL.addLast(760);
        singLL.print();
        singLL.addFirst(700);
        singLL.print();
        singLL.insertAfter(700, 999);
        singLL.print();
        singLL.insertAt(3, 833);
        singLL.print();
    }
}
