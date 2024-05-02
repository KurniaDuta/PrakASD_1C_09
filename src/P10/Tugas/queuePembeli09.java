package P10.Tugas;

public class queuePembeli09 {
    pembeli09[] antrian;
    int front;
    int rear;
    int max;
    int size;

    public queuePembeli09(int n) {
        max = n;
        antrian = new pembeli09[max];
        front = rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void enqueue(pembeli09 antri) {
        if (isFull()) {
            System.out.println("Queue penuh");
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
        }
        antrian[rear] = antri;
        size++;
    }

    public pembeli09 dequeue() {
        pembeli09 dt = new pembeli09();
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            dt = antrian[front];
            size--;
            if (isEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return dt;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(antrian[i].nama + " " + antrian[i].noHP);
                i = (i + 1) % max;
            }
            System.out.println(antrian[i].nama + " " + antrian[i].noHP);
            System.out.println("\nJumlah elemen = " + size);
        }
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Elemen terdepan: " + antrian[front].nama + " " + antrian[front].noHP);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void peekRear() {
        if (!isEmpty()) {
            System.out.println("Elemen terbelakang: " + antrian[rear].nama + " " + antrian[rear].noHP);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void peekPosition(String nama) {
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
            return;
        }
        int position = 1;
        int i = front;
        while (i != rear) {
            if (antrian[i].nama.equalsIgnoreCase(nama)) {
                System.out.println(antrian[i].nama + " berada di posisi antrian ke-" + position);
                return;
            }
            position++;
            i = (i + 1) % max;
        }
        if (antrian[rear].nama.equals(nama)) {
            System.out.println(nama + " berada di posisi antrian ke-" + position);
            return;
        } else {
            System.out.println(nama + " tidak ditemukan dalam antrian");
        }
    }

    public void daftarPembeli() {
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            for (pembeli09 pembeli : antrian) {
                System.out.println(pembeli.nama + " " + pembeli.noHP);
            }
        }

    }
}
