# Complexity and Java foundations

## How to analyze a solution

1. Define the input sizes, such as `n` array entries and `m` queries. State assumptions: sorted input, available memory, hash behavior, or constraints on values.
2. Count the work. Sequential loops add; nested loops multiply when each inner loop runs fully. A loop that halves its range takes O(log n) iterations.
3. Identify best, worst, average or amortized cases. These are different statements. Big O is an asymptotic upper bound; Θ describes a tight bound.
4. Count auxiliary space, including collections and the call stack. State separately whether returned output is counted.

For example, two passes over an array take O(n) + O(n) = O(n), and a loop over every pair takes O(n²). Iterating over all pairs of two different inputs is O(nm), not necessarily O(n²). If a recursion halves input and performs O(1) work per level, time and stack space are O(log n); an iterative equivalent can use O(1) auxiliary space.

An `ArrayList` append is amortized O(1): occasional resizing copies O(n) elements, but a sequence of appends spreads that work. This does not make every individual append O(1). Hash table lookups are commonly average O(1), contingent on implementation and hashing; do not describe them as universally worst-case O(1).

## Java interview essentials

- `int` is 32-bit signed. Widen **before** multiplication or addition when needed: `long product = (long) a * b;`. Check problem constraints before choosing a type.
- Arrays have fixed length and zero-based indices. `ArrayList<Integer>` grows dynamically and stores boxed integers; `get` is O(1), middle insert/remove is O(n).
- `HashMap` and `HashSet` are useful for lookup and membership. Keys should obey `equals`/`hashCode`; don't mutate fields used in those methods while a key is in the map.
- `ArrayDeque` supports stack and queue operations and disallows null. `PriorityQueue` is a min-heap unless a comparator is supplied; its iterator is not sorted.
- `String` is immutable; `StringBuilder` is useful when repeatedly appending. Java indexes strings by UTF-16 code units, not necessarily user-perceived characters.
- `Arrays.sort` mutates an array. Check the behavior and complexity of the specific overload you use rather than assuming all Java sorts have the same guarantees.

## Practice

Analyze: a single scan, two scans, nested loops over different arrays, an iterative binary search, a recursive traversal of a skewed tree, and append operations on a resizing array. For each, explain both time and space and identify the quantity measured by `n`.

See also [Big O summary](../big-o.md) and [roadmap](../study-roadmap.md).
