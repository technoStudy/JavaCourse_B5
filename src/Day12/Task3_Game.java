package Day12;

import java.util.Scanner;

public class Task3_Game {

    // ask number from user between  0  and 5
    // generate a random number between 0 - 5
    // check if the user number and random number are equal
    // if equals print "you win" else "you lose"

    // Note: if number user provide is between 0 - 5 run program, else print "Invalid"

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number between 0 and 5 -> ");
        int numberFromUser = scanner.nextInt();

        int randomNumber = (int) (Math.random() * 6);

        if (numberFromUser <= 5 && numberFromUser >=0){
            if (numberFromUser == randomNumber){
                System.out.println("YOU WIN!");
            }else {
                System.out.println("You Lose because random number is: " + randomNumber);
            }
        }else {
            System.out.println("INVALID NUMBER");
        }

    }

}
