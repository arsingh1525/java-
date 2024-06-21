import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner Sc = new Scanner (System.in);
        System.out.println("enter colum");
        int c = Sc.nextInt();
        System.out.println("enter raw");
        int r = Sc.nextInt();

        {
            for(int i=1; i<=c;i++)
            {
                for(int j=1; j<=r;j++)
                {
                    System.out.print("  *");
                }
                System.out.println();
            }

        }
    }
}
