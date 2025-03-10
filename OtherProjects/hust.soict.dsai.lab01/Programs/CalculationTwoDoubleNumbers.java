package Programs;
//Example 5: Calculate sum, difference, product, and quotient of two double numbers are entered by users
import javax.swing.JOptionPane;
public class CalculationTwoDoubleNumbers {
    public static void main(String args[]){
        String strNum1, strNum2;
        String strSum = "Bao Phuc - The sum of two numbers is: ";
        String strDifference = "Bao Phuc - The difference of two numbers is: ";
        String strProduct = "Bao Phuc -The product of two numbers is: ";
        String strQuotient = "Bao Phuc - The quotient of two numbers is: ";

        strNum1 = JOptionPane.showInputDialog(null, 
                "Bao Phuc - Please input the first number: ", 
                "Input the first number", 
                JOptionPane.INFORMATION_MESSAGE);
        double Num1 = Double.parseDouble(strNum1);

        strNum2 = JOptionPane.showInputDialog(null, 
                "Bao Phuc - Please input the second number: ", 
                "Input the second number", 
                JOptionPane.INFORMATION_MESSAGE);
        double Num2 = Double.parseDouble(strNum2);

        double sum = Num1 + Num2;
        double difference = Math.abs(Num1 - Num2);
        double product = Num1 * Num2;
        double quotient = Num2 != 0 ? Num1 / Num2 : 0;

        JOptionPane.showMessageDialog(null, strSum + sum + "\n" + strDifference + difference + "\n" 
                    + strProduct + product + "\n" + strQuotient + quotient,
                    "Show calculation results", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);

    }
}
