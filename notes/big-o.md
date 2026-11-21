# Big O and complexity

Big O describes an asymptotic upper bound as input size grows. State what `n` measures and whether the bound is worst-case, average, or amortized. Big Omega is a lower bound; Big Theta is a tight asymptotic bound. Bounds do not predict exact runtime: constants, memory, data distribution, and implementation matter.

| Growth | Common example | What to notice |
| --- | --- | --- |
| O(1) | Array index access | Fixed work, assuming a valid index |
| O(log n) | Binary search | Search space halves each step |
| O(n) | Scan an array | One pass |
| O(n log n) | Merge sort | Logarithmic levels of linear work |
| O(n²) | Compare all pairs | Nested loops over the same input |
| O(2ⁿ), O(n!) | Some subset and permutation searches | Input limits are especially important |

Sequential work adds; nested independent loops multiply. A loop over two different inputs can cost O(n + m), or O(nm) if nested. For recursion, count calls and work per call, including call-stack space. A binary tree traversal takes O(n) time and O(h) stack space, where height `h` can be n for a skewed tree.

Auxiliary space excludes the input and usually excludes the returned output; explicitly state whether output space is counted. A new array of n elements takes O(n) space. In-place does not automatically mean O(1) total space if recursion uses a stack.

**Amortized** complexity spreads occasional expensive operations across a sequence: dynamic-array append is amortized O(1), but a resize is O(n). Hash map lookup is O(1) on average under suitable hashing assumptions, not an unconditional worst-case guarantee. Java integer arithmetic can overflow; choose `long` when constraints require it.

Practice: analyze a linear scan, two nested loops, binary search, merge sort, recursive tree traversal, and a resizing array. Explain the assumptions and space as well as time.
