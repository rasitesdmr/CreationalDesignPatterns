public class ManagerFactory implements Factory{
    @Override
    public Employee create() {
        Manager manager = new Manager(5,"ayşe",29,"","");
        return manager;
    }
}
