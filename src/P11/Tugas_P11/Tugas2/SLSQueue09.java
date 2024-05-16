package P11.Tugas_P11.Tugas2;

public class SLSQueue09 {
    nodeQueue09 head, tail;

    boolean isEmpty() {
        return head == null;
    }

    void enqueue(mhsQueue09 data) {
        nodeQueue09 ndInput = new nodeQueue09(data, null);
        if (isEmpty()) {
            head = tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian Mahasiswa masih kosong");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    void print() {
        if (isEmpty()) {
            System.out.println("Antrian Mahasiswa masih kosong");
        } else {
            nodeQueue09 tmp = head;
            while (tmp != null) {
                System.out.println("Nama: " + tmp.data.nama);
                System.out.println("NIM: " + tmp.data.nim);
                System.out.println("Tujuan Antri: " + tmp.data.tujuan_Antri + "\n");
                tmp = tmp.next;
            }
        }
    }
}
