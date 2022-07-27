import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        while (true) {
            System.out.println("enter a number");
            Scanner in = new Scanner(System.in);
            int num = in.nextInt();
            boolean flag = true;
            for (int i = 2; i <= num-1; i++) {
                if (num % i == 0) {
                    System.out.println(num+" is not prime");
                    flag = false;
                   break;
                }
                else {
                    System.out.println(num+" is prime");
                }
            }
        }
    }
}