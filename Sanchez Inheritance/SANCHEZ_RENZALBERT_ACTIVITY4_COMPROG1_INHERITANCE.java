import java.util.Scanner;
public class SANCHEZ_RENZALBERT_ACTIVITY4_COMPROG1_INHERITANCE {
    public static void main(String[] args) {
        Employee A = new Employee();
        Hmanager C = new Hmanager();
        Scanner B = new Scanner(System.in);

        //Setter
        System.out.print("Input Employee Name: ");
        A.setName(B.nextLine());
        System.out.println();
        System.out.print("Input Employee Number: ");
        A.setNumber(B.nextLine());
        System.out.println();
        System.out.print("Employee Type (Employee or Manager): ");
        A.setType(B.nextLine());
        System.out.println();
        System.out.print("Employee Salary: ");
        A.setSalary(B.nextLine());
        System.out.println();

        if (A.getType().equals("Employee")) {
            Hmanager E = new Hmanager();
            A.workMethod();
            E.addNewEmployee();
        } else if (A.getType().equals("Manager")) {
            Hmanager F = new Hmanager();
            F.setType(A.getType());
            F.setSalary(A.getSalary());
            F.workMethod();
            F.addNewEmployee();
        }
    }
}