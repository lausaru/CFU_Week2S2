import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        BigDecimal num1 = new BigDecimal("2.3");
        BigDecimal num2 = new BigDecimal("1.5");
        System.out.println("Input numbers: " + num1 + " and " + num2);

        // Addition
        BigDecimal sum = num1.add(num2);
        System.out.println("Addition result: " + sum);

        // Subtraction
        BigDecimal subt = num1.subtract(num2);
        System.out.println("Subtraction result: " + subt);

        // Multiplication
        BigDecimal mult = num1.multiply(num2);
        System.out.println("Multiplication result: " + mult);

        // Division
        BigDecimal div = num1.divide(num2, 2, RoundingMode.HALF_UP); // rounds 2 decimal places to half up
        System.out.println("Division result: " + div);

        // Challenge - operation (2.3 * x + 1.5) / (x - 0.8)
        BigDecimal x = new BigDecimal("3.2");
        BigDecimal num3 = new BigDecimal("0.8");
        // --> 1st parenthesis
        BigDecimal multx = num1.multiply(x);
        BigDecimal numerator = multx.add(num2);
        // --> 2nd parenthesis and final division
        BigDecimal denominator = x.subtract(num3);
        BigDecimal result = numerator.divide(denominator, 10, RoundingMode.HALF_UP);
        System.out.println("The result of the operation (2.3 * x + 1.5) / (x - 0.8) when x = " + x + " is: " + result);
        // System.out.println("Result after setting scale to 5" + result.setScale(5, RoundingMode.HALF_UP));

        float test1 = 2f;
        float test2 = 3f;
        System.out.println(test1/test2);

        double test3 = 2d;
        double test4 = 3d;
        System.out.println(test3/test4);

        denominator = new BigDecimal("6.2");
    }
}