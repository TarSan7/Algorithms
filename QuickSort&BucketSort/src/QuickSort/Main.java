package QuickSort;

public class Main {
    public static void main(String[] args) {
        QuickSort qs = new QuickSort(new int[]{-1, 7, 1, 8, 3, 2, 66, 12});
        qs.startSort();
        qs.printMass();

        QuickSort qs1 = new QuickSort(new int[]{150, 35, 77, 2, 90});
        qs1.startSort();
        qs1.printMass();

        QuickSort qs2 = new QuickSort(new int[]{0, 22, 61, 87, 53, 9, -4});
        qs2.startSort();
        qs2.printMass();

        QuickSort qs3 = new QuickSort(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1});
        qs3.startSort();
        qs3.printMass();
    }
}
