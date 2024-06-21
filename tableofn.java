import java.util.Scanner;

public class tableofn {
    public static void main(String[] args) {
        Scanner Sc =new Scanner (System.in);
        System.out.println("enter number  ");
        int num = Sc.nextInt();

        for (int i = 1; i <= 10; ++i) {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
        }

    }
}