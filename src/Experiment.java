import java.util.Arrays;
public class Experiment {
    private Sorter sorter = new Sorter();
    private Searcher searcher = new Searcher();
    public long Sort_Time(int[] arr, String type) {
        int[] copy = Arrays.copyOf(arr, arr.length);
        long start = System.nanoTime();
        if (type.equals("baza")) {
            sorter.Bubble(copy);
        } else {
            sorter.Merge_Sort(copy);
        }
        return System.nanoTime() - start;
    }
    public long Search_Time(int[] arr, int target) {
        long start = System.nanoTime();
        searcher.SEARCH(arr, target);
        return System.nanoTime() - start;
    }
    public void runAll() {
        int[] sizes = {9, 99, 999 , 9999 , 99999};
        System.out.println("Size \t Type\t Basic (ns) \t Advanced (ns)");
        for (int size : sizes) {
            int[] randomArr = sorter.GenRandomArr(size);
            long t1 = Sort_Time(randomArr, "basic");
            long t2 = Sort_Time(randomArr, "advanced");
            System.out.println(size + "\tRandom\t" + t1 + "\t\t" + t2);
        }
    }
}