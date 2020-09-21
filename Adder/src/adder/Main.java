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

        for (String str : args) {
            sumOfArguments += Integer.valueOf(str);
        }

        return sumOfArguments;
    }
}
