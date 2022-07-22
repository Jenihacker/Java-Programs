import java.util.Scanner;

class Stack {
    int top;
    int[] item;
    Scanner sc = new Scanner(System.in);
    Stack(int size) {
        top = -1;
        item = new int[size];
    }
    public void push(int data) {
        if(top == item.length-1)
        {
            System.out.println("Stack is overflow");
            return;
        }
        else {
        item[++top] = data;
        }
    }
    public int pop() {
        if(top < 0) {
            System.out.println("Stack is underflow");
            return 0;
        }
        else {
        System.out.println("The popped element is "+ item[top]);
        return item[top--];
        }
    }
    public void display() {
        if(top < 0) {
            System.out.println("stack is empty");
        }
        else {
            for(int i=0;i<=top;i++) {
                System.out.print(item[i]+"\t");
            }
            System.out.println(" <-- top");
        }
    }
 }

public class Main {
    public static void main(String[] args) {
        boolean rerun = true;
        Scanner sc = new Scanner(System.in);
        Stack stk = new Stack(3);
        do {
            System.out.println("******MENU*******");
            System.out.println("1.Push\n2.Pop\n3.Display\n4.Exit");
            System.out.println("Enter your choice");
            int choice = sc.nextInt();
            switch(choice) {
                case 1: System.out.println("Enter the item to be pushed");
                        int data = sc.nextInt();
                        stk.push(data);
                        break;
                case 2: stk.pop();
                        break;
                case 3: stk.display();
                        break;
                case 4: rerun = false;
                        break;
                default: System.out.println("Invalid choice");        
            }
        }while(rerun == true);
    }
}
