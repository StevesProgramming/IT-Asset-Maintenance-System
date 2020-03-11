import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AssetManagementSystem {

    public static void main(String[] args) throws FileNotFoundException{
        // Setting up the scanner to read inputs
        Scanner readline = new Scanner(System.in);

        // Simple menu
        System.out.println("Please elect one of the following options \n" +
                "           1. Maintenance Log \n" +
                "           2. New Log \n" +
                "           3. Update Log \n" +
                "           4. Delete Log \n" +
                "           5. Summary of Logs \n" +
                "           \n" +
                "           0. QUIT");

        // Reading menu input
        int input = readline.nextInt();
        menuChoice(input);
    }

    private static void menuChoice(int input) throws FileNotFoundException {
        // Calling classes
        if (input == 1){
             maintenanceLog();
        } else if (input == 2){

        } else if (input == 3){

        } else if (input == 4){

        } else if (input == 5){

        } else if (input == 0){
            System.exit(0);
        } else {
            System.out.println("Please enter a valid number");
        }
    }

    public static void maintenanceLog() throws FileNotFoundException {
        Scanner CSV = new Scanner(new File("src/maintenancelog.csv.text"));

        // Set the delimiter used in file
        CSV.useDelimiter(",");

        System.out.println("Date \t\t Asset \t Hours");
        while (CSV.hasNext())
        {
            System.out.print(CSV.next() + "\t" );
        }

        CSV.close();
    }
}
