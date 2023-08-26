public class NumberPrint {
    public static void main(String[] args) {
        printNumbers();
    }

    private static void printNumbers() {
        for (int num = 1; num <= 100; num++) {
            String output = getOutput(num);
            System.out.println(output);
        }
    }

    private static String getOutput(int num) {
        StringBuilder output = new StringBuilder();

        if (isMultipleOf(num, 3)) {
            output.append("Chausettes");
        }
        if (isMultipleOf(num, 5)) {
            output.append("Sales");
        }

        return output.length() > 0 ? output.toString() : String.valueOf(num);
    }

    private static boolean isMultipleOf(int num, int divisor) {
        return num % divisor == 0;
    }
}
