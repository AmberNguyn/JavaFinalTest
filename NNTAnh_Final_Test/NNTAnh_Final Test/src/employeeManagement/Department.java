package employeeManagement;

import java.util.List;

public class Department {
    private String departmentName;
    private List listOfEmployee;

    public Department(String deptName) {
        this.departmentName = deptName;
    }


    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void display(){};

    public String toString()
    {
        String str = "Department name: " + departmentName + "\n" +
                "List of employee: " + listOfEmployee;
        return str;
    }




}
