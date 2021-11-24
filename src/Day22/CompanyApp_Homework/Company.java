package Day22.CompanyApp_Homework;

public class Company {

    String companyName;
    int yearCompanyFounded;
    String companyField;
    String ownerOfCompany;
    Employee employee;

    public void hireEmployee(String employeeName, String title, int ssn) {
        employee = new Employee();
        employee.employeeName = employeeName;
        employee.title = title;
        employee.ssn = ssn;
    }

    public void fireEmployee() {
        employee = null;
    }

    public void printProperties() {
        System.out.println("Company Name: " + companyName);
        System.out.println("Year " + companyName + " Founded " + yearCompanyFounded);
        System.out.println("Company Field: " + companyField);
        System.out.println("Owner of Company: " + ownerOfCompany);
        if (employee != null)
            employee.printProperties();
    }

}
