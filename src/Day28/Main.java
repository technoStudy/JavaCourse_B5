package Day28;

public class Main {

    public static void main(String[] args) {

        Employee employee = new Employee("Halit", 023324204);
        employee.setBaseSalary(90_000);
        employee.setHourlyRate(55);
        System.out.println(employee.getName());

        System.out.println("Base Salary: " + employee.getBaseSalary());
        System.out.println("Hourly Rate: " + employee.getHourlyRate());

        int wage = employee.calculateWage(12);
        System.out.println("Wage: " + wage);


//        EMPLOYEE IMPLEMENTATION WITHOUT OOP
//        int baseSalary = 90_000;
//        int hourlyRate = -50;
//        int extraHours = 10;
//
//        int wage = calculateWage(baseSalary, hourlyRate, extraHours);
//        System.out.println(wage);

//    public static int calculateWage(
//            int baseSalary,
//            int hourlyRate,
//            int extraHours
//    ) {
//        return baseSalary + (hourlyRate * extraHours);
//    }
    }
}
