# Recursion, backtracking, greedy and dynamic programming

## Recursion

A recursive method solves a smaller instance and needs a base case and progress toward it. Factorial can be described as `f(0) = 1`, `f(n) = n * f(n - 1)` for nonnegative n. It uses O(n) calls and O(n) stack space; numerical overflow happens quickly. A recursive tree traversal can use O(h) stack, which is O(n) for a skewed tree. Handle input constraints and stack limits.

## Backtracking

Choose an option, recursively explore it, then undo the choice before trying another. To generate subsets of `[a, b]`, decide independently whether to include each element: `[]`, `[b]`, `[a]`, `[a, b]`. There are 2ⁿ subsets; copying all of them takes O(n·2ⁿ) total output work in the worst case, plus O(n) recursion depth. If input values repeat, define whether duplicate output subsets are allowed; sorting and skipping equal choices at the appropriate depth is one common approach. Early pruning is correct only if it cannot remove a valid answer.

## Greedy reasoning

A greedy method makes a local choice and needs a proof that the choice can be part of an optimal solution. For selecting the maximum number of non-overlapping intervals, sort by end time and repeatedly choose the next compatible interval. An exchange argument shows that replacing an optimal first choice with the earliest-ending interval leaves at least as much room for later choices. Sorting costs O(n log n). Clarify whether intervals with equal endpoints can touch. A greedy rule for one problem may fail for a superficially similar one; test counterexamples and prove it.

## Dynamic programming

DP is useful when subproblems overlap and a state captures all information needed for future decisions. Define state, transitions, base cases, evaluation order, and final answer before coding. Memoization caches recursive results; tabulation fills states iteratively.

For minimum coins with unlimited positive denominations, define `dp[x]` as the fewest coins summing to x; `dp[0] = 0`, and `dp[x] = min(dp[x - coin] + 1)` over coins not exceeding x whose previous state is reachable. Use an unreachable sentinel safely. For coins `[1, 3, 4]`, the result for 6 is 2 (`3 + 3`), while always taking the largest coin first gives 3 (`4 + 1 + 1`). With amount A and c coins, this formulation takes O(Ac) time and O(A) space. This example also shows why a greedy coin strategy is not universally valid.

In 0/1 knapsack each item can be used once; when compressing a two-dimensional table to one dimension, iterate capacity downward so the same item is not reused in that iteration. For unbounded variants the order can differ. For subsequence and grid DP, state both indices or coordinates and check base rows/columns. Complexity is number of states times transitions per state, plus storage and any recursion stack.

## Bit and math foundations

XOR cancels equal pairs (`x ^ x = 0`), which is useful only when the problem's frequency assumptions match. A bit mask can encode a subset when the number of items fits the chosen representation; Java shifts mask the shift distance, so check width. Euclid's algorithm computes GCD by repeated remainders; define sign and zero behavior. Widen arithmetic before multiplication and specify modular arithmetic assumptions.

## Practice

Generate subsets and permutations, solve a small maze with backtracking, schedule intervals, solve coin change and 0/1 knapsack, count grid paths, and find a longest increasing subsequence. Compare a brute-force baseline to the improved approach; test empty input, duplicates, unreachable states, negative values where allowed, and numeric limits.
