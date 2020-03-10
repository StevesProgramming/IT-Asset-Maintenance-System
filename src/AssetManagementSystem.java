import java.util.Scanner;

public class AssetManagementSystem {

    public static void main(String[] args){
        // Setting up the scanner to read inputs
        Scanner readline = new Scanner(System.in);

        // Simple menu
        System.out.println("Please elect one of the following options \n" +
                "           1. Maintenance Log \n" +
                "           2. Show Log \n" +
                "           3. New Log \n" +
                "           4. Update Log \n" +
                "           5. Delete Log \n" +
                "           6. Summary of Logs \n" +
                "           \n" +
                "           0. QUIT");

        // Reading menu input
        int input = readline.nextInt();
        menuChoice(input);
    }

    private static void menuChoice(int input) {
        // Calling classes
        System.out.println(input);
        if (input == 1){
            System.out.println("1");
        } else if (input == 2){
            System.out.println("2");
        } else if (input == 3){
            System.out.println("3");
        } else if (input == 4){
            System.out.println("4");
        } else if (input == 5){
            System.out.println("5");
        } else if (input == 6){
            System.out.println("6");
        } else if (input == 0){
            System.exit(0);
        } else {
            System.out.println("Please enter a valid number");
        }
    }

    public static void maintenanceLog(){

    }
}
