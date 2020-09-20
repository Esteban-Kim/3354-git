package adder;

public class Main {

    public static void main(String[] args) {
        try {
            int result = addArguments(args);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Please provide multiple integers to add");
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
