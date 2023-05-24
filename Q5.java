import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number whose table you want : ");
        int num = sc.nextInt();
        System.out.println("The table of " + num + " is : ");
        for (int i = 1; i <= 10; i++) {
            int table = num * i;
            System.out.println(table);
        }

        sc.close();
    }
}
// enter a number and print its table