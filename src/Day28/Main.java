package Day28;

public class Main {

    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.setBaseSalary(-5);

        int wage = employee.calculateWage(12);
        System.out.println(wage);


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
