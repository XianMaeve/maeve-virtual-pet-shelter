import java.util.Scanner;

public class VirtualPetShelterApp {

    public static void main(String[] args) {

        VirtualPetShelter myPetShelter = new VirtualPetShelter();

        myPetShelter.generateShelter(4);
        myPetShelter.feedAll();
        myPetShelter.waterAll();

        Scanner input = new Scanner(System.in);

        String action = "";
        String name = "";
        String description = "";

        System.out.println("Thank you for volunteering at your local cat shelter!");

        while (!action.equals("quit")) {

            System.out.println("-Name- -Hunger- -Thirst- -Entertainment-");
            myPetShelter.displayPets();

            System.out.println("What would you like to do? \n" +
                    "1: Feed your cats \n" +
                    "2: Give your cats some water \n" +
                    "3: Play with a cats \n" +
                    "4: Admit a new cats to the shelter \n" +
                    "5: Adopt a cat out of the shelter \n" +
                    "6: Watch the cats and do nothing \n" +
                    "Type an action 1 - 5 or type \"quit\" at any time to leave");
            action = input.next().toLowerCase();

            if (action.equals("1")) {
                System.out.println("You gave the cats little a salami, as a treat");
                myPetShelter.feedAll();
            } else if (action.equals("2")) {
                System.out.println("You refilled the water bowls around the shelter!");
                myPetShelter.waterAll();
                myPetShelter.tick();
            } else if (action.equals("3")) {
                System.out.println("Who would you like to play with?");
                myPetShelter.displayPetDescriptions();
                name = input.next().toLowerCase();
                myPetShelter.play(name);
                System.out.println(name + " seems to really enjoy the attention!");
            } else if (action.equals("4")) {
                System.out.println("What would you like to name the new cat?");
                name = input.next().toLowerCase();
                input.nextLine();
                System.out.println("How would you describe the new cat?");
                description = input.nextLine().toLowerCase();
                myPetShelter.admit(name, description);
            } else if (action.equals("5")) {
                System.out.println("Which cat would you like to adopt out to their new forever home?");
                myPetShelter.displayPetDescriptions();
                name = input.next().toLowerCase();
                myPetShelter.adopt(name);
                System.out.println("Congratulations! " + name + " has left for their forever home.  We'll miss them, but hope they'll be happy.");
            } else if (action.equals("6")) {
                System.out.println("You watch the cats frolic around the shelter.");
            } else if (!action.equals("quit")) {
                System.out.println("The cats stare at you while they try to figure out what you're trying to do");
                System.out.println("Try doing one of the following: \n" +
                        "1: Feed your cats \n" +
                        "2: Give your cats some water \n" +
                        "3: Play with a cats \n" +
                        "4: Admit a new cats to the shelter \n" +
                        "5: Adopt a cat out of the shelter \n" +
                        "6: Watch the cats and do nothing \n" +
                        "Type an action 1 - 5 or type \"quit\" at any time to leave");
            }

            myPetShelter.tick();

        }

        System.out.println("Thanks for playing!");


    }

}
