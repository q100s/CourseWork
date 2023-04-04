import java.util.Arrays;

public class EmployeeBook {
    private Employee[] empls = new Employee[10];
    public EmployeeBook() {
        empls[0] = new Employee("Ivan Ivanovich Ivanov", 1, 75_987);
        empls[1] = new Employee("Petr Petrovich Petrov", 2, 60_582);
        empls[2] = new Employee("Steve Paul Jobs", 3, 88_888);
        empls[3] = new Employee("Ekaterina Petrovna Romanova", 4, 100_000);
        empls[4] = new Employee("Cool Dude Guy", 3, 70_000);
        empls[5] = new Employee("Svetlana Nikolaevna Li", 4, 70_000);
        empls[6] = new Employee("Naruto Uzumaki", 5, 83_666);
        empls[7] = new Employee("Elizaveta Nikolayevna Rovanova", 2, 77_777);
        empls[8] = new Employee("Semenov Semen Semenovich", 1, 97_782);
        empls[9] = new Employee("NoName Person", 5, 61_339);
    }
    public void printFullInfo() {
        for (Employee empl : empls) {
            if (empl == null) {
                continue;
            }
        }
        System.out.println(Arrays.toString(empls));
    }
    public double countSalaryExpenses() {
        double expenses = 0;
        for (Employee empl : empls) {
            if (empl != null) {
                expenses = expenses + empl.getSalary();
            }
        }
        return expenses;
    }
    public double countSalaryExpenses(int department) {
        double expenses = 0;
        for (Employee empl : empls) {
            if (empl != null && empl.getDepartment() == department) {
                expenses = expenses + empl.getSalary();
            }
        }
        return expenses;
    }
    public Employee findEmplWithMinSalary() {
        int counter = 0;
        double minSalary = empls[0].getSalary();
        for (int i = 0; i < empls.length; i++) {
            if (empls[i] != null) {
                if (minSalary > empls[i].getSalary()) {
                    minSalary = empls[i].getSalary();
                    counter = i;
                }
            }
        }
        return empls[counter];
    }
    public Employee findEmplWithMinSalary(int department) {
        int counter = 0;
        double minSalary = empls[0].getSalary();
        for (int i = 0; i < empls.length; i++) {
            if (empls[i] != null && empls[i].getDepartment() == department) {
                if (minSalary > empls[i].getSalary()) {
                    minSalary = empls[i].getSalary();
                    counter = i;
                }
            }
        }
        return empls[counter];
    }
    public Employee findEmplWithMaxSalary() {
        int counter = 0;
        double maxSalary = empls[0].getSalary();
        for (int i = 0; i < empls.length; i++) {
            if (empls[i] != null) {
                if (maxSalary < empls[i].getSalary()) {
                    maxSalary = empls[i].getSalary();
                    counter = i;
                }
            }
        }
        return empls[counter];
    }
    public Employee findEmplWithMaxSalary(int department) {
        int counter = 0;
        double maxSalary = empls[0].getSalary();
        for (int i = 0; i < empls.length; i++) {
            if (empls[i] != null && empls[i].getDepartment() == department) {
                if (maxSalary < empls[i].getSalary()) {
                    maxSalary = empls[i].getSalary();
                    counter = i;
                }
            }
        }
        return empls[counter];
    }
    public double countAverageSalary() {
        return countSalaryExpenses() / empls.length;
    }
    public void countAverageSalary(int department) {
        double salarySumInDepart = 0;
        int employeeCounter = 0;
        double averageSalary = 0;
        for (Employee empl : empls) {
            if (empl != null && empl.getDepartment() == department) {
                employeeCounter++;
                salarySumInDepart = salarySumInDepart + empl.getSalary();
            }
        }
        averageSalary = salarySumInDepart / employeeCounter;
        System.out.println("Average salary expenses in the " + department + "th department is: " + averageSalary);
    }
    public void printFullNames() {
        for (Employee empl : empls) {
            if (empl != null) {
                System.out.println(empl.getFullName());
            }
        }
    }
    public void printFullNames(int department) {
        for (Employee empl : empls) {
            if (empl != null && empl.getDepartment() == department) {
                System.out.println(empl);
            }
        }
    }
    public void increaseSalary(double percent) {
        double newSalary;
        for (Employee empl : empls) {
            if (empl != null) {
                newSalary = empl.getSalary() * (1 + (percent / 100));
                empl.setSalary(newSalary);
            }
        }
    }
    public void increaseSalary(int department, double percent) {
        double newSalary;
        for (Employee empl : empls) {
            if (empl != null && empl.getDepartment() == department) {
                newSalary = empl.getSalary() * (1 + (percent / 100));
                empl.setSalary(newSalary);
            }
        }
    }
    public void printInfoWithoutDepartment() {
        for (Employee empl : empls) {
            if (empl != null) {
                System.out.println(empl.getFullName() + " " + empl.getSalary() + " " + empl.getId());
            }
        }
    }
    public void getSalaryLessThan(double num) {
        for (Employee empl : empls) {
            if (empl != null && empl.getSalary() < num) {
                System.out.println(empl.getFullName() + " " + empl.getSalary() + " " + empl.getId());
            }
        }
    }
    public void getSalaryMoreThan(double num) {
        for (Employee empl : empls) {
            if (empl != null && empl.getSalary() > num) {
                System.out.println(empl.getFullName() + " " + empl.getSalary() + " " + empl.getId());
            }
        }
    }
    public void addEmpl(Employee employee) {
        for (int i = 0; i < empls.length; i++) {
            if (empls[i] == null) {
                empls[i] = employee;
                break;
            }
        }
    }
    public void removeEmplById(int id) {
        for (int i = 0; i < empls.length; i++) {
            if (empls[i].getId() == id) {
                empls[i] = null;
                break;
            }
        }
    }
    public void removeEmplByName(String fullName) {
        for (int i = 0; i < empls.length; i++) {
            if (empls[i].getFullName().equalsIgnoreCase(fullName)) {
                empls[i] = null;
                break;
            }
        }
    }
    private Employee findByFullName(String fullName) {
        for (Employee employee : empls) {
            if (employee == null) {
                continue;
            }
            if (employee.getFullName().equalsIgnoreCase(fullName)) {
                return employee;
            }
        }
        return null;
    }
    public void editSalary (String fullName, double newSalary) {
        Employee employee = findByFullName(fullName);
        if (employee != null) {
            employee.setSalary(newSalary);
        }
    }
    public void editDepartment (String fullName, int newDepartment) {
        Employee employee = findByFullName(fullName);
        if (employee != null) {
            employee.setDepartment(newDepartment);
        }
    }
    public void groupByDepartment() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("The employees from department " + i + ":");
            printFullNames(i);
        }
    }
}
