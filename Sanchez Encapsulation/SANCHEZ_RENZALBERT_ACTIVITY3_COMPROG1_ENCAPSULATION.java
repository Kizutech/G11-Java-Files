import java.util.Scanner;
public class SANCHEZ_RENZALBERT_ACTIVITY3_COMPROG1_ENCAPSULATION {
    
    public static void main(String[] args) {
        Encupsulation B = new Encupsulation();
        Scanner A = new Scanner(System.in);

        System.out.print("Enter your Name: ");
        B.setName(A.nextLine());
        System.out.println();
        System.out.print("Enter your Age: ");
        B.setAge(A.nextLine());
        System.out.println();
        System.out.print("Enter your Gender: ");
        B.setGender(A.nextLine());
        System.out.println();
        System.out.print("Enter your Country: ");
        B.setCountry(A.nextLine());
        System.out.println();

        System.out.println("Name: " + B.getName());
        System.out.println();
        System.out.println("Age: " + B.getAge());
        System.out.println();
        System.out.println("Gender: " + B.getGender());
        System.out.println();
        System.out.println("Country: " + B.getCountry());
        System.out.println();
    }
}