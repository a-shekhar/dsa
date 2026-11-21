# String problems

## Reverse a String

- **Difficulty:** Easy (self-assessed)
- **Source:** [Master the Coding Interview: Data Structures + Algorithms](https://www.udemy.com/course/master-the-coding-interview-data-structures-algorithms/) by Andrei Neagoie, Data Structures: Arrays section
- **Topics:** Strings, arrays
- **Solution:** [ReverseString.java](ReverseString.java)

Given a string, return a new string with its characters in reverse order. For example, `Hello!` becomes `!olleH`.

### Approach

Walk backwards through the input and append each Unicode code point to a `StringBuilder`. This keeps surrogate pairs, such as many emoji, together. An empty string returns an empty string; `null` is rejected. This reverses code points, so characters made of multiple code points (such as a letter followed by a combining accent) may not stay together.

- **Time:** O(n), where n is the number of UTF-16 code units in the input.
- **Extra space:** O(n) for the result.

Run the example from this directory with Java 25:

```sh
java ReverseString.java
```
