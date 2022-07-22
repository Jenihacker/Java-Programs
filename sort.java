import java.util.Scanner;
public class sort {
    public static void main(String[] args) {
        int n,temp;
        System.out.println("Enter the no. of elements");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); 
        int[] a = new int[n+1];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (a[j] > a[j + 1]) {
                
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
        for(int i=0;i<n;i++) {
            System.out.println(a[i]);
        }
    }
}