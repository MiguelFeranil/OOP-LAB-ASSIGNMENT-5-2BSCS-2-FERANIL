import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class EmployeeDA {
    private Employee employee;

    public Employee getemployee() {
        return employee;
    }

    public EmployeeDA(String empNo, Double salary) throws FileNotFoundException {
        Scanner employeeFile = new Scanner(new FileReader("emp.csv"));
    
        employeeFile.nextLine();

        while (employeeFile.hasNext()) {
            String employeeRow = employeeFile.nextLine();
            String[] employeeRowSpecific = new String[3];
            employeeRowSpecific = employeeRow.split(",");
        if (empNo.equals(employeeRowSpecific[0])) {
                employee = new Employee();
                employee.setEmpNo(employeeRowSpecific[0]);
                employee.setLastName(employeeRowSpecific[1].trim());
                employee.setFirtName(employeeRowSpecific[2]);
                employee.setSalary(salary);
            }
        }
        employeeFile.close();       
    }     
}