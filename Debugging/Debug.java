public class Debug {

    public static void main(String[] args) {

        try {
            int width = 0;
            int length = 40;

            int ratio = length / width;
            System.out.println(ratio);
        } catch (ArithmeticException e) {
            System.err.println("ArithmeticException: " + e.getMessage());
        }

    }

}