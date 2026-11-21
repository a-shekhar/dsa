import java.util.Objects;

public class TemperatureAnalysis {
    /** Returns the average of a nonempty array of daily temperatures. */
    public static double average(int[] temperatures) {
        Objects.requireNonNull(temperatures, "temperatures must not be null");
        if (temperatures.length == 0) {
            throw new IllegalArgumentException("at least one temperature is required");
        }

        long sum = 0;
        for (int temperature : temperatures) {
            sum += temperature;
        }
        // Convert before division so a fractional average is preserved.
        return (double) sum / temperatures.length;
    }

    /** Counts days whose temperatures are strictly above the average. */
    public static int daysAboveAverage(int[] temperatures) {
        double average = average(temperatures);
        int count = 0;
        for (int temperature : temperatures) {
            if (temperature > average) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] temperatures = {20, 25, 30, 25};
        System.out.println("Average temperature: " + average(temperatures));
        System.out.println("Days above average: " + daysAboveAverage(temperatures));
    }
}
