import java.util.Scanner;
public class gcd {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter number n1  ");
        int n1= Sc.nextInt();
        System.out.println("enter number n2  ");
        int n2= Sc.nextInt();
        int gcd = 1;

        for (int i = 1; i <= n1 && i <= n2; ++i) {

            if (n1 % i == 0 && n2 % i == 0)
                gcd = i;
        }

        System.out.println("GCD of " + n1 +" and " + n2 + " is " + gcd);
    }
}

