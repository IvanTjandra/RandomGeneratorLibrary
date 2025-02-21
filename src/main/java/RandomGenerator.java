import java.util.Random;

/**
 * A utility class for generating random values.
 * Provides methods to generate random integers, doubles, booleans, and strings.
 */
public class RandomGenerator {

    // Single instance of Random used for all methods
    private static final Random RANDOM = new Random();

    /**
     * Generates a random integer between 0 (inclusive) and the specified bound (exclusive).
     *
     * @param bound the upper bound (exclusive) for the random number
     * @return a random integer
     * @throws IllegalArgumentException if bound is not positive
     */
    public static int nextInt(int bound) {
        if (bound <= 0) {
            throw new IllegalArgumentException("Bound must be positive.");
        }
        return RANDOM.nextInt(bound);
    }

    /**
     * Generates a random integer between min (inclusive) and max (inclusive).
     *
     * @param min the lower bound (inclusive)
     * @param max the upper bound (inclusive)
     * @return a random integer between min and max
     * @throws IllegalArgumentException if max is less than min
     */
    public static int nextInt(int min, int max) {
        if (max < min) {
            throw new IllegalArgumentException("Max must be greater than or equal to min.");
        }
        return min + RANDOM.nextInt(max - min + 1);
    }

    /**
     * Generates a random double between 0.0 (inclusive) and 1.0 (exclusive).
     *
     * @return a random double
     */
    public static double nextDouble() {
        return RANDOM.nextDouble();
    }

    /**
     * Generates a random double between min (inclusive) and max (exclusive).
     *
     * @param min the lower bound (inclusive)
     * @param max the upper bound (exclusive)
     * @return a random double between min and max
     * @throws IllegalArgumentException if max is less than or equal to min
     */
    public static double nextDouble(double min, double max) {
        if (max <= min) {
            throw new IllegalArgumentException("Max must be greater than min.");
        }
        return min + (RANDOM.nextDouble() * (max - min));
    }

    /**
     * Generates a random boolean value.
     *
     * @return a random boolean
     */
    public static boolean nextBoolean() {
        return RANDOM.nextBoolean();
    }

    /**
     * Generates a random alphanumeric string of the specified length.
     * The string contains uppercase and lowercase letters as well as digits.
     *
     * @param length the length of the string to generate
     * @return a random string
     * @throws IllegalArgumentException if length is negative
     */
    public static String randomString(int length) {
        if (length < 0) {
            throw new IllegalArgumentException("Length must be non-negative.");
        }
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int index = RANDOM.nextInt(characters.length());
            sb.append(characters.charAt(index));
        }
        return sb.toString();
    }
}
