package P12.Tugas2;

public class dlsFilm09 {
    nodeFilm09 head;
    int size;

    public dlsFilm09() {
        head = null;
        size = 0;
    }

    boolean isEmpty() {
        return head == null;
    }

    void addFirst(film09 item) {
        if (isEmpty()) {
            head = new nodeFilm09(null, item, null);
        } else {
            nodeFilm09 newNode = new nodeFilm09(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    void addLast(film09 item) {
        if (isEmpty()) {
            addFirst(item);
        } else {
            nodeFilm09 current = head;
            while (current.next != null) {
                current = current.next;
            }
            nodeFilm09 newNode = new nodeFilm09(current, item, null);
            current.next = newNode;
            size++;
        }
    }

    void add(film09 item, int index) throws Exception {
        if (isEmpty()) {
            addFirst(item);
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai indeks di luar batas");
        } else {
            nodeFilm09 current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                nodeFilm09 newNode = new nodeFilm09(null, item, current);
                current.prev = newNode;
                head = newNode;
            } else {
                nodeFilm09 newNode = new nodeFilm09(current.prev, item, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }

    void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Data Film Kosong!");
        } else if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Data Film Kosong!");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        nodeFilm09 current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        } else if (index == 0) {
            removeFirst();
        } else {
            nodeFilm09 current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                current.prev.next = null;
            } else if (current.prev == null) {
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }

    void print() {
        if (!isEmpty()) {
            nodeFilm09 temp = head;
            System.out.printf("%-8s | %-24s | %-10s%n", "ID", "Judul Film", "IMDB Rating");
            while (temp != null) {
                System.out.printf("%-8s | %-24s | %-10s%n", temp.data.iDFilm, temp.data.judulFIlm, temp.data.rating);
                temp = temp.next;
            }
        } else {
            System.out.println("Data Film Kosong!");
        }
    }

    void findID(String id) {
        if (!isEmpty()) {
            nodeFilm09 temp = head;
            while (temp != null) {
                if (temp.data.iDFilm.equals(id)) {
                    System.out.printf("%-8s | %-24s | %-10s%n", "ID", "Judul Film", "IMDB Rating");
                    System.out.printf("%-8s | %-24s | %-10s%n", temp.data.iDFilm, temp.data.judulFIlm,
                            temp.data.rating);
                } else {
                    System.out.println("Data Film Tidak Ditemukan!");
                    return;
                }
                temp = temp.next;
            }
        } else {
            System.out.println("Data Film Kosong!");
        }
    }

    void ratingDesc() {
        if (isEmpty()) {
            System.out.println("Data Film Kosong!");
            return;
        }
        boolean swapped;
        do {
            nodeFilm09 current = head;
            swapped = false;
            while (current.next != null) {
                if (current.data.rating < current.next.data.rating) {
                    film09 temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }

    public int size() {
        return size;
    }
}
