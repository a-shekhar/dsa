import java.util.Arrays;
import java.util.Objects;

public class WithoutFirstAndLast {
    /** Returns a new array without the first and last elements. */
    public static int[] middle(int[] values) {
        Objects.requireNonNull(values, "values must not be null");
        if (values.length <= 2) {
            return new int[0];
        }

        int[] result = new int[values.length - 2];
        for (int i = 1; i < values.length - 1; i++) {
            result[i - 1] = values[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};
        System.out.println("Middle elements: " + Arrays.toString(middle(values)));
    }
}
