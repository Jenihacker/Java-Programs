import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        int a,b,c; 
        Scanner sc =new Scanner(System.in);
        try {
            System.out.println("Enter the value of a");
            a = sc.nextInt();
            System.out.println("Enter the value of b");
            b = sc.nextInt();
            c = a/b;
            System.out.println("No Exception");
            System.out.println("The value of c=a/b is: "+c);
        } catch(ArithmeticException ex1) {
            System.out.println(ex1);
        }
    }
}
