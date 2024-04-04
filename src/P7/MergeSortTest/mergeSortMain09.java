package P7.MergeSortTest;

public class mergeSortMain09 {
    public static void main(String[] args) {
        int data[] = { 10, 40, 30, 50, 70, 20, 100, 90 };
        System.out.println("Sorting dengan Merge Sort");

        mergeSorting09 mergeSort = new mergeSorting09();
        System.out.println("Data Awal");
        mergeSort.printArray(data);
        System.out.println("Data Setelah diurutkan");
        mergeSort.mergeSort(data);
        mergeSort.printArray(data);
    }
}
