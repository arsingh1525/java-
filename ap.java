import java.util.Scanner;

public class ap {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n = Sc.nextInt();
        int a =5, d=-4;
        for(int i =1;i<=n;i++)
        {
            System.out.println(a);
            a+=d;
        }
    }
}
