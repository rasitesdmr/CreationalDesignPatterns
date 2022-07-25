package karisikExample;

public class Employee {

    private int no;
    private String name;
    private int year;
    private String department;
    private double salary;

    public static final int SALARY = 500;



    public Employee(int no, String name, int year, String department) {
        this.no = no;
        this.name = name;
        this.year = year;
        this.department = department;
    }

    public void work() {
        System.out.println("basitExample.Employee çalışıyor");
    }

    public double calculateSalary() {
        salary = year * SALARY;
        return salary;
    }


    public int getNo() {
        return no;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "basitExample.Employee [no=" + no + ", name=" + name + ", year=" + year + ", department=" + department + ", salary="
                + salary + "]";
    }
}

