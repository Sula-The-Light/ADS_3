Assignment 3: Sorting and Searching Algorithm Analysis System

Name : Sultan Yesmagzam

Group : IT-2502

--------------------------------------------------------------------------

In Category A: Basic Sorting , i have picked "Bubble Sort" as an easy and fast sorting algorithm

Time Complexity: $O(n^2)$

The main thing I used in this and further tasks were arrays. For example , I used one in "Sorter" class. In "Sorter", in particular , "Bubble Sort" , "int[] arr" was used as the main container for my sortable numbers. Nested for loops are also used here. The outer loop is responsible for the number of passes through the array, and the inner loop is responsible for comparing neighboring elements. $if (arr[j] > arr[j+1])$ in bubble sort is the "heart" of the algorithm, determining the order of the elements.
In other words , Bubble Sort is a simple comparison-based algorithm that repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order

--------------------------------------------------------------------------

In Category B: Advanced Sorting , I found out that "Merge Sort" would be a nice way to sort my data and here's why

Time Complexity: $O(n \log n)$

My auxiliary arrays , $L$ and $R$ in the Merge Sort method , were used to split the source array into 2 parts. This is necessary for the implementation of the Divide and Conquer strategy. Also , in Merge Sort, the $while$ loop was used to compare elements from the left and right halves and insert them correctly back into the main array. It works as long as there are elements left in both parts. Moreover ,  $for$ loops were used to transfer data from the main array to temporary arrays $L$ and $R$ , so it's just a manual copying. To say simply , this is a highly efficient, stable, divide-and-conquer algorithm. It divides the input array into 2 halves, recursively sorts them, and then merges the sorted halves

--------------------------------------------------------------------------

In Category C: Searching , I had to choose "Binary Search" if i wanted to sort quieries faster

Time Complexity: $O(\log n)$

In the code, we initialize them as follows: 

$int L = 0, R = arr.length - 1;$

The meaning is , they define a "search box" , at the very beginning, the window is the entire array.

Logic: Binary search only works in a sorted array. If we are looking for a number, we don't need to look everywhere, we just need to narrow these "gates" (L and R) until the number we are looking for is in the center, or until the gate closes (there is no number).That is an efficient search algorithm that finds the position of a target value within a **sorted** array by repeatedly dividing the search interval in half

--------------------------------------------------------------------------

3. Experiment Results

Note: The times below are measured in nanoseconds (ns)

| Size | Data Type | Basic Sort: Bubble (ns) | Advanced Sort: Merge (ns) | Search: Binary (ns) |
| :--- | :--- | :--- | :--- | :--- |
| 10 | Random | 10100 | 18000 | 4000 |
| 10 | Sorted | 4600 | 11900 | 1800 |
| 100 | Random | 331500 | 99100 | 2500 |
| 100 | Sorted | 230800 | 101600 | 1600 |
| 1000 | Random | 18261600 | 947400 | 2200 |
| 1000 | Sorted | 2879600 | 206100 | 3500 |

---

4. Reflection and Analysis

What I learned about algorithm efficiency:
Through this project, I clearly observed how theoretical Big-O complexity translates into real-world execution time. While simple algorithms are easy to implement, their performance degrades rapidly as the dataset grows. Choosing the right algorithm is crucial for system scalability. I also learned why Binary Search is so powerful—it can find an element almost instantly, but it strictly requires the data to be pre-sorted.

Differences between theoretical and practical performance:
In theory, Merge Sort ($O(n \log n)$) is always better than Bubble Sort ($O(n^2)$). However, in my practical experiments, I noticed that for very small arrays (e.g., $N=10$), Bubble Sort sometimes outperformed Merge Sort. This is due to the practical overhead of Merge Sort, which requires additional memory allocation and recursive function calls. However, as the array size increased to 1000 elements, Merge Sort demonstrated its true efficiency, outperforming Bubble Sort by a massive margin.

Challenges faced during implementation:
One of the main challenges was ensuring a fair testing environment. Initially, running a sorting algorithm would modify the original array, which ruined the conditions for the second sorting algorithm. To solve this, I used `Arrays.copyOf()` to ensure each algorithm operated on a fresh, identical set of data. Additionally, I had to ensure the array was explicitly sorted before passing it to the Binary Search method to prevent inaccurate search results.

---

5. Screenshots

![Image alt](https://github.com/Sula-The-Light/ADS_3/blob/main/Снимок%20экрана%202026-04-28%20105835.png)


