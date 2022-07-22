import java.util.Scanner;

    class Staff {
    String StaffId,Name;
    long Phone;
    double Salary;

    void read() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter StaffId, Name, Phone, Salary");
        StaffId = sc.nextLine();
        Name = sc.nextLine();
        Phone = sc.nextLong();
        Salary = sc.nextDouble();
    }
    void display() {
        System.out.print("StaffId: "+StaffId+"\tName: "+Name+"\tPhone: "+Phone+"\tSalary: "+Salary);
    }
    public static void main(String[] args) {
        Teaching tea1 = new Teaching();
        System.out.println("Enter the details of the Teaching Staff:");
        tea1.read();
        Technical tec1 = new Technical();
        System.out.println("Enter the details of the Technical Staff");
        tec1.read();
        System.out.println("Enter the details of the Contract Staff:");
        Contract con1 = new Contract();
        con1.read();
        System.out.println("The details of the Teaching Staff:");
        tea1.display();
        System.out.println("The details of the Technical Staff:");
        tec1.display();
        System.out.println("The details of the Contract Staff:");
        con1.display();
    }
}

class Teaching extends Staff {
    String Domain,Publication;
    Scanner sc = new Scanner(System.in);
    void read() {
        super.read();
        System.out.println("Enter the Domain and Publication of the Teaching Staff");
        Domain = sc.nextLine();
        Publication = sc.nextLine();
    }
    void display() {
        super.display();
        System.out.println("\tDomain: "+Domain+"\tPublication: "+Publication);
    }
}

class Technical extends Staff {
    String Skills;
    Scanner sc = new Scanner(System.in);
    void read() {
        super.read();
        System.out.println("Enter the Skills of the Teaching Staff");
        Skills = sc.nextLine();       
    }
    void display() {
        super.display();
        System.out.println("\tSkills: "+Skills);
    }
}

class Contract extends Staff {
    String Period;
    Scanner sc = new Scanner(System.in);
    void read() {
        super.read();
        System.out.println("Enter the Period of the Teaching Staff");
        Period = sc.nextLine();       
    }
    void display() {
        super.display();
        System.out.println("\tPeriod: "+Period);
    }
}