import java.util.HashMap;
import java.util.Map;

public class Solution {
//            +---------------------------------------------------------------+-----------------+-----------------+----------------------------------------------------------+
//            | Problem                                                       | Time Complexity | Space Complexity| Short Description                                        |
//            +---------------------------------------------------------------+-----------------+-----------------+----------------------------------------------------------+
//            | Two Sum (Easy)                                                | O(n)            | O(n)            | Use a hash map to store complement and current index.    |
//            | Median of Two Sorted Arrays (Hard)                            | O(log(min(m,n)))| O(1)            | Apply binary search on the smaller array.                |
//            | Longest Substring Without Repeating Characters (Medium)       | O(n)            | O(min(n, m))    | Use sliding window and hash set to track characters.     |
//            | LRU Cache (Medium)                                            | O(1)            | O(capacity)     | Implement using hash map and doubly linked list.         |
//            | Merge Intervals (Medium)                                      | O(n log n)      | O(1)            | Sort by start time, then merge overlapping intervals.    |
//            | Maximum Subarray (Easy)                                       | O(n)            | O(1)            | Use Kadane's algorithm to find the maximum subarray sum. |
//            | Search in Rotated Sorted Array (Medium)                       | O(log n)        | O(1)            | Use binary search with adjustments for rotation.         |
//            | Validate Binary Search Tree (Medium)                          | O(n)            | O(n)            | In-order traversal to check if it's a valid BST.         |
//            | Serialize and Deserialize Binary Tree (Hard)                  | O(n)            | O(n)            | Use pre-order traversal for serialization.               |
//            | Regular Expression Matching (Hard)                            | O(m * n)        | O(m * n)        | Use DP to match regular expressions.                     |
//            | Design Twitter (Hard)                                         | O(U + F)        | O(U + T + F)    | Implement using hash maps, heaps, and linked lists.      |
//            | Implement Trie (Prefix Tree) (Medium)                         | O(m)            | O(m)            | Implement Trie data structure for efficient search.      |
//            | Database Connection Pool (Hard)                               | Varies          | Varies          | Implement using a pool to manage database connections.   |
//            | Print in Order (Easy)                                         | O(n)            | O(1)            | Use synchronization to ensure printing in order.         |
//            | Design Parking System (Easy)                                  | O(1)            | O(1)            | Implement using counters for different car sizes.        |
//            | Clone Graph (Medium)                                          | O(n)            | O(n)            | Use DFS or BFS to clone the graph.                       |
//            | Course Schedule (Medium)                                      | O(V + E)        | O(V + E)        | Use topological sort to find a valid course schedule.    |
//            | Binary Tree Inorder Traversal (Medium)                        | O(n)            | O(n)            | Use recursion or iteration for in-order traversal.       |
//            | Binary Tree Level Order Traversal (Medium)                    | O(n)            | O(n)            | Use BFS to traverse levels of the tree.                  |
//            | Climbing Stairs (Easy)                                        | O(n)            | O(n)            | Use Fibonacci sequence or DP to find ways to climb.      |
//            | Coin Change (Medium)                                          | O(nm)           | O(n)            | Use DP to find minimum coins for each value up to amount.|
//            | Find First and Last Position of Element in Sorted Array (Med.)| O(log n)        | O(1)            | Use binary search to find the start and end positions.   |
//            | Top K Frequent Elements (Medium)                              | O(n log k)      | O(n)            | Use a min-heap to find the top K frequent elements.      |
//            | Single Number (Easy)                                          | O(n)            | O(1)            | Use XOR to find the single number.                       |
//            | Pow(x, n) (Medium)                                            | O(log n)        | O(1)            | Use binary exponentiation to calculate power.            |
//            | Majority Element (Easy)                                       | O(n)            | O(1)            | Use Boyer-Moore Voting Algorithm to find majority.       |
//            | Swap Nodes in Pairs (Medium)                                  | O(n)            | O(1)            | Swap adjacent nodes in a linked list.                    |
//            | Generate Parentheses (Medium)                                 | O(4^n / sqrt(n))| O(n)            | Use backtracking to generate all valid parentheses.      |
//            | Task Scheduler (Medium)                                       | O(n)            | O(1)            | Schedule tasks with cooling periods.                     |
//            | Kth Largest Element in an Array (Medium)                      | O(n)            | O(1)            | Use QuickSelect or a min-heap to find the Kth largest.   |
//            +---------------------------------------------------------------+-----------------+-----------------+----------------------------------------------------------+
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