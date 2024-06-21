import java.util.Scanner;

public class apt {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = Sc.nextInt();
        int a=1;
        for (int i = 1; i <=n ; i++) {
            System.out.println(a);
            a*=3;

        }
    }
}
