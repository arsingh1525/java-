import java.util.Scanner;

public class cumofcount {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println(" enter a number ");
        int n = Sc.nextInt();
        int sum=0;
        while(n!=0){
            int ld = n%10;
            sum+=ld;
            n/=10;
        }
        System.out.println(sum);
    }
}
