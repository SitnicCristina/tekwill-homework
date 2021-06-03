package md.tekwill.homework2505;

import java.util.regex.Pattern;

public class Employee {
    String name;
    String employeeID;
    Pattern employeeIDPatern = Pattern.compile("[A-M]");
    String hireDate;

    public Employee(){
        name = "Sitnic";
        employeeID = "123-A";
        hireDate = "25/05/2021";
    }

    public String getName() { return name; }

    public String getEmployeeID() { return employeeID; }

    public String getHireDate() { return hireDate; }

    public void setName(String name) { this.name = name; }

    public void setEmployeeID(String employeeID) { this.employeeID = employeeID; }

    public void setHireDate(String hireDate) { this.hireDate = hireDate; }
}
