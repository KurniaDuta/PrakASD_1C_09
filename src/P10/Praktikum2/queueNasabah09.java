package P10.Praktikum2;

public class queueNasabah09 {
    nasabah09[] data;
    int front;
    int rear;
    int size;
    int max;

    public queueNasabah09(int n) {
        max = n;
        data = new nasabah09[max];
        size = 0;
        front = rear = -1;
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

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Elemen terdepan: " + data[front].noRek + " " + data[front].nama + " "
                    + data[front].alamat + " " + data[front].umur + " " + data[front].saldo);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(data[i].noRek + " " + data[i].nama + " " + data[i].alamat + " "
                    + data[i].umur + " " + data[i].saldo);
                i = (i + 1) % max;
            }
            System.out.print(data[i].noRek + " " + data[i].nama + " " + data[i].alamat + " "
                    + data[i].umur + " " + data[i].saldo);
            System.out.println("\nJumlah elemen = " + size);
        }
    }

    public void enqueue(nasabah09 dt) {
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
        data[rear] = dt;
        size++;
    }

    public nasabah09 dequeue() {
        nasabah09 dt = new nasabah09();
        if (isEmpty()) {
            System.exit(0);
        } else {
            dt = data[front];
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

    public void peekRear() {
        if (!isEmpty()) {
            System.out.println("Elemen terbelakang: " + data[rear].noRek + " " + data[rear].nama + " "
                    + data[rear].alamat + " " + data[rear].umur + " " + data[rear].saldo);
        } else {
            System.out.println("Queue masih kosong");
        }
    }
}
