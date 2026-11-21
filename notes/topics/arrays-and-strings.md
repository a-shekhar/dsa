# Arrays and strings

## Arrays

An array stores a fixed number of indexed elements. Access and update by index are O(1). Inserting into the middle of a compact array requires shifting later values and takes O(n); scanning for an unsorted value is O(n). An `ArrayList` can resize: append is amortized O(1), but one append may copy O(n) elements.

For `[4, 7, 9]`, inserting `6` at index 1 shifts `7` and `9` right: `[4, 6, 7, 9]`. Check whether there is capacity and whether the operation may mutate the input. For a matrix, distinguish rows from columns, handle empty or ragged rows, and specify whether row/column indices are inclusive.

## Two pointers

In sorted `[1, 2, 4, 7]`, target `9`: start at `1` and `7` (sum 8), move the left pointer to increase the sum, and find `2 + 7`. Each pointer moves at most n times: O(n) time, O(1) space. The proof depends on sorted order; moving a pointer this way on an unsorted input can skip answers. Use `long` for the sum if constraints allow overflow.

Other uses: reversing in place, removing duplicates from a sorted array, and partitioning. Define what each pointer means and what is already known about the regions between them.

## Sliding window and prefix sums

For a fixed window of size 3 in `[2, 1, 3, 4]`, the first sum is 6; subtract `2` and add `4` to get 8. After O(k) initialization, update in O(1) per move, O(n) overall. Specify behavior when `k <= 0` or `k > n`.

Variable windows work when the condition permits safely moving the left boundary; common positive-number sum arguments fail with negatives. Prefix sums support arbitrary signs: let `prefix[0] = 0` and `prefix[i + 1] = prefix[i] + a[i]`. Sum of indices `l` through `r` is `prefix[r + 1] - prefix[l]`. Construction takes O(n) time and space, a static range query O(1); updates require recomputation or another structure. Use `long` when needed.

## Strings and Unicode

Java strings are immutable sequences of UTF-16 code units. `length()` counts code units, and a supplementary Unicode code point can use two `char`s. A user-perceived character can consist of multiple code points, so even code-point reversal may split a grapheme cluster. Agree on the intended unit with the interviewer. Use `StringBuilder` for repeated appends.

Practice frequency counts, palindrome checks, anagrams and substring windows. Decide whether case, spaces, punctuation, normalization and Unicode matter. See the existing [Reverse a String](../../problems/strings/README.md) and [Two Sum](../../problems/arrays/README.md) examples.

## Practice prompts

Try sorted pair sum, remove duplicates in place, maximum fixed-size window, range-sum queries, longest substring without repeated characters and matrix traversal. For each, dry-run empty, one-element, duplicate and boundary cases.
