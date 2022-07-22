import java.util.Scanner;
import java.lang.Math;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int n = num;
        String j= String.valueOf(num);
        int b = j.length();
        int temp,sum=0;
        while(num > 0)
        {
            temp = num % 10;
            sum += Math.pow(temp,b);
            num = num/10;
        }
        if(sum == n)
        System.out.println(n +" is an armstrong number");
        else
        System.out.println(n +" is not an armstrong number");
    
}
}
