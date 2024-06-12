package P15;

public class graph09 {
    int vertex;
    doubleLinkedList09 list[];

    public graph09(int v) {
        vertex = v;
        list = new doubleLinkedList09[v];
        for (int i = 0; i < vertex; i++) {
            list[i] = new doubleLinkedList09();
        }
    }

    public void addEdge(int asal, int tujuan, int jarak) {
        list[asal].addFirst(tujuan, jarak);
        // list[tujuan].addFirst(asal, jarak);
    }

    public void degree(int asal) throws Exception {
        int totalIn = 0, totalOut = list[asal].size();

        for (int i = 0; i < vertex; i++) {
            if (i != asal) {
                for (int j = 0; j < list[i].size(); j++) {
                    if (list[i].getJarak(j) == asal) {
                        totalIn++;
                    }
                }
            }
        }

        System.out.println("InDegree dari Gedung " + (char) ('A' + asal) + ": " + totalIn);
        System.out.println("OutDegree dari Gedung " + (char) ('A' + asal) + ": " + totalOut);
        System.out.println("Degree dari Gedung " + (char) ('A' + asal) + ": " + (totalIn + totalOut));
    }

    public void removeEdge(int asal, int tujuan) throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (i == tujuan) {
                list[asal].remove(tujuan);
            }
        }
    }

    public void removeAllEdges() {
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println("Graf berhasil dikosongkan");
    }

    public void printGraph() throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0) {
                System.out.println("Gedung " + (char) ('A' + i) + " terhubung dengan: ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print((char) ('A' + list[i].get(j)) + " (" + list[i].getJarak(j) + " m), ");
                }
                System.out.println("");
            }
        }
        System.out.println("");
    }

    public void hasPath(int start, int end) throws Exception {
        for (int i = 0; i < list[start].size(); i++) {
            if (list[start].get(i) == end) {
                System.out.println("Gedung " + (char) ('A' + start) + " dan " + (char) ('A' + end) + " bertetangga");
                return;
            }
        }
        System.out.println("Gedung " + (char) ('A' + start) + " dan " + (char) ('A' + end) + " tidak bertetangga");
    }

    public void updateEdge(int asal, int tujuan, int jarakBaru) throws Exception {
        boolean updated = false;
        for (int i = 0; i < list[asal].size(); i++) {
            if (list[asal].get(i) == tujuan) {
                list[asal].updateJarak(i, jarakBaru);
                updated = true;
                break;
            }
        }
        if (updated) {
            System.out.println("Jarak dari Gedung " + (char) ('A' + asal) + " ke Gedung " + (char) ('A' + tujuan)
                    + " telah diperbarui menjadi " + jarakBaru + " m.");
        } else {
            System.out.println("Edge dari Gedung " + (char) ('A' + asal) + " ke Gedung " + (char) ('A' + tujuan)
                    + " tidak ditemukan.");
        }
    }
}
