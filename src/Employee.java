public class Employee {
    private final String fullName;
    private int department;
    private double salary;
    private int id;
    static int counter;
    public Employee(String fullName, int department, double salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = 1 + counter++;
    }
    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public String getFullName() {
        return fullName;
    }

    public int getId() {
        return id;
    }
    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "name:" + fullName +
                ", department: " + department +
                ", salary: " + salary +
                ", id:" + id +
                '}';
    }
}


