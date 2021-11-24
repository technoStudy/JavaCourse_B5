package Day25._02_InstanceModifiers.ProtectedModifier.Other;

import Day25._02_InstanceModifiers.ProtectedModifier.Same.Person;

public class PersonSubClass extends Person {

    public static void main(String[] args) {

        PersonSubClass personSubClass = new PersonSubClass();

        System.out.println(personSubClass.personName);

        personSubClass.getPersonName();

    }

}
