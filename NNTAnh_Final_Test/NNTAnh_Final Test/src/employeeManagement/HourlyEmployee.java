package employeeManagement;

public class HourlyEmployee extends Employee{
    private double wage;
    private double workingHours;

    public HourlyEmployee(String ssn, String firstName, String lastName, double wage, double workingHours) {
        super(ssn, firstName, lastName);
        this.wage = wage;
        this.workingHours = workingHours;
    }

    public HourlyEmployee(double wage, double workingHours) {
        this.wage = wage;
        this.workingHours = workingHours;
    }

    public HourlyEmployee(){}


    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(double workingHours) {
        this.workingHours = workingHours;
    }

    @Override
    public double getPaymentAmount() {
        return wage * workingHours;
    }




    public String toString()
    {
        String str = "SSN: " + getSsn() + "\n" +
                "First name: " + getFirstName() + "\n" +
                "Last name: " + getLastName() + "\n" +
                "Wage: " + wage + "\n" +
                "Working hours: " + workingHours + "\n";
        return str;
    }


}
