package employeeManagement;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;

public class DepartmentManage {
    Map<String, Employee> EmployeeList = new HashMap<>();


    public void addSalariedEmp() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter SSN: ");
        String SSN = keyboard.nextLine();
        System.out.println("Enter first name: ");
        String firstName = keyboard.nextLine();
        System.out.println("Enter last name: ");
        String lastName = keyboard.nextLine();
        System.out.println("Enter phone: ");
        String phone = keyboard.nextLine();
        while (!phone.matches("[0-9]{7,}")) {
            System.out.println("Invalid phone number. Please type again: ");
            phone = keyboard.nextLine();
        }

        System.out.println("Enter birthday (dd/mm/yyyy): ");
        String birthday = keyboard.nextLine();
        while (!birthday.matches("^(0[1-9]|[12][0-9]|3[01])[- /.](0[1-9]|1[012])[- /.](19|20)\\d\\d$")) {
            System.out.println("Invalid input. Please type again: ");
            birthday = keyboard.nextLine();
        }

        System.out.println("Enter commission rate: ");
        double commissionRate = keyboard.nextDouble();
        System.out.println("Enter gross sale: ");
        double grossSale = keyboard.nextDouble();
        System.out.println("Enter basic salary: ");
        double basicSalary = keyboard.nextDouble();


        SalariedEmployee newSalariedEmployee = new SalariedEmployee(SSN, firstName, lastName, commissionRate, grossSale, basicSalary);

        EmployeeList.put(newSalariedEmployee.getSsn(), newSalariedEmployee);


    }

    public void addHourlyEmp() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter SSN: ");
        String SSN = keyboard.nextLine();
        System.out.println("Enter first name: ");
        String firstName = keyboard.nextLine();
        System.out.println("Enter last name: ");
        String phone = keyboard.nextLine();
        while (!phone.matches("[0-9]{7,}")) {
            System.out.println("Invalid phone number. Please type again: ");
            phone = keyboard.nextLine();
        }

        System.out.println("Enter birthday (dd/mm/yyyy): ");
        String birthday = keyboard.nextLine();
        while (!birthday.matches("^(0[1-9]|[12][0-9]|3[01])[- /.](0[1-9]|1[012])[- /.](19|20)\\d\\d$")) {
            System.out.println("Invalid input. Please type again: ");
            birthday = keyboard.nextLine();
        }

        String lastName = keyboard.nextLine();
        System.out.println("Enter wage: ");
        double wage = keyboard.nextDouble();
        System.out.println("Enter working hours: ");
        double workingHours = keyboard.nextDouble();

        HourlyEmployee newHourlyEmployee = new HourlyEmployee(SSN, firstName, lastName, wage, workingHours);

        EmployeeList.put(newHourlyEmployee.getSsn(), newHourlyEmployee);

    }

    public void displayEmployeeList() {
        EmployeeList.forEach((key, value) -> {
            System.out.println(value);
        });
    }

    public void searchEmployee() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a name you want to search: ");
        String searchName = keyboard.nextLine();

        EmployeeList.forEach((key, value) -> {
            if (value.getFirstName().equalsIgnoreCase(searchName) || value.getLastName().equalsIgnoreCase(searchName)) {
                System.out.println(value);
            }
        });
    }

    public void displayDepartmentList() {
        List<Department> departmentList = new ArrayList<>();

        //Enter number of departments and department name
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many departments do you want to enter: ");
        int deptNum = keyboard.nextInt();
        keyboard.nextLine();
        int count = 0;
        do {
            System.out.println("Enter department " + (count + 1) + " name: ");
            String deptName = keyboard.nextLine();

            Department newDepartment = new Department(deptName);
            departmentList.add(newDepartment);

            count++;
        } while (count < deptNum);

        System.out.println("THE NAME OF THE DEPARTMENTS: ");
        for (Department dept : departmentList
        ) {
            System.out.println(dept);
        }

        System.out.println();
        System.out.println("Can't solve!");
    }


    public void calcSalary() {
        System.out.println("Can't solve");
    }


    public void start() {
        Scanner keyboard = new Scanner(System.in);
        int choice;

        do {
            System.out.println("==== CHOOSE A NUMBER: ====");
            System.out.println("1. Add Salaried employee: ");
            System.out.println("2. Add Hourly employees: ");
            System.out.println("3. Display employees: ");
            System.out.println("4. Search employee by name: ");
            System.out.println("5. Display department lists and employees in each department: ");
            System.out.println("6. Payment and average payrate: ");
            System.out.println("7. Exit");
            System.out.println();
            System.out.println("===== YOU CHOOSE: ");
            choice = keyboard.nextInt();

            switch (choice) {
                case 1:
                    addSalariedEmp();
                    break;
                case 2:
                    addHourlyEmp();
                    break;
                case 3:
                    displayEmployeeList();
                    break;
                case 4:
                    searchEmployee();
                    break;
                case 5:
                    displayDepartmentList();
                    break;
                case 6:
                    calcSalary();
                    break;
                case 7:
                    System.out.println("Quit program");
                    break;
                default:
                    System.out.println("Invalid input. Please enter again.");
            }

        } while (choice != 7);
    }
}
