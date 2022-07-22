import java.util.Scanner;
import java.lang.Math;

public class dec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number in binary form");
        String n = sc.nextLine();
        int sum=0;
        for(int i=0;i<n.length();i++) {
            if(n.charAt(i)=='1')
            sum += Math.pow(2, n.length()-i-1);
        }
        System.out.println(sum);
    }
}
