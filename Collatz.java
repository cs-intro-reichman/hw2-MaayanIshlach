// Demonstrates the Collatz conjecture.
public class Collatz {
    public static void main(String args[]) {
        int n = Integer.parseInt(args[0]);
        String str = args[1];
        int count;
        int num;

        if (str.equals("v")) {
            for (int i = 1; i < n + 1; i++) {
                count = 0;

                // Start of sequence
                System.out.print(i + " ");
                count++;
                num = (i % 2 != 0) ? i * 3 + 1 : i;

                while (num != 1) {
                    if (num % 2 == 0) {
                        num = num / 2;
                    } else {
                        num = num * 3 + 1;
                    }
                    System.out.print(num + " ");
                    count++;
                }

                // End of sequence
                System.out.println("(" + count + ")");
            }
        }

        // Final output message
        System.out.println("Every one of the first " + n + " hailstone sequences reached 1.");
    }
}


