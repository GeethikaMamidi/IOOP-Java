class EMPLOYEE {
    String name;
    int id;
    long basic, DA, gross, IT;
    double net;

    EMPLOYEE() {
        this.name = "Unknown";
        this.id = 0;
        this.basic = 0;
    }

    EMPLOYEE(String n, int i, long b) {
        this.name = n;
        this.id = i;
        this.basic = b;
    }

    void calculateSalary() {
        DA = (52 * basic) / 100;
        gross = basic + DA;
        IT = (30 * gross) / 100;
        net = gross - IT;
    }

    void displayEmployeeDetails() {
        System.out.println("Name: " + name + "\nID: " + id);
        System.out.println("DA: " + DA + "\nGross Salary: " + gross);
        System.out.println("Net Salary: " + net);
    }
}

class PartTimeEmp extends EMPLOYEE {
    int hoursWorked;
    final static double hourlyRate = 500;
    double sal;

    PartTimeEmp() {
        super();
        hoursWorked = 0;
    }

    PartTimeEmp(String n, int i, long b, int h) {
        super(n, i, b);
        hoursWorked = h;
    }

    void calculateSalary() {
        sal = hoursWorked * hourlyRate;
    }

    void displayEmployeeDetails() {
        System.out.println("\n**Part Time Employee**");
        System.out.println("Name: " + name + "\nID: " + id);
        System.out.println("Salary: " + sal);
    }
}

class FullTimeEmp extends EMPLOYEE {
    double bonus;
    double deductions;

    FullTimeEmp() {
        super();
        bonus = 0;
        deductions = 0;
    }

    FullTimeEmp(String n, int i, long b, double bo, double d) {
        super(n, i, b);
        bonus = bo;
        deductions = d;
    }

    void calculateSalary() {
        DA = (52 * basic) / 100;
        gross = basic + DA;
        IT = (30 * gross) / 100;
        net = gross - IT + bonus - deductions;
    }

    void displayEmployeeDetails() {
        System.out.println("\n**Full Time Employee**");
        System.out.println("Name: " + name + "\nID: " + id);
        System.out.println("Bonus: " + bonus + "\nDeductions: " + deductions);
        System.out.println("DA: " + DA + "\nGross Salary: " + gross);
        System.out.println("Net Salary: " + net);
    }
}

public class L7_2 {
    public static void main(String[] args) {

        EMPLOYEE e = new EMPLOYEE("Megha", 101, 50000);
        e.calculateSalary();
        e.displayEmployeeDetails();

        EMPLOYEE e1 = new PartTimeEmp("Shashi", 102, 0, 10);
        e1.calculateSalary();
        e1.displayEmployeeDetails();

        EMPLOYEE e2 = new FullTimeEmp("Eshaan", 103, 60000, 5000, 2000);
        e2.calculateSalary();
        e2.displayEmployeeDetails();
    }
}