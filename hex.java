import java.util.Scanner;
public class hex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the decimal number");
        int n = sc.nextInt();
        int a[] = new int[10000];
        int i=0,count=-1;
        if(n==0){
        System.out.print(0);
        return;
    }
        while(n>=1)
        {
            a[i]=n % 16;
            n/=16;
            count++;
            i++;
        }
         
        for(i=count;i>=0;i--)
        {
          if(a[i]==10)
          System.out.print("A");
          else if(a[i]==11)
          System.out.print("B");  
          else if(a[i]==12)
          System.out.print("C");
          else if(a[i]==13)
          System.out.print("D");
          else if(a[i]==14)
          System.out.print("E");
          else if(a[i]==15)
          System.out.print("F");
          else 
          System.out.print(a[i]);
            
        }

    }
}
