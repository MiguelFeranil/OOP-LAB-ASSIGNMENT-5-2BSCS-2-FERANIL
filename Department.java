import java.util.HashMap;

public class Department {
    private String depCode;
    private String depName;
    private Double depTotalSalary;
    private HashMap<String, Employee> employeeMap;

    //getters
    public String getdepCode() {
        return depCode;

    }  

    public String getdepName() {
        return depName;

    }

    public Double getdepTotalSalary() {
        return depTotalSalary;

    }

    public HashMap<String, Employee> getEmployeeMap() {
        return employeeMap;
    }
    

    //setters
    public void setdepCode(String depCode) {
        this.depCode = depCode;

    }

    public void setdepName(String depName) {
        this.depName = depName;

    }

    public void setDepTotalSalary(Double depTotalSalary) {
        this.depTotalSalary = depTotalSalary;

    }

    public void setEmployeeMap(HashMap<String, Employee> employeeMap) {
        this.employeeMap = employeeMap;

    }

}