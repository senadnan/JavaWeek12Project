package constructors;

public class Employee {


    public String name, JobTitle;
    public int ID;
    public double salary;
    public static String companyName = "Microsoft";

/*
    static {
        companyName = "Microsoft";
    }


 */
    public Employee() {
        salary =10000; // default salary for employee objects
    }

    public Employee(String name, String jobTitle, int ID, double salary) {
        this.name = name;
        JobTitle = jobTitle;
        this.ID = ID;
        this.salary = salary;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", JobTitle='" + JobTitle + '\'' +
                ", ID=" + ID +
                ", salary=" + salary +
                ", company name=" + companyName +
                '}';
    }
}
