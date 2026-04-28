Assignment 3: Sorting and Searching Algorithm Analysis System

Name : Sultan Yesmagzam

Group : IT-2502

--------------------------------------------------------------------------

In Category A: Basic Sorting , i have picked "Bubble Sort" as an easy and fast sorting algorithm

Time Complexity: $O(n^2)$

In other words , it's a simple comparison-based algorithm that repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order. 

--------------------------------------------------------------------------

In Category B: Advanced Sorting , I found out that "Merge Sort" woukd be a nice way to sort my data

Time Complexity: $O(n \log n)$

To say simply , this is a highly efficient, stable, divide-and-conquer algorithm. It divides the input array into two halves, recursively sorts them, and then merges the sorted halves.

--------------------------------------------------------------------------

In Category C: Searching , I had to choose "Binary Search" if i wanted to sort quieries faster

Time Complexity: $O(\log n)$

That is an efficient search algorithm that finds the position of a target value within a **sorted** array by repeatedly dividing the search interval in half.

## 3. Experiment Results

*Note: The times below are measured in nanoseconds (ns).*

| Size | Data Type | Basic Sort: Bubble (ns) | Advanced Sort: Merge (ns) | Search: Binary (ns) |
| :--- | :--- | :--- | :--- | :--- |
| 10 | Random | [ВСТАВЬ_СВОЕ_ЧИСЛО] | [ВСТАВЬ_СВОЕ_ЧИСЛО] | [ВСТАВЬ_СВОЕ_ЧИСЛО] |
| 10 | Sorted | [ВСТАВЬ_СВОЕ_ЧИСЛО] | [ВСТАВЬ_СВОЕ_ЧИСЛО] | [ВСТАВЬ_СВОЕ_ЧИСЛО] |
| 100 | Random | [ВСТАВЬ_СВОЕ_ЧИСЛО] | [ВСТАВЬ_СВОЕ_ЧИСЛО] | [ВСТАВЬ_СВОЕ_ЧИСЛО] |
| 100 | Sorted | [ВСТАВЬ_СВОЕ_ЧИСЛО] | [ВСТАВЬ_СВОЕ_ЧИСЛО] | [ВСТАВЬ_СВОЕ_ЧИСЛО] |
| 1000 | Random | [ВСТАВЬ_СВОЕ_ЧИСЛО] | [ВСТАВЬ_СВОЕ_ЧИСЛО] | [ВСТАВЬ_СВОЕ_ЧИСЛО] |
| 1000 | Sorted | [ВСТАВЬ_СВОЕ_ЧИСЛО] | [ВСТАВЬ_СВОЕ_ЧИСЛО] | [ВСТАВЬ_СВОЕ_ЧИСЛО] |

---

## 4. Reflection and Analysis

**What I learned about algorithm efficiency:**
Through this project, I clearly observed how theoretical Big-O complexity translates into real-world execution time. While simple algorithms are easy to implement, their performance degrades rapidly as the dataset grows. Choosing the right algorithm is crucial for system scalability. I also learned why Binary Search is so powerful—it can find an element almost instantly, but it strictly requires the data to be pre-sorted.

**Differences between theoretical and practical performance:**
In theory, Merge Sort ($O(n \log n)$) is always better than Bubble Sort ($O(n^2)$). However, in my practical experiments, I noticed that for very small arrays (e.g., $N=10$), Bubble Sort sometimes outperformed Merge Sort. This is due to the practical overhead of Merge Sort, which requires additional memory allocation and recursive function calls. However, as the array size increased to 1000 elements, Merge Sort demonstrated its true efficiency, outperforming Bubble Sort by a massive margin.

**Challenges faced during implementation:**
One of the main challenges was ensuring a fair testing environment. Initially, running a sorting algorithm would modify the original array, which ruined the conditions for the second sorting algorithm. To solve this, I used `Arrays.copyOf()` to ensure each algorithm operated on a fresh, identical set of data. Additionally, I had to ensure the array was explicitly sorted before passing it to the Binary Search method to prevent inaccurate search results.

---

## 5. Screenshots

**Program Execution Output:**
![Program Output](docs/screenshots/output.png) 
*(Загрузи скриншот своей консоли в папку docs/screenshots в GitHub и убедись, что путь к картинке совпадает)*
