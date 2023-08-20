import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
/*
    Two Sum: Utilize a hash map to store numbers and their indices; iterate through the list, checking if the complement of the current number exists in the hash map.

    Add Two Numbers: Traverse both linked lists, adding corresponding values with carry-over and maintain the sum in a new list.

    Longest Substring Without Repeating Characters: Use sliding window technique with a set to detect duplicates.

    Valid Parentheses: Utilize a stack to match opening and closing parentheses.

    Merge Two Sorted Lists: Use recursion or iteration to merge elements from two sorted linked lists.

    Merge k Sorted Lists: Implement a min-heap or use divide and conquer to merge k sorted lists.

    Substring with Concatenation of All Words: Use sliding window technique and hash map to check for concatenation.

    Search in Rotated Sorted Array: Apply binary search with modifications to handle rotations.

    Combination Sum: Utilize backtracking to explore combinations that sum to the target.

    Jump Game II: Use BFS or greedy algorithm to find the minimum jumps needed.

    Pow(x, n): Implement a fast exponentiation using recursive or iterative binary exponentiation.

    N-Queens: Apply backtracking to position queens without conflicts.

    Merge Intervals: Sort intervals by start time, then merge overlapping ones.

    Climbing Stairs: Utilize dynamic programming or Fibonacci sequence.

    Edit Distance: Apply dynamic programming to find the minimal operations for conversion.

    Binary Tree Inorder Traversal: Implement a recursive or iterative inorder traversal.

    Best Time to Buy and Sell Stock: Use dynamic programming or track min price while iterating.

    Word Ladder: Employ BFS to find the shortest transformation sequence.

    Clone Graph: Utilize DFS or BFS for graph cloning.

    Single Number: Apply XOR operation on all elements.

    LRU Cache: Implement using a combination of hash map and doubly-linked list.

    Maximum Product Subarray: Utilize dynamic programming keeping track of min and max products.

    Bitwise AND of Numbers Range: Shift both numbers right until they are the same, then shift back left.

    Reverse Linked List: Use iteration or recursion to reverse the linked list.

    Implement Trie (Prefix Tree): Utilize a tree structure with nodes representing characters.

    Implement Queue using Stacks: Use two stacks and push elements between them to achieve queue functionality.

    Find Median from Data Stream: Maintain two heaps (max and min) to keep track of the median.

    Additive Number: Apply backtracking to check if a number follows the additive sequence.

    Palindrome Pairs: Use a trie and hash map to efficiently locate palindromic pairs.

    Shortest Bridge: Utilize DFS to mark one island and BFS to expand to the next island, counting steps.
 */
public class SolutionTest {
    Solution solution = new Solution();

    @Test
    public void twoSumTest() {
        int[] arr = new int[]{1, 5, 9, 11};
        int[] ans = solution.twoSum(arr, 14);
        Assertions.assertEquals(ans[0], 1);
        Assertions.assertEquals(ans[1], 2);
    }

//    @Test
//    public void longestSubstringWithoutRepeatingCharacters(String s) {
//    }
}
