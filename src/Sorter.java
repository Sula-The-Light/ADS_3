import java.util.Random;
public class Sorter {
    public void basicSort(int[] arr) {
        int n = arr.length;
        for (int i=0; i<n-1; i++) {
            for (int j=0; j<n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public void advancedSort(int[] arr) {
        sortProcess(arr, 0, arr.length-1);
    }
    private void sortProcess(int[] arr, int L, int R) {
        if (L<R) {
            int M = L+(R-L)/2;
            sortProcess(arr,L,M);
            sortProcess(arr, M+1, R);
            merge(arr,L,M,R);
        }
    }
    private void merge(int[] arr, int l, int m, int r) {
        int n1 = m-l+1;
        int n2 = r-m;
        int[] L = new int[n1];
        int[] R = new int[n2];
        System.arraycopy(arr, l, L, 0, n1);
        System.arraycopy(arr, m + 1, R, 0, n2);
        int i=0, j=0, k=l;
        while (i<n1 && j<n2) {
            if (L[i] <= R[j]){
                arr[k++] = L[i++];
            }else{
                arr[k++] = R[j++];
            }
        }
        while(i < n1){
            arr[k++] = L[i++];
        }
        while(j < n2){
            arr[k++] = R[j++];
        }
    }
    public int[] generateRandomArray(int size) {
        Random rd = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++)
            arr[i] = rd.nextInt(10000);
        return arr;
    }
    public void printArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}