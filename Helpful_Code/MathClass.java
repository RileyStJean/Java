//Name: Riley
//
//
//

package Java.Helpful_Code;

public class MathClass {
        
    public static void main(String[] args) {
        
        //Double and plote
        //Creating a double/factorial Variables
        double x = 3.14;
        double y = 4.13;
        double u = -12;

        //Creating a integers/whole variables
        int c = 5;
        int v = 10;

        //Factorials Flout and Double

            //Gets the Highest number of the 2
            double a = Math.max(x, y);
            //Gets the lowest number of the 2
            double s = Math.min(x, y);
            //It finds the answer to 3.14 to the power of 3.14 that equals 27
            Double d = Math.pow(x, 3);
            //Finds the squareroot of x
            double f = Math.sqrt(x);
            //----------------------
            //double g = Math.IEEEremainder Need to look into this

            double h = Math.nextDown(x);

        //Int/integers and or whole number that uses the math class

             




        //Prints out imput
        System.out.println("Highest Variable : " + a + "\n" + "Lowest Variable : " + s + "\n" + "Power of 3.14^3 : " 
        + f + "\n" + "Square Root : " + d + "\n" + h );
    }
}
