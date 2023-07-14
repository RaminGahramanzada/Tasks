package org.example.minifamily;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Human michael = new Human("Michael");
        Pet rock = new Pet();
        rock.setSpecies("dog");
        rock.setNickName("Rock");
        rock.setAge(5);
        rock.setTrickLevel(75);

        michael.setPet(rock);

        Human mother = new Human("Jane Karleone");
        Human father = new Human("Vito Karleone");

        michael.setMother(mother);
        michael.setFather(father);

        String humanString = michael.toString();
        System.out.println(humanString);
        michael.describePet();
        michael.greetPet();
        System.out.print("Enter 'yes' to feed the pet or 'no' to skip: ");
        String userInput = sc.nextLine().trim().toLowerCase();

        boolean feedPet = userInput.equals("yes");;

        michael.feedPet(feedPet);









    }
}
