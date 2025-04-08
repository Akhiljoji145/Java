// Base class Emp
class main {
    // Data members
    private int empid;
    private String name;
    private double salary;
    private String address;

    // Constructor to initialize the data members
    public main(int empid, String name, double salary, String address) {
        this.empid = empid;
        this.name = name;
        this.salary = salary;
        this.address = address;
    }

    // Getter methods to access private members
    public int getEmpid() {
        return empid;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getAddress() {
        return address;
    }
}

// Subclass Teacher that inherits from Emp
class Teacher extends main {
    // Additional data members
    private String department;
    private String subjectsTaught;

    // Constructor to initialize both Emp and Teacher data members
    public Teacher(int empid, String name, double salary, String address, String department, String subjectsTaught) {
        super(empid, name, salary, address); // calling the constructor of the Emp class
        this.department = department;
        this.subjectsTaught = subjectsTaught;
    }

    // Method to display all the data
    public void display() {
        System.out.println("Employee ID: " + getEmpid());
        System.out.println("Name: " + getName());
        System.out.println("Salary: " + getSalary());
        System.out.println("Address: " + getAddress());
        System.out.println("Department: " + department);
        System.out.println("Subjects Taught: " + subjectsTaught);
    }
}

// Main class to test the implementation
public class Employee {
    public static void main(String[] args) {
        // Creating an object of Teacher class
        Teacher teacher = new Teacher(101, "Alice Johnson", 50000, "123 Main St", "Mathematics", "Algebra, Calculus");
        
        // Displaying the information of the teacher
        teacher.display();
    }
}
