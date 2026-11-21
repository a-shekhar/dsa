# Data structures reference

Choose a structure by the operations needed, then verify ordering, duplicate handling, memory cost and mutation rules. `n` is the number of stored items unless otherwise stated.

## Arrays and strings

An array stores fixed-size indexed elements; access and update by index are O(1), while inserting or deleting in the middle takes O(n) shifts. A dynamic array such as Java `ArrayList` provides amortized O(1) append and O(n) worst-case resize. Practice iteration, in-place rearrangement, matrices and boundary conditions.

Java `String` is immutable and uses UTF-16; `char` is a code unit, not necessarily a complete Unicode character. Repeated concatenation in a loop can be costly; use `StringBuilder` when building a result. Decide whether the problem treats characters as code units, code points, or grapheme clusters. See [string exercises](../problems/strings/README.md).

## Hash tables and sets

Hash maps associate keys with values; sets track membership. Hashing maps keys to buckets and collisions must be handled. Lookup, insertion and deletion are typically O(1) average; performance depends on hashing and implementation. Keys need consistent `equals` and `hashCode`, and mutable keys are hazardous. Java: `HashMap`, `HashSet`, `getOrDefault`, `computeIfAbsent`; use `containsKey` if null values matter. Practice frequency maps, duplicates, complements and grouping.

## Linked lists

A singly linked node stores a value and next pointer; a doubly linked node also stores previous. A circular list links the tail back to the head, so traversal needs an explicit stop condition. Given the relevant node, local insertion/deletion is O(1); finding it is O(n). A singly linked list cannot generally delete an arbitrary node in O(1) without its predecessor. Track head, tail, empty and single-node cases, and keep both directions consistent in doubly linked lists. Practice reversal, cycle detection, middle nodes and merging.

## Stacks, queues and deques

A stack is last-in-first-out; use it for matching delimiters, undo, monotonic stacks and DFS. A queue is first-in-first-out; use it for BFS and scheduling. A deque supports both ends and can implement either. Their end operations are normally O(1), depending on implementation. Java `ArrayDeque` is often useful; it does not accept null. Track empty behavior.

## Trees, heaps and tries

Trees consist of nodes connected without cycles. Study traversals (preorder, inorder, postorder and level order), height, recursion and iterative stacks. A binary search tree orders keys by subtree; search is O(h), O(log n) when height is balanced, but O(n) when skewed. Clarify duplicate policy.

A binary heap supports O(1) peek and O(log n) insertion/removal at the root, but does not provide sorted iteration or fast arbitrary lookup. Java `PriorityQueue` is a min-heap by default. A trie stores prefixes; operations are O(L) in key length with suitable child lookup, at a potentially high memory cost. Practice top-k and prefix search.

## Graphs and disjoint sets

Graphs can be directed or undirected, weighted or unweighted. An adjacency list uses O(V + E) space; a matrix uses O(V²), with constant-time edge lookup. Traversals using adjacency lists take O(V + E); mark visited to handle cycles. Disjoint-set union supports connectivity and cycle detection; with path compression and union by rank/size, operations are amortized near constant, O(α(n)). It does not by itself give a path between vertices.

## Further study

Learn balanced trees and ordered maps, bit sets, union-find, prefix trees, and, when appropriate, segment/Fenwick trees and caches. Implement core structures yourself, then practice choosing Java collections under interview conditions.
