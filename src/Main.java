public class Main {

    public static void main(String[] args) {
        EmployeeBook employeeService = new EmployeeBook();

        System.out.println("Salary expenses per month: " + employeeService.countSalaryExpenses(5));
        System.out.println("The employee with the lowest salary is " + employeeService.findEmplWithMinSalary(3));
        System.out.println("The employee with the highest salary is " + employeeService.findEmplWithMaxSalary(2));

        employeeService.countAverageSalary(5);

        employeeService.increaseSalary(10.0);
        employeeService.printFullInfo();

    }
}
