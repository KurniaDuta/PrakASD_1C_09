package P15;

public class node09 {
    int data;
    node09 prev, next;
    int jarak;

    node09(node09 prev, int data, int jarak, node09 next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
        this.jarak = jarak;
    }
}
