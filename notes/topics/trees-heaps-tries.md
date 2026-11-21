# Trees, heaps and tries

## Binary trees and traversal

A tree has a root and subtrees; a binary node has at most two children. Height definitions vary: state whether height counts edges or nodes. A full traversal visits each node once, O(n) time. Recursive stack space is O(h), where height h can be n for a skewed tree. BFS uses a queue and O(w) space for maximum width w.

For root 2 with children 1 and 3, preorder is `2, 1, 3` (root first), inorder `1, 2, 3` (root between), postorder `1, 3, 2` (root last), and level order `2, 1, 3`. Use postorder for information needed from children, preorder for carrying information down, and BFS for levels. Null nodes and skewed trees are important tests.

## Binary search trees

In a BST, keys in the left subtree precede the node and keys in the right subtree follow it according to the chosen ordering and duplicate policy. Search, insert and delete take O(h); a balanced tree has O(log n) height, a skewed one may have O(n). Validating only parent-child relationships is insufficient: pass valid lower and upper bounds or verify the appropriate inorder ordering. Deleting a node with two children typically replaces it using a successor or predecessor, then removes that replacement node.

## Heaps and priority queues

A min-heap's parent is no larger than its children; it is not a completely sorted array. Root peek is O(1); insert and root removal are O(log n). Java `PriorityQueue<Integer>` is a min-heap; supply a safe comparator such as `Comparator.reverseOrder()` for a max-heap, not subtraction that can overflow. A size-k min-heap can keep the k largest values by removing the smallest after size exceeds k: O(n log k) time and O(k) space for valid k.

## Tries

A trie follows one edge per symbol of a key; terminal markers distinguish a full word from a prefix. With O(1) child lookup, insert, lookup and prefix lookup take O(L) for key length L. Space depends on stored prefixes and child representation; large alphabets can make fixed child arrays expensive. Define Unicode/case handling and empty-string behavior.

## Practice

Implement traversals, maximum depth, BST validation, lowest common ancestor, level order, top-k values and a trie. Test empty trees, duplicates under the chosen BST policy, skewed trees, `k = 1`, and shared prefixes. See [tree problems](../../problems/trees/README.md).
