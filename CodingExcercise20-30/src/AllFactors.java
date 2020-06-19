public class AllFactors {

    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        } else {
            int result = 0;
            int factor = 1;
            while (factor < 30) {
                if (number % factor == 0) {
                    result = factor;
                    System.out.println(+result);
                }
                factor++;
            }
        }
    }
}