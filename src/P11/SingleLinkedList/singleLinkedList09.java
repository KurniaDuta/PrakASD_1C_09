package P11.SingleLinkedList;

public class singleLinkedList09 {
    node09 head, tail;

    boolean isEmpty() {
        return head == null;
    }

    void print() {
        if (!isEmpty()) {
            node09 tmp = head;
            System.out.print("Isi Linked List: ");
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked List Kosong!");
        }
    }

    void addFirst(int input) {
        node09 ndInput = new node09(input, null);
        if (isEmpty()) {
            head = tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    void addLast(int input) {
        node09 ndInput = new node09(input, null);
        if (!isEmpty()) {
            tail.next = ndInput;
            tail = ndInput;
        } else {
            head = ndInput;
            tail = ndInput;
        }
    }

    void insertAfter(int key, int input) {
        node09 ndInput = new node09(input, null);
        node09 temp = head;
        do {
            if (temp.data == key) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }

    void insertAt(int index, int input) {
        if (index < 0) {
            System.out.println("Index Tidak Valid!");
        } else if(index == 0) {
            addFirst(input);
        } else {
            node09 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new node09(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }
}
