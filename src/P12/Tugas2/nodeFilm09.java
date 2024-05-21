package P12.Tugas2;

public class nodeFilm09 {
    film09 data;
    nodeFilm09 prev, next;

    public nodeFilm09(nodeFilm09 prev, film09 data, nodeFilm09 next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
}
