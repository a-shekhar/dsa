# Algorithms and problem-solving patterns

Start by clarifying inputs, output, constraints and edge cases. Give a correct baseline, identify repeated work, select a pattern, state its invariant, and test both typical and boundary cases. Complexities below use `n` for input size unless noted.

## Array and string patterns

- **Two pointers:** Move indices according to an invariant; useful for sorted pairs, reversing, and partitioning. Often O(n), but movement rules must not skip a valid answer.
- **Sliding window:** Maintain a contiguous window and update its state as bounds move. Fixed-size windows are direct; variable-size windows require a condition that makes shrinking safe. Negative numbers can invalidate common sum-window assumptions.
- **Prefix sums / difference arrays:** Precompute cumulative totals for O(1) static range sums after O(n) preprocessing; use a frequency map for some subarray sums. Watch overflow and inclusive/exclusive bounds.
- **Kadane's algorithm:** For maximum sum of a nonempty contiguous subarray, maintain the best sum ending at each index: `ending = max(x, ending + x)` and update the global best. Initialize from the first element, not zero, to handle all-negative input. O(n) time, O(1) extra space. Decide separately how empty input is handled.
- **Boyer–Moore majority vote:** Cancel pairs of different values to find a *candidate* for an element occurring more than n/2 times. O(n) time, O(1) space. If a majority is not guaranteed, count the candidate in a second pass; this is not a general most-frequent-element algorithm.
- **Dutch national flag:** Partition values in three categories using low, scan and high pointers. Maintain known low values before `low`, middle values before `scan`, and high values after `high`; after swapping with `high`, inspect the new `scan` value before advancing. O(n) time, O(1) extra space; define the three categories first.
- **Intervals:** Sort by start or end as appropriate, then merge, count overlaps or schedule. Clarify whether endpoints touching count as overlapping; sorting often costs O(n log n).

## Search, sorting and selection

- **Binary search:** Maintain a well-defined range and a monotonic predicate. Check boundaries, duplicates and absent values; use `low + (high - low) / 2` for nonnegative array indices. O(log n) on random-access sorted input.
- **Sorting:** Know comparison sorts: merge sort O(n log n) time and O(n) auxiliary space for arrays; heap sort O(n log n) time and O(1) auxiliary array space; quicksort average O(n log n), worst O(n²), with stack costs depending on implementation. Stability varies by algorithm and implementation.
- **Selection / top k:** Use a heap for streaming or a bounded top-k, or quickselect for average O(n), worst O(n²). State ordering and duplicate requirements.

## Recursion, trees and graphs

- **Recursion/backtracking:** Define base case and progress; choose, explore, undo. Subsets/permutations can require exponential/factorial output; account for recursion and copies.
- **DFS/BFS:** DFS explores deeply; BFS explores in layers and finds shortest paths by edge count in an unweighted graph. Adjacency-list traversal costs O(V + E), with O(V) visited space. For trees, recursion uses O(h) stack.
- **Topological sort:** Order a directed acyclic graph using indegrees or DFS; failure to process all vertices with indegrees indicates a cycle. O(V + E).
- **Shortest paths:** Dijkstra handles nonnegative weights; Bellman–Ford permits negative edges and can detect reachable negative cycles; BFS works for equal edge costs. Do not use Dijkstra with negative edges.
- **Union-find:** Process connectivity and some cycle/MST problems. Kruskal's algorithm sorts edges and uses union-find; Prim's grows a minimum spanning tree with a frontier.

## Optimization and other patterns

- **Dynamic programming:** Define a state, transition, base cases and evaluation order; cache overlapping subproblems. Calculate time as states times transition cost and include storage. Practice 1D/2D, knapsack, subsequences and grid paths.
- **Greedy:** Make a locally optimal choice only after proving an exchange argument or other correctness property; a locally appealing choice is not automatically correct.
- **Monotonic stack/deque:** Maintain ordered candidates for next-greater elements or window extrema. Each element is normally added and removed at most once, giving O(n) total operations.
- **Bit manipulation and math:** Practice XOR, masks, shifts, parity, GCD and modular arithmetic; account for signed Java integers and overflow.
- **Advanced as needed:** Sweep line, string matching, binary search on the answer, segment/Fenwick trees and tries. Learn the prerequisites and constraints before choosing them.
