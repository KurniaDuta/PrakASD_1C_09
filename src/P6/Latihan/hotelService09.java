package P6.Latihan;

public class hotelService09 {
    hotel09 rooms[] = new hotel09[5];
    int idx;

    void tambah(hotel09 H){
        if (idx < rooms.length) {
            rooms[idx] = H;
            idx++;
        } else {
            System.out.println("Data hotel sudah penuh!");
        }
    }

    void tampilAll(){
        for (hotel09 H : rooms) {
            H.tampil();
        }
    }

    void bubleSortHarga(){
        for (int i = 0; i < rooms.length - 1; i++) {
            for (int j = 0; j < rooms.length - i - 1; j++) {
                if (rooms[j].harga > rooms[j + 1].harga) {
                    hotel09 tempRooms = rooms[j];
                    rooms[j] = rooms[j + 1];
                    rooms[j + 1] = tempRooms;
                }
            }
        }
    }

    void selectionSortHarga(){
        for (int i = 0; i < rooms.length - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < rooms.length; j++) {
                if (rooms[j].harga < rooms[idxMin].harga) {
                    idxMin = j;
                }
            }
            hotel09 tempRooms = rooms[idxMin];
            rooms[idxMin] = rooms[i];
            rooms[i] = tempRooms;
        }
    }

    void bubleSortBintang(){
        for (int i = 0; i < rooms.length - 1; i++) {
            for (int j = 0; j < rooms.length - i - 1; j++) {
                if (rooms[j].bintang < rooms[j + 1].bintang) {
                    hotel09 tempRooms = rooms[j];
                    rooms[j] = rooms[j + 1];
                    rooms[j + 1] = tempRooms;
                }
            }
        }
    }

    void selectionSortBintang(){
        for (int i = 0; i < rooms.length - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < rooms.length; j++) {
                if (rooms[j].bintang > rooms[idxMin].bintang) {
                    idxMin = j;
                }
            }
            hotel09 tempRooms = rooms[idxMin];
            rooms[idxMin] = rooms[i];
            rooms[i] = tempRooms;
        }
    }
}
