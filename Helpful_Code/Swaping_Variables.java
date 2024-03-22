package Java.Helpful_Code;

public class Swaping_Variables {
    public static void main(String args[]){

            //Creating a string Variable called x
            String x = "Soda";
            //Creating a string Variable called y
            String y = "Coffee";
            //Creating a string Variable called Temp that equals Nothing or null
            String Temp = null;

            //pouring the content of x into temp
            Temp = x;
            //pouring the content of y into x
            x = y;
            //pouring the content of x/Temp into y
            y = Temp;

            //Printing output to terminal
            System.out.println("x : " + x);
            System.out.println("y : " + y);
            


    }
    
}
