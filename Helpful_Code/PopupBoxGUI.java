package Java.Helpful_Code;

//importing From java Library
import javax.swing.JOptionPane;

public class PopupBoxGUI {

    public static void main(String args[]){

        //Creating a String Variable with the JOptionPane GUI Interface
        String Name = JOptionPane.showInputDialog("Eneter Your Name");
        //I am displaying String Variable with JOptionPane showMessageDialog
        JOptionPane.showMessageDialog(null, "Hello : " + Name);

        //Creating a Integer/Int Variable with the JOptionPane GUI Interface by using Integer.parseInt
        int Number = Integer.parseInt(JOptionPane.showInputDialog("Please enter a number"));
        //I am displaying Integer/Int Variable with JOptionPane showMessageDialog
        JOptionPane.showMessageDialog(null, "Number : "+Number);

        //Creating a Factorial/Double Variable with the JOptionPane GUI Interface by using Double.parseDouble
        double DoubleData = Double.parseDouble(JOptionPane.showInputDialog("Please enter a Factorial"));
        //I am displaying Double Variable with JOptionPane showMessageDialog
        JOptionPane.showMessageDialog(null, "Double : "+DoubleData);
    
    }
    

}
