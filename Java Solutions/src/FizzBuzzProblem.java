public class FizzBuzzProblem {
    public static void FizzBuzz(int n) {
        if (n <= 0) {
            System.out.println("Please input a positive number");
        }

        for (int i = 0; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz ");
            }
            else if (i % 3 == 0) {
                System.out.println("Fizz ");
            }
            else if (i % 5 == 0) {
                System.out.println("Buzz ");
            }
            else {
                System.out.println(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        FizzBuzz(30);
    }
}
