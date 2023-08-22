import java.util.HashMap;
import java.util.Map;

public class Solution {
//            +-----------------------------------------------+-----------------+----------------+---------------------------------------------------------+
//            | Problem                                       | Time Complexity| Space Complexity| Short Description                                       |
//            +-----------------------------------------------+-----------------+----------------+---------------------------------------------------------+
//            | Two Sum (Easy) - Arrays, Hash Tables          | O(n)            | O(n)           | Use a hash map to store complement and current index.    |
//            | Add Two Numbers (Medium) - Linked Lists       | O(n)            | O(1)           | Traverse both lists simultaneously, handle carryover.    |
//            | Longest Substring Without Repeating Characters| O(n)            | O(min(n, m))   | Use sliding window and hash set to track characters.     |
//            | Median of Two Sorted Arrays (Hard) - Binary   | O(log(min(m,n)))| O(1)           | Apply binary search on the smaller array.                |
//            | Longest Palindromic Substring (Medium) - Str. | O(n^2)          | O(1)           | Expand around center for each character in the string.   |
//            | ZigZag Conversion (Medium) - Strings          | O(n)            | O(n)           | Iterate through the string and use min(numRows, len(s)). |
//            | Container With Most Water (Medium) - Arrays   | O(n)            | O(1)           | Use two pointers, move the one pointing to the smaller.  |
//            | Integer to Roman (Medium) - Math              | O(1)            | O(1)           | Hardcode the values and symbols, iterate through them.   |
//            | 3Sum (Medium) - Arrays                        | O(n^2)          | O(n)           | Sort array, then use two pointers technique.             |
//            | Longest Common Prefix (Easy) - Strings        | O(S)            | O(1)           | Compare characters across all strings in a row-wise.     |
//            | Climbing Stairs (Easy) - DP                   | O(n)            | O(n)           | Use Fibonacci sequence or DP to find ways to climb.      |
//            | Coin Change (Medium) - DP                     | O(nm)           | O(n)           | Use DP to find minimum coins for each value up to amount.|
//            | Longest Increasing Subsequence (Med.)         | O(n^2)          | O(n)           | Use DP to find longest increasing subsequence.           |
//            | Word Break (Medium) - DP                      | O(n^2)          | O(n)           | Use DP to check if the word can be segmented.            |
//            | Minimum Path Sum (Medium) - DP                | O(mn)           | O(n)           | Use DP to find the minimum path sum in a grid.           |
//            | Validate Binary Search Tree (Medium) - Trees  | O(n)            | O(n)           | In-order traversal to check if it's a valid BST.         |
//            | Symmetric Tree (Easy) - Trees                 | O(n)            | O(n)           | Use recursion or iteration to check symmetry.            |
//            | Binary Tree Level Order Traversal (Med.)      | O(n)            | O(n)           | Use BFS to traverse levels of the tree.                  |
//            | Clone Graph (Medium) - Graphs                 | O(n)            | O(n)           | Use DFS or BFS to clone the graph.                       |
//            | Word Ladder (Medium) - Graphs, BFS            | O(M * N)        | O(M * N)       | Use BFS to find the shortest transformation sequence.    |
//            | LRU Cache (Medium) - Design                   | O(1)            | O(capacity)    | Implement using hash map and doubly linked list.         |
//            | Serialize and Deserialize Binary Tree (Hard)  | O(n)            | O(n)           | Use pre-order traversal for serialization.               |
//            | Design Twitter (Medium) - Design              | O(U + F)        | O(U + T + F)   | Implement using hash maps, heaps, and linked lists.      |
//            | Design Search Autocomplete System (Hard)      | O(k * l)        | O(n * k)       | Use Trie and Priority Queue for efficient search.        |
//            | Regular Expression Matching (Hard) - Str, DP  | O(m * n)        | O(m * n)       | Use DP to match regular expressions.                     |
//            | Find Minimum in Rotated Sorted Array (Med.)   | O(log n)        | O(1)           | Use binary search to find the minimum element.           |
//            | Top K Frequent Elements (Medium) - Heap       | O(n log k)      | O(n)           | Use a min-heap to find the top K frequent elements.      |
//            | Maximal Rectangle (Hard) - Stack, DP          | O(mn)           | O(n)           | Use DP and stack to find the largest rectangle.          |
//            | The Skyline Problem (Hard) - Divide & Conq.   | O(n log n)      | O(n)           | Use divide and conquer to find the skyline.              |
//            | Design In-Memory File System (Hard) - Design  | O(path)         | O(n + f)       | Implement using Trie-like data structure.                |
//            +-----------------------------------------------+-----------------+----------------+---------------------------------------------------------+
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }

        throw new IllegalArgumentException("No match found!");
    }
}