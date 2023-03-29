import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Ivanov", "Ivan", "Ivanovich", 1, 50000, Employee.counter);
        Employee employee2 = new Employee("Petrov", "Petr", "Petrovich", 2, 56000, Employee.counter);
        Employee employee3 = new Employee("Antonov", "Anton", "Antonovich", 3, 48900, Employee.counter);
        Employee employee4 = new Employee("Yurin", "Yriy", "Yurievich", 4, 67950, Employee.counter);
        Employee employee5 = new Employee("Marshall", "Frisby", "John", 5, 67950, Employee.counter);
        Employee employee6 = new Employee("Ekaterina", "Romanova", "Petrovna", 3, 67950, Employee.counter);
        Employee employee7 = new Employee("Dude", "Man", "Cool", 1, 77777, Employee.counter);
        Employee employee8 = new Employee("Steven", "Paul", "Jobs", 2, 99999, Employee.counter);
        Employee employee9 = new Employee("Eduard", "Anokhin", "Sergeevich", 4, 55555, Employee.counter);
        Employee employee10 = new Employee("Svetlana", "Li", "Nikolayevna", 5, 67950, Employee.counter);
        Employee[] employees = {employee1, employee2, employee3, employee4, employee5, employee6, employee7, employee8, employee9, employee10};
        System.out.println(Arrays.toString(employees));
        countSalaryExpenses(employees);
        findMinSalary(employees);
        findMaxSalary(employees);
        countAverageSalaryExpenses(employees, countSalaryExpenses(employees));
        getNames(employees);
    }
    public static double countSalaryExpenses(Employee[] employees) {
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum = sum + employees[i].getSalary();
        }
        System.out.println("Company's salary expenses per month is " + sum);
        return sum;
    }
    public static void findMinSalary(Employee[] employees) {
        int counter = 0;
        double MinSalary = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < MinSalary) {
                MinSalary = employees[i].getSalary();
                counter = i;
            }
        }
        System.out.println("Employee with the lowest salary is " + employees[counter].getFirstName() + " " +
                employees[counter].getSecondName() + " " + employees[counter].getMiddleName());
    }
    public static void findMaxSalary(Employee[] employees) {
        int counter = 0;
        double MaxSalary = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > MaxSalary) {
                MaxSalary = employees[i].getSalary();
                counter = i;
            }
        }
        System.out.println("Employee with the highest salary is " + employees[counter].getFirstName() + " " +
                employees[counter].getSecondName() + " " + employees[counter].getMiddleName());
    }
    public static void countAverageSalaryExpenses (Employee[] employees, double sum) {
        double averageSalaryExpenses = sum / employees.length;
        System.out.println("Average salary is " + averageSalaryExpenses);
    }
    public static void getNames (Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            String str = employees[i].getFirstName() + " " + employees[i].getSecondName() + " " + employees[i].getMiddleName();
            System.out.println(str);
        }
    }
}
