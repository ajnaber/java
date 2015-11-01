import java.util.Scanner;

//This class repeats the user input, regardless of type
public class ScannerExample {

    public static void main(String[] args) {

        //Allows user to read from System.in
        Scanner scan = new Scanner(System.in);

        //Prompt the user for input
        System.out.print("Enter input (Enter Q to Quit): ");

        //hasNext() returns true if scanner has another token in its input
        while(scan.hasNext()) {

            //Get user input and assign to input
            String input = scan.nextLine();

            //If user inputs Q then break out of the loop
            if(input.equals("Q")) { break; }

            //Output the information that was input
            System.out.println(input);

            //Prompt the user for input
            System.out.print("Enter more input: ");

        }
    }





}
