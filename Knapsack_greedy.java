import java.util.Scanner;

public class Knapsack_greedy {
    static int[] p,wt;
    static int C,n;

    static void solve_knapsack() {
        int profit=0,c=C;
        for(int i=1;i<=n;i++) {
            if(c >= wt[i]) {
                profit+=p[i];
                System.out.println("Item: "+i+" (weight: "+wt[i]+" profit: "+p[i]+") is added to knapsack");
                c-=wt[i];
            }
        }
        System.out.println("Total profit of the items added = "+profit);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of items");
        n = sc.nextInt();
        wt = new int[n+1];
        p = new int[n+1];
        System.out.println("Enter the items according to the decreasing order of profit/weight ratio");
        System.out.println("Enter the items profit");
        for(int i=1;i<=n;i++) {
            p[i] = sc.nextInt();
        }
        System.out.println("Enter the items weight");
        for(int i=1;i<=n;i++) {
            wt[i] = sc.nextInt();
        }
        System.out.println("Enter the maximum capacity");
        C = sc.nextInt();
        System.out.println("\n0/1 knapsack using Greedy method");
        solve_knapsack();
    }
}
