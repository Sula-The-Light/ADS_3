import java.util.Random;
public class Sorter {
    public void Bubble(int[] arr) {
        int n = arr.length;
        for (int i=0; i<n-1; i++) {
            for (int j=0; j<n-i-1; j++) {
                if (arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public void Merge_Sort(int[] arr) {
        Sort_Process(arr, 0, arr.length - 1);
    }
    private void Sort_Process(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            Sort_Process(arr, left, mid);
            Sort_Process(arr, mid+1, right);
            MergeSort_Steps(arr, left, mid, right);
        }
    }
    private void MergeSort_Steps(int[] arr, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for (int i = 0; i < n1; ++i) {
            L[i] = arr[left + i];
        }
        for (int j = 0; j < n2; ++j) {
            R[j] = arr[middle + 1 + j];
        }
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) arr[k++] = L[i++];
            else arr[k++] = R[j++];
        }
        while (i < n1) {
            arr[k++] = L[i++];
        }
        while (j < n2) {
            arr[k++] = R[j++];
        }
    }
    public int[] GenRandomArr(int size) {
        Random rd = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) arr[i] = rd.nextInt(100000);
        return arr;
    }
    public void printArray(int[] arr) {
        for (int i : arr) System.out.print(i + " ");
        System.out.println();
    }
}