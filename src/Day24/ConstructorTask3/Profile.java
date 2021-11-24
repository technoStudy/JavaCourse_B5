package Day24.ConstructorTask3;

public class Profile {

    String firstName;
    String lastName;
    String address;
    String birthDate;
    String phone;
    String email;
    String nickname;

    // in Constructor chain "this()" should be the first statement in constructor body

    // Constructor 1
    public Profile(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Constructor 2
    public Profile(String firstName, String lastName, String birthDate) {
        this(firstName, lastName); // using Constructor 1
        this.birthDate = birthDate;
    }

    // Constructor 3
    public Profile(String firstName, String lastName, String address,
                   String birthDate, String phone, String email, String nickname) {
        this(firstName, lastName, birthDate); // using Constructor 2\
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.nickname = nickname;
    }


}
