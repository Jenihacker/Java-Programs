import java.util.Scanner;
public class bin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int i=0,count=-1;
        System.out.println("Enter the number");
        n = sc.nextInt();
        int a[] = new int[1000];
        while(n>=1) {
            
            a[i] = n % 2;
            n/=2;
            count++;
            i++;
        }
        for(i=count;i>=0;i--) {
            System.out.print(a[i]);
        }
    }
}
