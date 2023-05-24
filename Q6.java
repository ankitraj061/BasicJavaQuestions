import java.util.Scanner;

public class Q6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int f = 1;
        for (int i = num; i <= num; i--) {
            f = f * i;
            if (i == 1)
                break;

        }
        System.out.println(f);
        sc.close();
    }
}
// enter a value and find its factorial