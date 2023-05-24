public class Q17 {
    public static void main(String[] args) {
        int n = 11;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((2 * j) - i == n - 1 || ((j + 1) * 2) - i == n - 1 || ((j + 2) * 2) - i == n - 1
                        || ((j + 3) * 2) - i == n - 1 || ((j + 4) * 2) - i == n - 1 || ((j + 5) * 2) - i == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
