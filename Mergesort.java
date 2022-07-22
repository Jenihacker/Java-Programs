import java.util.Scanner;
import java.util.Random;

 class Mergesort {
    int[] a;
    void input() {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.println("Enter total no. of elements");
        int n = sc.nextInt();
        a = new int[n];
        for(int i=0;i<n;i++) {
           a[i] = r.nextInt(1000);
         } 
    }
    void display() {
        for(int x:a) {
            System.out.print(x+" ");
        }
        System.out.println();
    }
    void sort() {
        mergesort(0,a.length-1);
    }

    void mergesort(int left,int right) {
       if(left<right) {
       int mid =(left+right)/2;
       mergesort(left, mid);
       mergesort(mid+1,right);
       merge(left,mid,right);
       }
    }

    void merge(int left,int mid,int right) {
        int[] temp=  new int[a.length];
        for(int i=left;i<=right;i++) {
            temp[i] = a[i];
        }
        int i=left;
        int j=mid+1;
        int k=left;
        while(i<=mid && j<=right) {
            if(temp[i] <= temp[j]) {
                a[k++]=temp[i++];
            }
            else {
                a[k++]=temp[j++];
            }
        }
        while(i<=mid) {
            a[k++] = temp[i++];
        }
        while(j<=right) {
            a[k++] = temp[j++];
        }
    }
    
    public static void main(String[] args) {
        Mergesort sorter = new Mergesort();
        sorter.input();
        //System.out.println("Array elements before sorting are:");
        //sorter.display();
        long startTime = System.nanoTime();
        sorter.sort();
        //System.out.println("Array elements after sorting are:");
        //sorter.display();
        double endTime = System.nanoTime();
        double duration = (endTime-startTime)/1000000;
        System.out.println("The time required for sorting is: "+duration+" milliseconds");
    }
}
