import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number/string");
        String num = sc.nextLine();
        int l= num.length();
        int count=0,i,j=l-1;
        for(i=0;i<l;i++) {
            if(num.charAt(i) == num.charAt(j))
            {
                count++;
                j--;
            }
        }
        if(count == i)
        System.out.println(num +" is a palindrome");
        else 
        System.out.println(num+" is not a palindrome");
    }
    
}
