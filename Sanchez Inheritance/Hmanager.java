import java.util.Scanner;
public class Hmanager extends Employee {
    
    void workMethod() {
        System.out.println("Employee Type: " + getType());
        System.out.println("Employee Salary: " + getSalary());
    }
       void addNewEmployee() {
         Scanner D = new Scanner(System.in);
        System.out.println("Are you adding another Employee?");
        String Ans = D.nextLine();
        
        if (Ans.equals("Yes")) {
        System.out.println("You can add another Employee");
    }
    else if (Ans.equals("No")) {
        System.out.println("You cannot add another Employee");
       }
       }
    
}
