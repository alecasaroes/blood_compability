import java.util.*;


public class Main {
    public static boolean is_blood_type_exist(String bloodType){
        String list_of_blood_types[] = {"A+", "O+", "B+", "AB+", "A-", "O-", "B-", "AB-"};
        int iterator = 0, i = 0;

        // iterate the array of blood type, one by one
        // if the result of comparison is equal to 0 means the strings matches
        // so, return true. if is different to 0 blood type passed doesn't exists
        while (iterator < list_of_blood_types.length){
            i = bloodType.compareTo(list_of_blood_types[iterator]);
            if (i == 0)
                return true;
            iterator++;
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner keyboard_input = new Scanner(System.in);
        String blood_type;
        boolean avaiable_blood_type = false;

        //getting input from user
        do {
            System.out.print("Inform your blood type: ");
            blood_type = keyboard_input.nextLine().toUpperCase();

            //check if the blood type exists calling a function and passing the value entered.
            // if exists, change variable to true to get out of 'do-while' at the condition
            if (is_blood_type_exist(blood_type))
                avaiable_blood_type = true;

            // if the variable still false means the blood type doesn't exist.
            // so ask user to enter value again
            if(!avaiable_blood_type)
                System.out.format("Blood type %s doesn't exist, please type again.%n", blood_type);

        } while (!avaiable_blood_type);

        int choice = 0;
        boolean correct_choice = false;

        //repeat the question until get the right choice
        do {
            System.out.print("Do you want to know about giving or receiving (1 for Gives, 2 for Receives): ");
            choice = keyboard_input.nextInt();

            // if is correct choice the while condition wont work anymore
            if (choice == 1 || choice == 2)
                correct_choice = true;

            //otherwise the choice still incorrect (false)
            //while condition will still work
            if (correct_choice == false)
                System.out.println("Choice doesn't exist, please try again: ");

        } while (!correct_choice);


        switch (choice) {
            case 1:
                System.out.format("The blood type for %s to give are ", blood_type);
                //print case for every possbility of blood type:
                if (blood_type.compareTo("O-") == 0){
                    System.out.format("Everyone.%n");
                    break;
                } else if (blood_type.compareTo("O+") == 0) {
                    System.out.format("O+, A+, B+, AB+.%n");
                    break;
                } else if (blood_type.compareTo("B-") == 0) {
                    System.out.format("B+, B-, AB+, AB-.%n");
                    break;
                } else if (blood_type.compareTo("B+") == 0) {
                    System.out.format("B+, AB+.%n");
                    break;
                } else if (blood_type.compareTo("A-") == 0) {
                    System.out.format("A+, A-, AB+, AB-.%n");
                    break;
                }  else if (blood_type.compareTo("A+") == 0) {
                    System.out.format("A+, AB+.%n");
                    break;
                } else if (blood_type.compareTo("AB-") == 0) {
                    System.out.format("AB+, AB-.%n");
                    break;
                } else if (blood_type.compareTo("AB+") == 0) {
                    System.out.format("AB+.%n");
                    break;
                }
            case 2:
                System.out.format("The blood type for %s to receive are ", blood_type);
                //print case for every possibility of blood type:
                if (blood_type.compareTo("O-") == 0){
                    System.out.format("O-%n");
                    break;
                } else if (blood_type.compareTo("O+") == 0) {
                    System.out.format("O+, O-%n");
                    break;
                } else if (blood_type.compareTo("B-") == 0) {
                    System.out.format("B-, O-%n");
                    break;
                } else if (blood_type.compareTo("B+") == 0) {
                    System.out.format("B+, B-, O+, O-%n");
                    break;
                } else if (blood_type.compareTo("A-") == 0) {
                    System.out.format("A-, O-%n");
                    break;
                }  else if (blood_type.compareTo("A+") == 0) {
                    System.out.format("A+, A-, O+, O-%n");
                    break;
                } else if (blood_type.compareTo("AB-") == 0) {
                    System.out.format("AB-, A-, B-, O-%n");
                    break;
                } else if (blood_type.compareTo("AB+") == 0) {
                    System.out.format("Everyone%n");
                    break;
                }
        }
    }
}
