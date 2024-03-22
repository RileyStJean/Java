
package Java.Helpful_Code;

//Importing a java class libary
import java.util.Scanner;


public class User_Input {
    
    public static void main(String[] arg){

        //Creating a new variable called scanner that equals a new Scanner
        Scanner scanner = new Scanner(System.in);

         //Printing String
        System.out.println("Type a Word : ");
        //Creating a Scanner that is a String
        String word = scanner.nextLine();

         //Printing String
        System.out.println("Type a Number : ");
        //Creating a Scanner that is a integer 
        int number = scanner.nextInt();

        //Clearing the Scanner
        scanner.nextLine();

         //Printing String
        System.out.println("Type a Food : ");
        //Creating a Scanner that is a String
        String food = scanner.nextLine();

        //Printing String and variables
        System.err.println("User Tpye : " + word);
        System.err.println("User Tpye : " + number);
        System.out.println("Type a Food : "+ food);
    };





};
