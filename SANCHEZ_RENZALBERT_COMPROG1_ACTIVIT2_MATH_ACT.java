import java.util.Scanner;
public class SANCHEZ_RENZALBERT_COMPROG1_ACTIVIT2_MATH_ACT {
    
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter your input number: ");
        
        double num1 = a.nextDouble();
            double num2 = Math.floor(num1);
                double num3 = (num1 - num2);
        System.out.println("The rounded value of " + num1 + " is ");
        if (num3 > 0.5) {
            System.out.println(Math.ceil(num1) + "0");
        } else {
            System.out.println(Math.floor(num1) + "0");
        }
        
    }
    
}