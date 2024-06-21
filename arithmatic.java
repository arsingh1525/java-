import java.util.Scanner;

public class arithmatic {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n =Sc.nextInt();
        for(int i=1;i<=3*n-1;i+=2) {
            System.out.println(i);
        }
    }
}
