package constructors;

public class Employee {


    public String name, JobTitle;
    public int ID;
    public double salary;
    public static String companyName;


    static {

        companyName = "Microsoft";
    }

    public Employee() {
    }

    public Employee(String name, String jobTitle, int ID, double salary) {
        this.name = name;
        JobTitle = jobTitle;
        this.ID = ID;
        this.salary = salary;
    }
}
