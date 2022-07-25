public class Director extends Manager {
    private double bonus;

    public Director(int no, String name, int year, String department, String departmentManaged, double bonus) {
        super(no, name, year, department, departmentManaged);
        this.bonus = bonus;
    }

    public void work() {
        System.out.println("Director is working! : Director tüm şirketi yönetir");
    }

    public double calculateSalary() {
        return super.calculateSalary() + bonus;
    }

    public double getBonus() {
        return bonus;
    }


    @Override
    public String toString() {
        return "Director{" +
                "bonus=" + bonus +
                '}';
    }
}
