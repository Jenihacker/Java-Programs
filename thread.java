import java.util.*;

class Square implements Runnable {
    int x;
    public Square (int num) {
        x = num;
    }
    public void run() {
        System.out.println("Thread2: The square of "+x+" is "+x*x);
    }
}
class Cube implements Runnable {
    int x;
    public Cube (int num) {
        x = num;
    }
    public void run() {
        System.out.println("Thread3: The cube of "+x+" is "+x*x*x);
    }
}
class Generate implements Runnable {
    public void run() {
        int num=0; 
        Random r = new Random();
        try {
            for(int i=0;i<5;i++) {
                num = r.nextInt(100);
                System.out.println("Thread1: The generated random number is "+num);
                Thread t1 = new Thread(new Square(num));
                t1.start();
                Thread t2 = new Thread(new Cube(num));
                t2.start();
                Thread.sleep(1000);
                System.out.println("-------------------------------------------");               
            }
            
        }catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    }

public class thread {
   public static void main(String[] args) {
    //Generate g = new Generate();
    Thread t = new Thread(new Generate());
    t.start();
   }  
}
