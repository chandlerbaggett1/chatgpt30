import java.util.HashMap;
import java.util.Map;

public class Solution {
//    Two Sum - Arrays
//    Problem Number: 1
//    Solution: Use a HashMap to store the complement and its index. Iterate through the array, and if the complement is found, return the indices.
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
//    Reverse Integer - Math
//    Problem Number: 7
//    Solution: Repeatedly pop the last digit off the original number and push it onto the reversed number, handling overflow.
//    Time Complexity: O(log(x))
//    Space Complexity: O(1)
//
//    Longest Substring Without Repeating Characters - Strings
//    Problem Number: 3
//    Solution: Use the sliding window technique with a HashSet to track characters.
//    Time Complexity: O(n)
//    Space Complexity: O(min(n, m)) where m is the size of the charset
//
//    Median of Two Sorted Arrays - Binary Search
//    Problem Number: 4
//    Solution: Apply binary search on the smaller array to find the partition, then calculate the median.
//    Time Complexity: O(log(min(m, n)))
//    Space Complexity: O(1)
//
//    Longest Palindromic Substring - Dynamic Programming
//    Problem Number: 5
//    Solution: Use a 2D boolean array for dynamic programming, and expand around the center for each character.
//    Time Complexity: O(n^2)
//    Space Complexity: O(n^2)
//
//    ZigZag Conversion - Strings
//    Problem Number: 6
//    Solution: Iterate through the string and use an array of StringBuilder objects to append characters in the zigzag pattern.
//    Time Complexity: O(n)
//    Space Complexity: O(n)
//
//    Container With Most Water - Two Pointers
//    Problem Number: 11
//    Solution: Use two pointers and move them inward, always moving the pointer with the shorter height.
//    Time Complexity: O(n)
//    Space Complexity: O(1)
//
//    Integer to Roman - Math
//    Problem Number: 12
//    Solution: Use arrays to define the Roman numerals and their corresponding values, then build the result.
//    Time Complexity: O(1)
//    Space Complexity: O(1)
//
//    3Sum - Arrays
//    Problem Number: 15
//    Solution: Sort the array, then use a fixed pointer and two moving pointers to find the triplets.
//    Time Complexity: O(n^2)
//    Space Complexity: O(log n) to O(n), depending on the sorting algorithm
//
//    Valid Parentheses - Stacks
//    Problem Number: 20
//    Solution: Use a stack to match opening and closing brackets.
//    Time Complexity: O(n)
//    Space Complexity: O(n)
//
//    Merge Intervals - Sorting
//    Problem Number: 56
//    Solution: Sort the intervals by start time, then merge overlapping intervals.
//    Time Complexity: O(n log n)
//    Space Complexity: O(log n) to O(n), depending on the sorting algorithm
//
//    Maximum Subarray - Dynamic Programming
//    Problem Number: 53
//    Solution: Use Kadane's algorithm to find the maximum sum contiguous subarray.
//    Time Complexity: O(n)
//    Space Complexity: O(1)
//
//    Jump Game - Greedy
//    Problem Number: 55
//    Solution: Use a variable to keep track of the farthest reachable index.
//    Time Complexity: O(n)
//    Space Complexity: O(1)
//
//    Permutations - Backtracking
//    Problem Number: 46
//    Solution: Use backtracking to generate all possible permutations.
//    Time Complexity: O(n!)
//    Space Complexity: O(n)
//
//    Rotate Image - Arrays
//    Problem Number: 48
//    Solution: Transpose the matrix, then reverse each row.
//    Time Complexity: O(n^2)
//    Space Complexity: O(1)
//
//    Group Anagrams - Hashing
//    Problem Number: 49
//    Solution: Use a HashMap with sorted strings as keys to group anagrams.
//    Time Complexity: O(nk log k), where k is the maximum length of a string
//    Space Complexity: O(nk)
//
//    Maximum Product Subarray - Dynamic Programming
//    Problem Number: 152
//    Solution: Keep track of the current maximum and minimum products to handle negative numbers.
//    Time Complexity: O(n)
//    Space Complexity: O(1)
//
//    Word Search - DFS
//    Problem Number: 79
//    Solution: Use Depth First Search to explore the board.
//    Time Complexity: O(n * m * 4^s), where n and m are the dimensions of the board, and s is the length of the word
//    Space Complexity: O(s)
//
//    Binary Tree Inorder Traversal - Trees
//    Problem Number: 94
//    Solution: Use a stack to simulate recursive inorder traversal.
//    Time Complexity: O(n)
//    Space Complexity: O(n)
//
//    Validate Binary Search Tree - Trees
//    Problem Number: 98
//    Solution: Use in-order traversal to check if the values are sorted.
//    Time Complexity: O(n)
//    Space Complexity: O(n)
//
//    Symmetric Tree - Trees
//    Problem Number: 101
//    Solution: Use recursion or iteration to compare mirrored subtrees.
//    Time Complexity: O(n)
//    Space Complexity: O(n)
//
//    Binary Tree Level Order Traversal - BFS
//    Problem Number: 102
//    Solution: Use a queue to perform Breadth First Search.
//    Time Complexity: O(n)
//    Space Complexity: O(n)
//
//    Maximal Square - Dynamic Programming
//    Problem Number: 221
//    Solution: Use a 2D DP array to track the size of the square.
//    Time Complexity: O(m * n)
//    Space Complexity: O(m * n)
//
//    Course Schedule - Graphs
//    Problem Number: 207
//    Solution: Use a topological sort to detect cycles in the graph.
//    Time Complexity: O(n + e), where n is the number of courses, and e is the number of prerequisites
//    Space Complexity: O(n + e)
//
//    Word Break - Dynamic Programming
//    Problem Number: 139
//    Solution: Use dynamic programming to partition the string and check if each partition is in the dictionary.
//    Time Complexity: O(n^2)
//    Space Complexity: O(n)
//
//    House Robber - Dynamic Programming
//    Problem Number: 198
//    Solution: Use dynamic programming to find the maximum amount that can be robbed.
//    Time Complexity: O(n)
//    Space Complexity: O(1)
//
//    Number of Islands - DFS
//    Problem Number: 200
//    Solution: Use Depth First Search to traverse the islands.
//    Time Complexity: O(n * m), where n and m are the dimensions of the grid
//    Space Complexity: O(n * m)
//
//    Implement Trie (Prefix Tree) - Trie
//    Problem Number: 208
//    Solution: Implement a trie data structure with insert, search, and startsWith methods.
//    Time Complexity: O(k), where k is the length of the key
//    Space Complexity: O(n * k), where n is the number of keys
//
//    Product of Array Except Self - Arrays
//    Problem Number: 238
//    Solution: Use two arrays to store the left and right products, then multiply them.
//    Time Complexity: O(n)
//    Space Complexity: O(1), excluding the output array
//
//    Sliding Window Maximum - Deque
//    Problem Number: 239
//    Solution: Use a deque to store the indices of elements and maintain the maximum in the current window.
//    Time Complexity: O(n)
//    Space Complexity: O(k), where k is the size of the window
}