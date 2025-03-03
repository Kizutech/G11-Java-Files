import java.util.Scanner;
public class SANCHEZ_RENZALBERT_ACTIVITY3_COMPROG1_JAVA {
    
    public static void main(String[] args) {
        Scanner T = new Scanner(System.in);
        int count = 5;
        double sum = 0;
        
        for (int i = 1; i <= count; i++) {
            System.out.print("Enter number " + i + ": ");
            if (T.hasNextDouble()) {
                double number = T.nextDouble();
                sum += number;
            } else {
                System.out.print("Invalid Number: ");
                i--;
            }
            T.nextLine();
            
            double average = sum / count;
            
            System.out.println("Sum of the numbers: " + sum);
            System.out.println("Average of: " + average);
        }
    }
    
}