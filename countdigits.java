import java.util.Scanner;
public class countdigits {
    public static void main(String[] args) {
        {
            Scanner Sc=new Scanner(System.in);
            System.out.println("enter a number  ");
            int n=Sc.nextInt();
            int count=0;
            while (n!=0)
            {
                n/=10;
                count ++;
            }
            System.out.println(count);
        }
    }


}
