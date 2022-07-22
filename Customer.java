import java.util.*;
//import java.util.StringTokenizer;

public class Customer {
    String name,date;
    
    public void read() {
        System.out.println("Enter the name and dob of customer");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        date = sc.next();
        String DatePattern = "\\d{2}/\\d{2}/\\d{4}";
        while(!date.matches(DatePattern)) {
            System.out.println("Please enter the dob in dd/mm/yyyy format:");
            date = sc.next();
        }
    }
    public void display() {
        StringTokenizer st = new StringTokenizer(date,"/");
        System.out.print("Customer name and dob is: "+name);
        for(int i=1;i<=3;i++) {
        System.out.print(","+st.nextToken());
        }
        System.out.println();
    }  
    
    public static void main(String[] args) {
        Customer c1 = new Customer();
        c1.read();
        c1.display();
    }
}
