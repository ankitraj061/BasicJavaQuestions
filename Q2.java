public class Q2 {
    public static void main(String[] args) {
        int num = 1;
        while (true) {
            if (num % 5 == 0 && num % 7 == 0) {
                System.out.println(num);
                break;
            }
            num++;
        }
    }
}
// WAP to print first multiple of 5 which is also the multiple of 7.