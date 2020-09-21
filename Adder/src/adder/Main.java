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
