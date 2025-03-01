import javax.swing.JOptionPane;

public class CalculateTwoNumbers {
    public static void main(String[] args) {
        String strNum1, strNum2;

        strNum1 = JOptionPane.showInputDialog(null,  
                  "Please input the first number:",  
                  "Input First Number", JOptionPane.INFORMATION_MESSAGE);

        strNum2 = JOptionPane.showInputDialog(null,  
                  "Please input the second number:",  
                  "Input Second Number", JOptionPane.INFORMATION_MESSAGE);

        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);

        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;

        String divisionResult = (num2 != 0) ? "Quotient: " + (num1 / num2) : "Cannot divide by zero!";

        String resultMessage = "Sum: " + sum + "\n" +
                               "Difference: " + difference + "\n" +
                               "Product: " + product + "\n" +
                               divisionResult;

        JOptionPane.showMessageDialog(null, resultMessage,  
                  "Calculation Result", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
