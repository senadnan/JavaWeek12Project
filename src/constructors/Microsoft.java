package constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class Microsoft {
    public static void main(String[] args) {


        Employee employee1 = new Employee(); // calling for default constructor

        employee1.name = "Adnan";
        employee1.ID = 4525;
        employee1.JobTitle = "SDET";
        employee1.salary = 1200000;
        System.out.println(employee1.companyName);




        System.out.println(employee1);

        Employee employee2 = new Employee("Aziz", "Developer", 4526, 115000);

        ArrayList<Employee> team = new ArrayList<>();


        team.add(new Employee("Jamal", "SDET", 300, 95000));

        // let's find Max salary from team list
        double maxSalary = Double.MIN_VALUE;
        for (Employee each : team) {   // each is an Employee object
            if (each.salary > maxSalary) {
                maxSalary = each.salary;
            }
        }
        System.out.println("maxSalary = " + maxSalary);

        // I want to find Jamal's job title
        for (Employee each : team) {
            if (each.name.equalsIgnoreCase("jamal")) {
                System.out.println(each.JobTitle);
            }
        }
/*
Note: You can change or call static field through object or ClassName, but second one maybe preferable
 */
// employeeOne.companyName = "Tesla";
        Employee.companyName = "Tesla";
        // company name for each employee
        for(Employee each : team){
            System.out.println(each.name+" is working for "+each.companyName);
        }



    }

}
