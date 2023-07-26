
import java.util.Scanner;

public class Lec01Ex01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1,n2,total;
        System.out.println("Enter the first number ");
        n1=sc.nextInt();
        System.out.println("Enter the second number ");
        n2=sc.nextInt();
        total=n1+n2;
        System.out.println("The total is "+total);
    }
}
