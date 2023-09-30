public class printingPatternsProblem {
    public static void printingPatternsTriangle(int n) {
        int printedNumbersCount = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(printedNumbersCount + " ");
                printedNumbersCount += 1;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printingPatternsTriangle(5);
    }
}
