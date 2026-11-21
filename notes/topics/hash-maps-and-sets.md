# Hash maps and sets

## Idea and costs

A hash map stores key–value associations; a hash set stores membership. A hash function helps choose a bucket; two distinct keys can collide, so the implementation must still compare keys for equality. Expected lookup, insertion and deletion are commonly O(1) with suitable hashing; worst cases and memory depend on implementation. `HashMap` does not promise iteration order.

In Java, equal keys must have equal hash codes. Mutating a field used by `equals` or `hashCode` after insertion can make a key difficult to find. `HashMap` permits null values, so `get(key) == null` does not distinguish missing keys from keys mapped to null; use `containsKey` when that distinction matters.

## Frequency counting

```java
Map<Integer, Integer> counts = new HashMap<>();
for (int value : values) {
    counts.put(value, counts.getOrDefault(value, 0) + 1);
}
```

For `[2, 3, 2]`, the map becomes `{2=2, 3=1}`. This takes O(n) average time and O(u) space for u distinct values. Imports and the surrounding method are omitted in this illustrative snippet.

## Complement lookup

For `[2, 7, 11]`, target `9`, store `2 -> 0`. At index 1 the complement is `2`, so return indices 0 and 1. Query before inserting the current value to avoid reusing one index; duplicates such as `[3, 3]` work. The existing [Two Sum solution](../../problems/arrays/README.md) uses this approach. For other constraints, watch integer overflow in complement arithmetic.

## When to use which

Use a set for membership or duplicates, a map for counts, index lookup, grouping or prefix-sum frequencies. If ordering or range queries matter, investigate `TreeMap`/`TreeSet` instead. Ask whether keys are unique, whether order matters and whether extra O(n) memory is acceptable.

Practice: detect duplicates, check anagrams, group words by signature, find the first unique value, and count subarrays with a target sum. Check empty inputs, repeated keys, negative values and overflow.
