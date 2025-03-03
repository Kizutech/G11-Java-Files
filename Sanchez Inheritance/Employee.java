public class Employee {
    private String name;
    private String number;
    private String type;
    private String salary;

    //Constructor
    public Employee() {
        this.name = name;
        this.number = number;
        this.type = type;
        this.salary = salary;
    }

    //Getter and Setters
    public void setName (String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setNumber(String string) {
        this.number = string;
    }
    public String getNumber() {
        return number;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }
    public void setSalary(String string) {
        this.salary = string;
    }
    public String getSalary() {
        return salary;
    }

    void workMethod() {
        System.out.println("Employee Type: " + getType());
        System.out.println("Employee Name: " + getName());
        System.out.println("Employee Salary: " + getSalary());
    }
}
