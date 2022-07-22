import java.util.Scanner;

public class Knapsack01_DP {
    static int[] p, wt;
    static int C, n;
    
    static void knapsack01_DP() {
        int i, j, w;
        int[][] K = new int[n + 1][C + 1];

        // Build table K[][] in bottom up manner
        for (i = 0; i <= n; i++) {
            for (w = 0; w <= C; w++) {
                if (i == 0 || w == 0) { 
                    K[i][w] = 0;      //rule[i][w] = 1;
                } else if (wt[i] <= w) {
                    K[i][w] = max(p[i] + K[i - 1][w - wt[i]], K[i - 1][w]);
                } else {
                    K[i][w] = K[i - 1][w];
                }
            }
        }

        System.out.println("The selected items are :  ");
        int c = C;
        int m = n;

        while (m > 0) //best subset with weight at most knapsack size
        {
            if (K[m][c] != K[m - 1][c]) {
                System.out.println("Item " + m+ " (weight:" + wt[m] + ", profit:" + p[m] + ")");
                c = c - wt[m];
            }
            m--;
        }
        System.out.println("Total profit of the items added to knapsack = " + K[n][C]);

        
        System.out.print("\nIntermediate results \nCapacity:\t");
        for (j=0; j<=C;j++){
            System.out.print(j+"\t");
        }
        System.out.println();
        
        for (i=0;i<=n;i++){
            System.out.print("Item"+i+"("+p[i]+","+wt[i]+")\t");
            for (j=0; j<=C;j++){
                System.out.print(K[i][j]+"\t");
            }
            System.out.println();
        }
		
         
    }
   
    static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of items: ");
        n = sc.nextInt();

        System.out.println("Enter the items profit: ");
        p = new int[n + 1];
        for (int i = 1; i <= n; i++) {      // We store from index 1 to n
            p[i] = sc.nextInt();
        }

        System.out.println("Enter the items weights: ");
        wt = new int[n + 1];
        for (int i = 1; i <= n; i++) {      // We store from index 1 to n
            wt[i] = sc.nextInt();
        }

        System.out.println("Enter the maximum capacity: ");
        C = sc.nextInt();

        System.out.println("\n\n0/1 Kanpsack using Dynnamic Programming");
        knapsack01_DP();

    }
}