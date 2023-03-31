public class Employee {
    private String firstName;
    private String secondName;
    private String middleName;
    private int department;
    private double salary;
    private int id;
    static int counter = 0;
        public Employee(String firstName, String secondName, String middleName, int department, double salary, int id) {
            this.firstName = firstName;
            this.secondName = secondName;
            this.middleName = middleName;
            this.department = department;
            this.salary = salary;
            counter++;
            this.id = counter;
        }
    public int getDepartment() {
        return department;
    }
    public double getSalary() {
        return salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getMiddleName() {
        return middleName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName: " + firstName +
                ", secondName: " + secondName +
                ", middleName: " + middleName +
                ", department: " + department +
                ", salary: " + salary +
                ", id:" + id +
                '}';
    }
}


