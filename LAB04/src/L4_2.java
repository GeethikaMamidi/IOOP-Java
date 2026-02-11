class EMPLOYEE {
    String Ename;
    int Eid;
    long Basic, DA, Gross_Sal, Net_Sal, IT;

    public EMPLOYEE() {
    	this.Ename = "Unknown";
        this.Eid = 0;
        this.Basic = 0;
    }

    public EMPLOYEE(String name, int id, long basic) {
        this.Ename = name;
        this.Eid = id;
        this.Basic = basic;
    }


    void compute_net_sal() {
        DA = (52 * Basic) / 100;
        Gross_Sal = Basic + DA;
        IT = (30 * Gross_Sal) / 100;
        Net_Sal = Gross_Sal - IT;
    }

    void display() {
        System.out.println("\nSalary Details:");
        System.out.println("Name: " + Ename+"\nID: " + Eid+"\nBasic: " + Basic+"\nDA: " + DA+"\nGross Salary: " + Gross_Sal+"\nNet Salary: " + Net_Sal);
    }
}

public class L4_2 {
    public static void main(String[] args) {

        EMPLOYEE e1 = new EMPLOYEE();
        e1.display();

        EMPLOYEE e2 = new EMPLOYEE("Bhanu", 101, 30000);
        e2.compute_net_sal();
        e2.display();
    }
}
