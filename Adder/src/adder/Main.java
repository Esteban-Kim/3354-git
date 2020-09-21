package adder;

public class Main {

    public static void main(String[] args) {
        try {
            int result = addArguments(args);
            System.out.println(result);
        } catch (NumberFormatException  e) {
            System.err.println("Invalid character(s) provided in argument. Please provide valid numerical arguments.");
        } catch (Exception e) {
            System.err.println("Insufficent arguments provided. Please provide numerical arguments.");
        }
    }

    private static int addArguments(String[] args) {
        int sumOfArguments = 0;

        String firstString = args[0];

        if (firstString.equals("-")) {
            for (int i = 1; i < args.length; i++) {
                sumOfArguments += Integer.valueOf(args[i]);
            }
        }
        else {
            for (String str : args) {
                sumOfArguments += Integer.valueOf(str);
            }
        }

        if (firstString.equals("-")) { return -1*sumOfArguments; }

        return sumOfArguments;
    }
}
