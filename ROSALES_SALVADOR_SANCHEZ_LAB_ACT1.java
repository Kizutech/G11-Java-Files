/**
 * @(#)ROSALES_SALVADOR_SANCHEZ_LAB_ACT1.java
 *
 * ROSALES_SALVADOR_SANCHEZ_LAB_ACT1 application
 *
 * @author
 * @version 1.00 2023/9/21
 */
import java.util.Scanner; // import the Scanner class
public class ROSALES_SALVADOR_SANCHEZ_LAB_ACT1 {

  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);

    // Enter username and press Enter
    System.out.print("Enter Your Name: ");
    String Name = myObj.nextLine();


    // Enter section and press Enter
    System.out.print("Enter Your Section: ");
    String section = myObj.nextLine();

     // Enter subject and press Enter
    System.out.print("Enter Your Subject: ");
    String subject = myObj.nextLine();


    System.out.println();
    System.out.println();
     System.out.println("Name: " + Name);
     System.out.println("Section: " + section);
     System.out.println("Subject: " + subject);







  }
}




