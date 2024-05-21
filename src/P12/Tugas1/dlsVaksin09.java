package P12.Tugas1;

public class dlsVaksin09 {
    nodeVaksin09 head;
    int size;

    public dlsVaksin09() {
        head = null;
        size = 0;
    }

    boolean isEmpty() {
        return head == null;
    }

    void addData(vaksin09 item) {
        if (isEmpty()) {
            head = new nodeVaksin09(null, item, null);
        } else {
            nodeVaksin09 current = head;
            while (current.next != null) {
                current = current.next;
            }
            nodeVaksin09 newNode = new nodeVaksin09(current, item, null);
            current.next = newNode;
        }
        size++;
    }

    int size() {
        return size;
    }

    void removeData() throws Exception {
        if (isEmpty()) {
            throw new Exception("Data Antrian Pasien Kosong!");
        } else {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            size--;
        }
    }

    void print() {
        if (!isEmpty()) {
            nodeVaksin09 temp = head;
            System.out.printf("%-5s | %-20s%n", "No", "Nama");
            while (temp != null) {
                System.out.printf("%-5s | %-20s%n", temp.data.nomor, temp.data.nama);
                temp = temp.next;
            }
        } else {
            System.out.println("Data Antrian Pasien Kosong!");
        }
    }

    vaksin09 getDataRemove() throws Exception {
        if (isEmpty()) {
            throw new Exception("Data Antrian Pasien Kosong!");
        }
        return head.data;
    }
}
