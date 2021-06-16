package QuickSort;

public class QuickSort {
    private int array[];

    QuickSort(int[] mas){
        array = mas;
    }

    int partition(int left, int right, int pivot){
        int leftEl = left - 1;
        int rightEl = right;
        while(true){
            while(array[++leftEl] < pivot) ;
            while(rightEl > 0 && array[--rightEl] > pivot) ;
            if(leftEl >= rightEl)
                break;
            else {
                swap(leftEl, rightEl);
            }
        }
        swap(leftEl, right);
        return leftEl;
    }

    void startSort(){
        quickSort(0, array.length - 1);
    }

    void quickSort(int left, int right){
        if(right - left <= 0){
            return ;
        } else{
            int pivot = array[right];
            int partition = partition(left, right, pivot);
            quickSort(left, partition - 1);
            quickSort(partition + 1, right);
        }
    }

    void swap(int l, int r){
        int temp = array[l];
        array[l] = array[r];
        array[r] = temp;
    }

    void printMass(){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
