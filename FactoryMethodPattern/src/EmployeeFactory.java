public class EmployeeFactory implements Factory{
    @Override
    public Employee create() {
        Employee employee = new Employee(1,"Raşit",22,"");
        return employee;
    }
}
