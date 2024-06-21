import java.util.Scanner;

public class loop{

    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n = Sc.nextInt();

        for(int i = 1; i<=n; i++)
        {
       if(i%2==0) System.out.println(i);
        }
    }
}
