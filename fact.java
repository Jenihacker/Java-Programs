import java.util.Scanner;
class fact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.");
        int n = sc.nextInt();
        long fact=1;
        for(int i=2;i<=n;i++) {
            fact = fact * i;
        }
        System.out.println("The factorial of "+ n +" is " + fact);
       
}
}
