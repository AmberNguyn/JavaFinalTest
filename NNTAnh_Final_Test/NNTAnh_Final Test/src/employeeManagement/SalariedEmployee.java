package employeeManagement;

public class SalariedEmployee extends Employee{
    private double commissionRate;
    private double grossSales;
    private double basicSalary;

    public SalariedEmployee(String ssn, String firstName, String lastName, double commissionRate, double grossSales, double basicSalary) {
        super(ssn, firstName, lastName);
        this.commissionRate = commissionRate;
        this.grossSales = grossSales;
        this.basicSalary = basicSalary;
    }

    public SalariedEmployee(double commissionRate, double grossSales, double basicSalary) {
        this.commissionRate = commissionRate;
        this.grossSales = grossSales;
        this.basicSalary = basicSalary;
    }

    public SalariedEmployee(){}

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public String toString()
    {
        String str = "SSN: " + getSsn() + "\n" +
                "First name: " + getFirstName() + "\n" +
                "Last name: " + getLastName() + "\n" +
                "Commission rate: " + commissionRate  + "\n" +
                "Gross sales: " + grossSales  + "\n" +
                "Basic salary: "  + basicSalary + "\n";
        return str;
    }



    @Override
    public double getPaymentAmount() {
        return commissionRate * grossSales + basicSalary;
    }
}
