import java.util.HashMap;
import java.util.Map;

public class Solution {
//    Data Structures & Algorithms
//    Two Sum - Arrays (Easy)
//    Problem Number: 1
//    Solution: Use a hash map to store the difference of the target and current element with the current index.
//    Time Complexity: O(n)
//    Space Complexity: O(n)
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if(map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }

        throw new IllegalArgumentException("No match found!");
    }
//    Add Two Numbers - Linked List (Medium)
//    Problem Number: 2
//    Solution: Iterate through both lists, summing corresponding elements, and handle carry over.
//    Time Complexity: O(max(n, m))
//    Space Complexity: O(max(n, m))
//    Longest Substring Without Repeating Characters - Strings (Medium)
//    Problem Number: 3
//    Solution: Use a sliding window and a set to track unique characters.
//    Time Complexity: O(n)
//    Space Complexity: O(min(n, m))
//    Median of Two Sorted Arrays - Arrays (Hard)
//    Problem Number: 4
//    Solution: Use a binary search to partition the arrays into two halves.
//    Time Complexity: O(log(min(n, m)))
//    Space Complexity: O(1)
//    Longest Palindromic Substring - Dynamic Programming (Medium)
//    Problem Number: 5
//    Solution: Utilize DP to expand around the center of the palindrome.
//    Time Complexity: O(n^2)
//    Space Complexity: O(1)
//    LRU Cache - Design, HashTable (Medium)
//    Problem Number: 146
//    Solution: Implement using a doubly-linked list and a hash map.
//    Time Complexity: O(1) for both get and put operations
//    Space Complexity: O(capacity)
//    Binary Tree Inorder Traversal - Trees (Medium)
//    Problem Number: 94
//    Solution: Recursively traverse the tree or use a stack.
//    Time Complexity: O(n)
//    Space Complexity: O(n)
//    Maximum Subarray - Divide and Conquer, Dynamic Programming (Easy)
//    Problem Number: 53
//    Solution: Use Kadane's algorithm to find the maximum subarray sum.
//    Time Complexity: O(n)
//    Space Complexity: O(1)
//    Graphs
//    Clone Graph - Graphs (Medium)
//    Problem Number: 133
//    Solution: Use depth-first search (DFS) to create a copy of the graph.
//    Time Complexity: O(n)
//    Space Complexity: O(n)
//    Number of Islands - Depth-first Search (Medium)
//    Problem Number: 200
//    Solution: Use DFS to traverse connected islands, marking visited parts.
//    Time Complexity: O(m * n)
//    Space Complexity: O(m * n)
//    Course Schedule - Topological Sort (Medium)
//    Problem Number: 207
//    Solution: Use topological sorting to find a valid sequence.
//    Time Complexity: O(n)
//    Space Complexity: O(n)
//    Dynamic Programming
//    Climbing Stairs - Dynamic Programming (Easy)
//    Problem Number: 70
//    Solution: Use DP to calculate the number of ways to climb each step.
//    Time Complexity: O(n)
//    Space Complexity: O(1)
//    Coin Change - Dynamic Programming (Medium)
//    Problem Number: 322
//    Solution: Apply DP to find the fewest number of coins needed.
//    Time Complexity: O(m * n)
//    Space Complexity: O(n
//    Longest Increasing Subsequence - Dynamic Programming (Medium)
//    Problem Number: 300
//    Solution: Use DP to calculate the length of the longest increasing subsequence.
//    Time Complexity: O(n^2)
//    Space Complexity: O(n)
//    Searching & Sorting
//    Search in Rotated Sorted Array - Binary Search (Medium)
//    Problem Number: 33
//    Solution: Apply binary search to locate the target in a rotated array.
//    Time Complexity: O(log n)
//    Space Complexity: O(1)
//    First Missing Positive - Sorting (Hard)
//    Problem Number: 41
//    Solution: Perform cyclic sort to find the first missing positive integer.
//    Time Complexity: O(n)
//    Space Complexity: O(1)
//    Merge Intervals - Sorting (Medium)
//    Problem Number: 56
//    Solution: Sort intervals by start time and merge overlapping intervals.
//    Time Complexity: O(n log n)
//    Space Complexity: O(1) if in-place sorting is used
//    Trees & Graphs
//    Validate Binary Search Tree - Trees (Medium)
//    Problem Number: 98
//    Solution: Use in-order traversal to validate the binary search tree.
//    Time Complexity: O(n)
//    Space Complexity: O(n)
//    Lowest Common Ancestor of a Binary Tree - Trees (Medium)
//    Problem Number: 236
//    Solution: Use recursion to find the lowest common ancestor.
//    Time Complexity: O(n)
//    Space Complexity: O(n)
//    Word Ladder - Graphs, Breadth-first Search (Medium)
//    Problem Number: 127
//    Solution: Use BFS to find the shortest transformation sequence.
//    Time Complexity: O(M * N)
//    Space Complexity: O(M * N)
//    Design & Systems
//    Design Twitter - Design (Medium)
//    Problem Number: 355
//    Solution: Implement using a combination of hash maps and heaps.
//    Time Complexity: O(log k) for the getNewsFeed operation
//    Space Complexity: O(n + m)
//    Design Hit Counter - Design (Medium)
//    Problem Number: 362
//    Solution: Use a queue to track hits within a 5-minute window.
//    Time Complexity: O(1) for hit and O(n) for getHits
//    Space Complexity: O(n)
//    Miscellaneous
//    Sudoku Solver - Backtracking (Hard)
//    Problem Number: 37
//    Solution: Apply backtracking to fill the Sudoku board.
//    Time Complexity: O(9^(n * n))
//    Space Complexity: O(n * n)
//    Reverse Nodes in k-Group - Linked List (Hard)
//    Problem Number: 25
//    Solution: Reverse every k nodes in the linked list.
//    Time Complexity: O(n)
//    Space Complexity: O(1)
//    Minimum Window Substring - Sliding Window (Hard)
//    Problem Number: 76
//    Solution: Use a sliding window to find the minimum window substring.
//    Time Complexity: O(n)
//    Space Complexity: O(m)
//    Trapping Rain Water - Two Pointers (Hard)
//    Problem Number: 42
//    Solution: Apply two pointers to compute trapped rainwater.
//    Time Complexity: O(n)
//    Space Complexity: O(1)
//    Serialize and Deserialize Binary Tree - Trees (Hard)
//    Problem Number: 297
//    Solution: Implement serialization and deserialization using pre-order traversal.
//    Time Complexity: O(n)
//    Space Complexity: O(n)
//    Substring with Concatenation of All Words - Hash Table (Hard)
//    Problem Number: 30
//    Solution: Use a hash map to track word occurrences and sliding window.
//    Time Complexity: O(n * m)
//    Space Complexity: O(m)
//    The Skyline Problem - Divide and Conquer (Hard)
//    Problem Number: 218
//    Solution: Apply divide and conquer or a priority queue.
//    Time Complexity: O(n log n)
//    Space Complexity: O(n)
//    Frog Jump - Dynamic Programming (Hard)
//    Problem Number: 403
//    Solution: Use DP to track reachable stones.
//    Time Complexity: O(n^2)
//    Space Complexity: O(n^2)
}