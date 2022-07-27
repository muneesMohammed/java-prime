import java.util.Scanner;

public class prime {
    public static void main(String[] args) {

            System.out.println("enter a number");
            Scanner in = new Scanner(System.in);
            int num = in.nextInt();

        for (int i = 2; i <= num; i++) {
            boolean flag = true;
            for (int j = 2; j <= i/2; j++) {
                if (i % j == 0) {
                    flag=false;
                   break;
                }

                }
            if (flag==true){
                System.out.println(i);
            }

            }
    }
}