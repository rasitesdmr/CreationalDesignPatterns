public class Manager extends Employee{
    private String departmentManaged;

    public static final int managerSalary = 1500;


    public Manager(int no, String name, int year, String department, String departmentManaged) {
        super(no, name, year, department);
        this.departmentManaged = departmentManaged;
    }

    public void work() {
        System.out.println("Manager çalışıyor");
    }

    public double calculateSalary() {
        return super.calculateSalary() + managerSalary;
    }

    public String getDepartmentManaged() {
        return departmentManaged;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "departmentManaged='" + departmentManaged + '\'' +
                '}';
    }
}
