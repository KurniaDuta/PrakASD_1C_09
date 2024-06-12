package P15;

import org.w3c.dom.Node;

public class doubleLinkedList09 {
    node09 head;
    int size;

    public doubleLinkedList09() {
        head = null;
        size = 0;
    }

    boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int item, int jarak) {
        if (isEmpty()) {
            head = new node09(null, item, jarak, null);
        } else {
            node09 newNode = new node09(null, item, jarak, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public int getJarak(int index) throws Exception {
        if (index < 0 || isEmpty() || index >= size) {
            throw new Exception("Invalid index value");
        }
        node09 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.jarak;
    }

    public int get(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Invalid index value");
        }
        node09 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public void remove(int index) {
        node09 current = head;
        while (current != null) {
            if (current.jarak == index) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                }
                break;
            }
            current = current.next;
        }
        size--;
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void updateJarak(int index, int jarakBaru) {
        node09 current = head;
        int count = 0;
        while (current != null) {
            if (count == index) {
                current.jarak = jarakBaru;
                return;
            }
            count++;
            current = current.next;
        }
    }
}
