package Day22.PetManagementSystem;

public class MainPet {

    public static void main(String[] args) {

        Bird eagle = new Bird();

        eagle.color = "Grey";
        eagle.age = 7;
        eagle.type = "Bald Eagle";
        eagle.listOfNeeds = new String[3];
        eagle.listOfNeeds[0] = "Food";
        eagle.listOfNeeds[1] = "Water";
        eagle.listOfNeeds[2] = "Cage";

        eagle.ownerInfo = new Owner();

        eagle.ownerInfo.name = "Matthew";
        eagle.ownerInfo.ownerAge = 25;
        eagle.ownerInfo.gender = "Male";

        eagle.printProperties();




        Fish nemo = new Fish();

        nemo.color = "Orange and White";
        nemo.age = 1;
        nemo.type = "Clownfish";

        nemo.listOfNeeds = new String[2];
        nemo.listOfNeeds[0] = "Food";
        nemo.listOfNeeds[1] = "Father";

        nemo.ownerInfo = new Owner();
        nemo.ownerInfo.name = "Viktoria";
        nemo.ownerInfo.ownerAge = 25;
        nemo.ownerInfo.gender = "Female";

        nemo.printProperties();

    }

}
