public class Employee {
    private String empNo;
    private String firstName;
    private String lastName;
    private Double salary;

    //getters
    public String getEmpNo() {
        return empNo;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Double getSalary() {
        return salary;
    }

    //setters
    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

    public void setFirtName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}