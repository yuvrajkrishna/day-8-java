public class DiamondPattern {

    public static void diamond(int n) {

        // upper half
        for (int i = 0; i < n; i++) {

            // left spaces
            for (int s = 0; s < n - i - 1; s++) {
                System.out.print(" ");
            }

            // stars
            for (int st = 0; st < 2 * i + 1; st++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        // lower half
        for (int i = 0; i < n; i++) {

            // left spaces
            for (int s = 0; s < i; s++) {
                System.out.print(" ");
            }

            // stars
            for (int st = 0; st < 2 * (n - i) - 1; st++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        diamond(4);
    }
}
