import java.util.Arrays;
public class Experiment {
    private Sorter sorter = new Sorter();
    private Searcher searcher = new Searcher();
    public long measureSortTime(int[] arr, String type) {
        int[] copy = Arrays.copyOf(arr, arr.length);
        long start = System.nanoTime();
        if (type.equals("basic")){
            sorter.basicSort(copy);
        }else{
            sorter.advancedSort(copy);
        }
        return System.nanoTime() - start;
    }
    public long measureSearchTime(int[] arr, int target) {
        int[] copy = Arrays.copyOf(arr, arr.length);
        long start = System.nanoTime();
        searcher.search(copy, target);
        return System.nanoTime() - start;
    }
    public void runAllExperiments() {
        int[] sizes = {10, 100, 1000};
        System.out.println("Size\tData type\tBasic(ns)\tAdvanced(ns) \tSearch(ns)");
        for (int size : sizes) {
            int[] randomArr = sorter.generateRandomArray(size);
            long tBasicRandom = measureSortTime(randomArr, "basic");
            long tAdvancedRandom = measureSortTime(randomArr, "advanced");
            int[] sortedForSearchRandom = Arrays.copyOf(randomArr, randomArr.length);
            Arrays.sort(sortedForSearchRandom);
            long tSearchRandom = measureSearchTime(sortedForSearchRandom, 100);
            System.out.println(size + "\t\tRandom\t\t" + tBasicRandom + "\t\t" + tAdvancedRandom + "\t\t\t" + tSearchRandom);
            int[] sortedArr = Arrays.copyOf(randomArr, randomArr.length);
            Arrays.sort(sortedArr);
            long tBasicSorted = measureSortTime(sortedArr,"basic");
            long tAdvancedSorted = measureSortTime(sortedArr,"advanced");
            long tSearchSorted = measureSearchTime(sortedArr,100);
            System.out.println(size + "\t\tSorted\t\t" + tBasicSorted + "\t\t" + tAdvancedSorted + "\t\t\t" + tSearchSorted);
        }
    }
}