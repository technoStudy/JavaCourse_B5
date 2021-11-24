package Day22.CompanyApp_Homework;

public class CompanyMain {

    public static void main(String[] args) {

        Company TechnoStudy = new Company();

        TechnoStudy.companyName = "TechnoStudy INC";
        TechnoStudy.companyField = "Education";
        TechnoStudy.yearCompanyFounded = 2019;
        TechnoStudy.ownerOfCompany = "Fetih Onal";

        TechnoStudy.hireEmployee("Halit", "Instructor", 000000000);

        TechnoStudy.printProperties();

        TechnoStudy.fireEmployee();

        TechnoStudy.printProperties();

    }

}
