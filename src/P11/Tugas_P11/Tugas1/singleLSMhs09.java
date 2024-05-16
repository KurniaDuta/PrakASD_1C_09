package P11.Tugas_P11.Tugas1;

public class singleLSMhs09 {
    nodeMhs09 head, tail;

    boolean isEmpty() {
        return head == null;
    }

    void print() {
        if (!isEmpty()) {
            nodeMhs09 tmp = head;
            System.out.println("Data Mahasiswa: ");
            while (tmp != null) {
                System.out.println("NIM: " + tmp.data.nim + "\nNama: " + tmp.data.nama + "\n");
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked List Kosong!");
        }
    }

    void addFirst(mahasiswa09 input) {
        nodeMhs09 ndInput = new nodeMhs09(input, null);
        if (isEmpty()) {
            head = tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    void addLast(mahasiswa09 input) {
        nodeMhs09 ndInput = new nodeMhs09(input, null);
        if (isEmpty()) {
            head = tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    void insertAfter(String key, mahasiswa09 input) {
        nodeMhs09 ndInput = new nodeMhs09(input, null);
        nodeMhs09 temp = head;
        do {
            if (temp.data.nim.equals(key)) {
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

    void insertAt(int index, mahasiswa09 input) {
        if (index < 0) {
            System.out.println("Index Tidak Valid!");
        } else if (index == 0) {
            addFirst(input);
        } else {
            nodeMhs09 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new nodeMhs09(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }
}
