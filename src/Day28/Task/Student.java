package Day28.Task;

public class Student {

    private String name;
    private int age;
    private String country;
    private char grade;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    // getter - age
    public int getAge() {
        return age;
    }

    // setter - age
    public void setAge(int age) {
        this.age = age;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

}
