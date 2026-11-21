import java.util.Objects;

public class ReverseString {
    /** Returns the input's Unicode code points in reverse order. */
    public static String reverse(String input) {
        Objects.requireNonNull(input, "input must not be null");

        StringBuilder reversed = new StringBuilder(input.length());
        for (int end = input.length(); end > 0; ) {
            // Read whole Unicode code points so surrogate pairs stay together.
            int codePoint = input.codePointBefore(end);
            reversed.appendCodePoint(codePoint);
            end -= Character.charCount(codePoint);
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        String input = "Hello!";
        System.out.println("Input:  " + input);
        System.out.println("Output: " + reverse(input));
    }
}
