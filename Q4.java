import java.util.Scanner;

class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter five numbers");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        float d = sc.nextFloat();
        float e = sc.nextFloat();
        // if (a < b) {
        // if (a < c) {
        // if (a < d) {
        // if (a < e) {
        // System.out.println("the smallest number is :" + a);
        // } else
        // System.out.println("the smallest number is :" + e);

        // } else
        // System.out.println("the smallest number is :" + d);

        // } else
        // System.out.println("the smallest number is :" + c);
        // } else
        // System.out.println("the smallest number is :" + b);

        float g;
        g = a;
        if (a > b) {
            g = b;
        } else {
            g = a;
        }
        if (a > c) {
            g = c;
        } else {
            g = a;
        }
        if (a > d) {
            g = d;
        } else {
            g = a;
        }
        if (a > e) {
            g = e;
        } else {
            g = a;
        }
        System.out.println("the smallest value is : " + g);

        sc.close();

    }
}
// accept 5 numbers and find smallest between them.