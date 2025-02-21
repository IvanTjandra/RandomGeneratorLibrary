/**
 * A simple demo class to showcase the usage of the RandomGenerator library.
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println("Random integer (0 to 100): " + RandomGenerator.nextInt(100));
        System.out.println("Random integer (50 to 100): " + RandomGenerator.nextInt(50, 100));
        System.out.println("Random double (0.0 to 1.0): " + RandomGenerator.nextDouble());
        System.out.println("Random double (10.0 to 20.0): " + RandomGenerator.nextDouble(10.0, 20.0));
        System.out.println("Random boolean: " + RandomGenerator.nextBoolean());
        System.out.println("Random string (10 characters): " + RandomGenerator.randomString(10));
    }
}