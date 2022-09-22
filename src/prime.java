import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        while (true) {
            System.out.println("enter a number");
            Scanner in = new Scanner(System.in);
            int num = in.nextInt();
            boolean flag = true;
            if (num==0||num==1){
                System.out.println(num+" is not prime");
            }
            else {
            for (int i = 2; i <= num/2; i++) {
                if (num % i == 0) {
                    flag = false;
                break;
                }
            }
            if (flag==false){
                System.out.println(num+"is not prime");
            }
            else {
                System.out.println(num+" is prime");
            }
        }
    }
}}