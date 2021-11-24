package Day22.PetManagementSystem;

import java.util.Arrays;

public class Fish {

    String color;
    int age;
    String type;
    String[] listOfNeeds;

    Owner ownerInfo;

    public void printProperties() {
        System.out.println("Color: " + color + "\nAge: " + age
                + "\nType: " + type + "\nListOfNeeds: " + Arrays.toString(listOfNeeds));
        ownerInfo.printOwnerInfo();
    }

}
