import java.util.Scanner;

public class star {
    public static void main(String[] args) {
        Scanner Sc = new Scanner (System.in);
        System.out.println("enter c");
        int c = Sc.nextInt();


        {
            for(int i=1; i<=c;i++)
            {
                for(int j=1; j<=c;j++)
                {
                    System.out.print("  *");
                }
                System.out.println();
            }

        }
    }
}

