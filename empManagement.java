class emp {
    private int empId;
    private String empName;
    private double salary;

    emp(int empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    public void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Salary: " + salary);
    }
}

public class empManagement {
    public static void main(String[] args) {
        emp e1 = new emp(101, "Alice", 50000);
        emp e2 = new emp(102, "Bob", 60000);
        emp e3 = new emp(103, "Charlie", 70000);
        e1.display();
        e2.display();
        e3.display();
    }
}
