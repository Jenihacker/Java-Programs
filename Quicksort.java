import java.util.Scanner;
import java.util.Random;;

public class Quicksort {
    private int[] a;
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
            System.out.println(x+" ");
        }
    }

    void sort() {
        quicksort(0,a.length-1);
    }

    void quicksort(int left,int right) {
        if(left<right) {
            int s = partition(left,right);
            quicksort(left,s-1);
            quicksort(s+1,right);
        }
    }

    int partition(int left,int right) {
        int pivot = a[left];
        int i = left;
        int j = right+1;
        do {
            do {
                ++i;
            }while(i<right && a[i] < pivot);
            do {
                --j;
            }while(a[j] > pivot);
            swap(i,j);
        }while(i<j);
        swap(i,j);
        swap(left,j);
        return j;
    }

    void swap(int i,int j) {
        int temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        Quicksort sorter = new Quicksort();
        sorter.input();
        //System.out.println("The array elements before sorting");
        //sorter.display();
        long starttime = System.nanoTime();
        sorter.sort();
        double endtime = System.nanoTime();
       // System.out.println("The elements after sorting");
       // sorter.display();
        double duration = (endtime-starttime)/1000000;
        System.out.println("The time required for sorting is "+duration+" milliseconds");
    }
}
