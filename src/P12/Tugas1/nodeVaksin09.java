package P12.Tugas1;

public class nodeVaksin09 {
    vaksin09 data;
    nodeVaksin09 prev, next;

    public nodeVaksin09(nodeVaksin09 prev, vaksin09 data, nodeVaksin09 next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
}
