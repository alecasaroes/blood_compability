import java.util.*;

public class Main {
    public static boolean is_blood_type_exist(String bloodType){
        String []list_of_blood_types = {"A+", "O+", "B+", "AB+", "A-", "O-", "B-", "AB-"};
        int iterator = 0, i;
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
        boolean correct_blood_type = false, correct_choice = false;
        int choice;

        do {
            System.out.print("Inform your blood type: ");
            blood_type = keyboard_input.nextLine().toUpperCase();

            if (is_blood_type_exist(blood_type))
                correct_blood_type = true;

            if(!correct_blood_type)
                System.out.format("Blood type %s doesn't exist, please type again.%n", blood_type);

        } while (!correct_blood_type);

        do {
            System.out.print("Do you want to know about giving or receiving (1 for Gives, 2 for Receives): ");
            choice = keyboard_input.nextInt();

            if (choice == 1 || choice == 2)
                correct_choice = true;

            if (!correct_choice)
                System.out.println("Choice doesn't exist, please try again: ");

        } while (!correct_choice);

        switch (choice) {
            case 1:
                System.out.format("The blood type for %s to give are ", blood_type);
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
