import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Employee_Detail {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<HashMap<String, String>> employeeList = new ArrayList<>();

        while (true) {
            System.out.println("Enter Your Choice: 1. Add Employee, 2. Display Employee Details, 3. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    addEmployee(employeeList, scanner);
                    break;
                case 2:
                    displayEmployeeDetails(employeeList);
                    break;
                case 3:
                    System.out.println("Exiting the program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addEmployee(List<HashMap<String, String>> employeeList, Scanner scanner) {
        HashMap<String, String> employee = new HashMap<>();

        System.out.print("Enter Employee ID: ");
        employee.put("ID", scanner.nextLine());

        System.out.print("Enter Employee name: ");
        employee.put("NAME", scanner.nextLine());

        System.out.print("Enter Salary: ");
        employee.put("SALARY", scanner.nextLine());

        System.out.print("Enter Contact No.: ");
        employee.put("CONTACT NUMBER", scanner.nextLine());

        System.out.print("Enter Email Address: ");
        employee.put("EMAIL ADDRESS", scanner.nextLine());

        employeeList.add(employee);
        System.out.println("Employee added successfully!");
    }

    private static void displayEmployeeDetails(List<HashMap<String, String>> employeeList) {
        if (employeeList.isEmpty()) {
            System.out.println("No employees in the list.");
            return;
        }

        System.out.println("Employee Details:");
        System.out.println("ID\tNAME\tSALARY\tCONTACT NUMBER\tEMAIL ADDRESS");
        for (HashMap<String, String> employee : employeeList) {
            System.out.println(employee.get("ID") + "\t" +
                    employee.get("NAME") + "\t" +
                    employee.get("SALARY") + "\t" +
                    employee.get("CONTACT NUMBER") + "\t" +
                    employee.get("EMAIL ADDRESS"));
        }
    }
}