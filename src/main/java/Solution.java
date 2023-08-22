import java.util.HashMap;
import java.util.Map;

public class Solution {
//    Data Structures & Algorithms
//    Two Sum (#1): Use a hash map to store the complement of the target and current value. Iterate through the array
//    and find the match. Time Complexity: O(n), Space Complexity: O(n).
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
//    Longest Substring Without Repeating Characters (#3): Use sliding window technique with a set to detect duplicates.
//    Time Complexity: O(n), Space Complexity: O(min(n, m)) where m is the size of the character set.
//    Median of Two Sorted Arrays (#4): Use binary search on the smaller array to find the median. Time Complexity:
//    O(log(min(m, n))), Space Complexity: O(1).
//    Valid Parentheses (#20): Use a stack to validate the parentheses. Time Complexity: O(n), Space Complexity: O(n).
//    Merge Intervals (#56): Sort the intervals and then merge overlapping ones. Time Complexity: O(n log n), Space
//    Complexity: O(1).
//    LRU Cache (#146): Use a doubly linked list and hash map. Time Complexity: O(1), Space Complexity: O(capacity).
//    Min Stack (#155): Use two stacks, one for values and one for minimums. Time Complexity: O(1), Space Complexity:
//    O(n).
//    Maximum Product Subarray (#152): Use dynamic programming to track both maximum and minimum products. Time
//    Complexity: O(n), Space Complexity: O(1).
//    Serialize and Deserialize Binary Tree (#297): Use pre-order traversal for both serialization and deserialization.
//    Time Complexity: O(n), Space Complexity: O(n).
//    Word Search II (#212): Use Trie and backtracking. Time Complexity: O(N * 4^(L)), Space Complexity: O(N), where N
//    is the total number of cells and L is the length of the word.
//    Dynamic Programming
//    Climbing Stairs (#70): Use dynamic programming (or Fibonacci sequence). Time Complexity: O(n), Space Complexity:
//    O(1).
//    Unique Paths (#62): Dynamic programming approach to find the number of paths. Time Complexity: O(m * n), Space
//    Complexity: O(m * n).
//    Coin Change (#322): Dynamic programming using bottom-up approach. Time Complexity: O(n * m), Space Complexity:
//    O(n).
//    Longest Increasing Subsequence (#300): Dynamic programming with binary search. Time Complexity: O(n log n), Space
//    Complexity: O(n).
//    Word Break (#139): Dynamic programming with dictionary lookup. Time Complexity: O(n^2), Space Complexity: O(n).
//    Strings & Arrays
//    Valid Anagram (#242): Count characters with hash table. Time Complexity: O(n), Space Complexity: O(1).
//    Group Anagrams (#49): Hash table with sorted strings as keys. Time Complexity: O(n * k log k), Space Complexity:
//    O(n * k).
//    Rotate Image (#48): Transpose the matrix and then reverse each row. Time Complexity: O(n^2), Space Complexity:
//    O(1).
//    ZigZag Conversion (#6): Iterate through the characters and use an array to represent each row. Time Complexity:
//    O(n), Space Complexity: O(n).
//    Regular Expression Matching (#10): Dynamic programming. Time Complexity: O(m * n), Space Complexity: O(m * n).
//    Graphs
//    Clone Graph (#133): Depth-first search with a hash table. Time Complexity: O(n), Space Complexity: O(n).
//    Number of Islands (#200): Depth-first search. Time Complexity: O(n * m), Space Complexity: O(n * m).
//    Course Schedule (#207): Topological sort using depth-first search. Time Complexity: O(V + E), Space Complexity:
//    O(V).
//    Network Delay Time (#743): Dijkstra's algorithm. Time Complexity: O(E + V log V), Space Complexity: O(V + E).
//    Redundant Connection (#684): Union-find algorithm. Time Complexity: O(n), Space Complexity: O(n).
//    Design Problems
//    Design Twitter (#355): Use hash maps and linked lists. Time Complexity: O(n log k), Space Complexity: O(n + m),
//    where k is the number of tweets.
//    Design Circular Queue (#622): Use an array with two pointers. Time Complexity: O(1), Space Complexity: O(n).
//    Design a Stack With Increment Operation (#1381): Use an extra array for tracking increments. Time Complexity:
//    O(1), Space Complexity: O(n).
//    Miscellaneous
//    Random Pick with Weight (#528): Use binary search on prefix sums. Time Complexity: O(log n), Space Complexity:
//    O(n).
//    Top K Frequent Elements (#347): Use a min heap and hash map. Time Complexity: O(n log k), Space Complexity:
//    O(n + k).
}