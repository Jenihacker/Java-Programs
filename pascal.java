import java.util.Scanner;

public class pascal {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        n = sc.nextInt();
        for(int i=1;i<=n;i++) {
            for(int k=n-i+1;k>=1;k--){
                    System.out.print(" ");
                }
            for(int j=1;j<=i;j++) {
                System.out.print("* ");
                }
            System.out.println();
        }
    }
}