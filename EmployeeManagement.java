import java.util.*;

class Employee {
    private int id;
    private String name;
    private double salary;
    private String contactNo;
    private String email;

    public Employee(int id, String name, double salary, String contactNo, String email) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.contactNo = contactNo;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format("%-5d | %-20s | %-10.2f | %-15s | %-25s", id, name, salary, contactNo, email);
    }
}

class EmployeeManager {
    private List<Employee> employees = new ArrayList<>();

    // Add new employee
    public void addEmployee(Employee emp) {
        employees.add(emp);
    }

    // Search employee by ID
    public Employee searchEmployee(int id) {
        for (Employee emp : employees) {
            if (emp.getId() == id) {
                return emp;
            }
        }
        return null;
    }

    // Edit employee details
    public void editEmployee(int id, String newName, double newSalary, String newContactNo, String newEmail) {
        Employee emp = searchEmployee(id);
        if (emp != null) {
            emp.setName(newName);
            emp.setSalary(newSalary);
            emp.setContactNo(newContactNo);
            emp.setEmail(newEmail);
        }
    }

    // Overloaded method for editing specific fields
    public void editEmployee(int id, String newName) {
        Employee emp = searchEmployee(id);
        if (emp != null) {
            emp.setName(newName);
        }
    }

    public void editEmployee(int id, double newSalary) {
        Employee emp = searchEmployee(id);
        if (emp != null) {
            emp.setSalary(newSalary);
        }
    }

    public void editEmployee(int id, String newContactNo, boolean isContact) {
        Employee emp = searchEmployee(id);
        if (emp != null) {
            emp.setContactNo(newContactNo);
        }
    }

    public void editEmployee(int id, String newEmail, boolean isContact, boolean isEmail) {
        Employee emp = searchEmployee(id);
        if (emp != null) {
            emp.setEmail(newEmail);
        }
    }

    // Delete specific details of an employee
    public void deleteEmployeeDetail(int id, String detail) {
        Employee emp = searchEmployee(id);
        if (emp != null) {
            switch (detail.toLowerCase()) {
                case "id":
                    emp.setId(0);
                    break;
                case "name":
                    emp.setName("");
                    break;
                case "salary":
                    emp.setSalary(0.0);
                    break;
                case "contact":
                    emp.setContactNo("");
                    break;
                case "email":
                    emp.setEmail("");
                    break;
                default:
                    System.out.println("Invalid choice");
                    return;
            }
            displayEmployee(emp);
        }
    }

    public void displayAllEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees found.");
        } else {
            System.out.println("Employee Details");
            System.out.println("ID   | NAME                 | SALARY     | CONTACT NUMBER | EMAIL ADDRESS");
            System.out.println("--------------------------------------------------------------------------");
            for (Employee emp : employees) {
                System.out.println(emp);
            }
        }
    }

    public void displayEmployee(Employee emp) {
        if (emp != null) {
            System.out.println("Employee Details");
            System.out.println("ID   | NAME                 | SALARY     | CONTACT NUMBER | EMAIL ADDRESS");
            System.out.println("--------------------------------------------------------------------------");
            System.out.println(emp);
        } else {
            System.out.println("Employee Details are not Available, Please Enter a Valid ID");
        }
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeManager manager = new EmployeeManager();

        System.out.println("WELCOME TO THE EMPLOYEE MANAGEMENT SYSTEM");

        while (true) {
            System.out.println("\n1. Add New Employee Details");
            System.out.println("2. Search for Employee");
            System.out.println("3. Edit Employee Details");
            System.out.println("4. Delete Employee Details");
            System.out.println("5. Display all Employees working in this company");
            System.out.println("6. Exit");
            System.out.print("\nEnter Your Choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Employee name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Salary: ");
                    double salary = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Contact No.: ");
                    String contactNo = sc.nextLine();
                    System.out.print("Email Address: ");
                    String email = sc.nextLine();
                    Employee newEmployee = new Employee(id, name, salary, contactNo, email);
                    manager.addEmployee(newEmployee);
                    manager.displayEmployee(newEmployee);
                    break;
                case 2:
                    System.out.print("Enter the Employee ID to search: ");
                    int searchId = sc.nextInt();
                    Employee foundEmployee = manager.searchEmployee(searchId);
                    manager.displayEmployee(foundEmployee);
                    break;
                case 3:
                    System.out.println("EDIT Employee Details:");
                    System.out.println("1. Employee ID");
                    System.out.println("2. Name");
                    System.out.println("3. Salary");
                    System.out.println("4. Contact No.");
                    System.out.println("5. Email - id");
                    System.out.println("6. Go Back");
                    System.out.print("Enter Your Choice: ");
                    int editChoice = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter the Employee ID: ");
                    int editId = sc.nextInt();
                    sc.nextLine();

                    switch (editChoice) {
                        case 1:
                            System.out.print("ENTER NEW EMPLOYEE ID: ");
                            int newId = sc.nextInt();
                            Employee emp = manager.searchEmployee(editId);
                            if (emp != null) {
                                emp.setId(newId);
                                manager.displayEmployee(emp);
                            }
                            break;
                        case 2:
                            System.out.print("ENTER NEW EMPLOYEE NAME: ");
                            String newName = sc.nextLine();
                            manager.editEmployee(editId, newName);
                            manager.displayEmployee(manager.searchEmployee(editId));
                            break;
                        case 3:
                            System.out.print("ENTER NEW EMPLOYEE SALARY: ");
                            double newSalary = sc.nextDouble();
                            manager.editEmployee(editId, newSalary);
                            manager.displayEmployee(manager.searchEmployee(editId));
                            break;
                        case 4:
                            System.out.print("ENTER NEW EMPLOYEE CONTACT NO: ");
                            String newContactNo = sc.nextLine();
                            manager.editEmployee(editId, newContactNo, true);
                            manager.displayEmployee(manager.searchEmployee(editId));
                            break;
                        case 5:
                            System.out.print("ENTER NEW EMPLOYEE EMAIL ID: ");
                            String newEmail = sc.nextLine();
                            manager.editEmployee(editId, newEmail, true, true);
                            manager.displayEmployee(manager.searchEmployee(editId));
                            break;
                        case 6:
                            break;
                        default:
                            System.out.println("Invalid choice");
                            break;
                    }
                    break;
                case 4:
                    System.out.println("DELETE Employee Details:");
                    System.out.println("1. Employee ID");
                    System.out.println("2. Name");
                    System.out.println("3. Salary");
                    System.out.println("4. Contact No.");
                    System.out.println("5. Email - id");
                    System.out.println("6. Go Back");
                    System.out.print("Enter Your Choice: ");
                    int deleteChoice = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter the Employee ID: ");
                    int deleteId = sc.nextInt();
                    sc.nextLine();

                    switch (deleteChoice) {
                        case 1:
                            manager.deleteEmployeeDetail(deleteId, "id");
                            break;
                        case 2:
                            manager.deleteEmployeeDetail(deleteId, "name");
                            break;
                        case 3:
                            manager.deleteEmployeeDetail(deleteId, "salary");
                            break;
                        case 4:
                            manager.deleteEmployeeDetail(deleteId, "contact");
                            break;
                        case 5:
                            manager.deleteEmployeeDetail(deleteId, "email");
                            break;
                        case 6:
                            break;
                        default:
                            System.out.println("Invalid choice");
                            break;
                    }
                    break;
                case 5:
                    manager.displayAllEmployees();
                    break;
                case 6:
                    System.out.println("Exiting the system. Goodbye!");
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
