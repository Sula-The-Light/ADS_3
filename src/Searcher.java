public class Searcher {
    public int search(int[] arr,int target) {
        int L=0, R=arr.length-1;
        while (L<=R) {
            int M = L+(R-L)/2;
            if (arr[M]==target) {
                return M;
            }
            if (arr[M]<target) {
                L=M+1;
            }
            else R=M-1;
        }
        return -1;
    }
}