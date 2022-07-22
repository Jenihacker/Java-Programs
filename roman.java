import java.util.Scanner;

public class roman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the roman number");
        String ro = sc.nextLine();
        int ct = ro.length();
        int[] a = new int[ct+2];
        for(int i=2;i<=ct+1;i++) {
            switch (ro.charAt(i-2)) {
                case 'I':
                    a[i] = 1;
                    break;
                case 'V':
                    a[i] = 5;
                    break;
                case 'X': 
                    a[i] = 10;
                    break;
                case 'L':
                    a[i] = 50;
                    break;
                case 'C':
                    a[i] = 100;
                    break;
                case 'D':
                    a[i] = 500;
                    break;
                case 'M':
                    a[i] = 1000;            
                default:
                    break;
            }
        }
        int sum = 0;
        a[0] = 0;
        for(int i=ct+1;i>=1;i--) {
            if(a[i] <= a[i-1]) {
                sum+=a[i];
            } else if(a[i]>a[i-1]) {
                sum += a[i]-a[i-1];
                i--;
            }
        }
        System.out.println(sum);
    }
}