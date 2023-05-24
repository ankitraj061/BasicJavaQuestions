import java.util.*;

class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total marks in Percentage :");
        float score = sc.nextFloat();
        if (score > 80)
            System.out.println("A");
        else if (score > 60)
            System.out.println("B");
        else if (score > 40)
            System.out.println("C");
        else
            System.out.println("D");
        sc.close();
    }
}
// WAP to enter percent and print the grade A if the the student got above 80, B if the student got above 60, C if he got above 40, and D if he got less than 40.