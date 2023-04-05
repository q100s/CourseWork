public class Main {

    public static void main(String[] args) {
        EmployeeBook employeeService = new EmployeeBook();
        employeeService.printInfoWithoutDepartment();
        System.out.println();
        employeeService.addEmpl(new Employee("Sarah Connor", 2, 70000));
        employeeService.removeEmplById(6);
        System.out.println();
        employeeService.printInfoWithoutDepartment();
        System.out.println();
        employeeService.addEmpl(new Employee("Sarah Connor", 2, 70000));
        employeeService.printInfoWithoutDepartment();
    }
}
