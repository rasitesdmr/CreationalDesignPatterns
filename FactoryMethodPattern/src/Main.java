public class Main {
    public static void main(String[] args) {
        InsanKaynaklari insanKaynaklari =new InsanKaynaklari();
        Office office = new Office();

        Factory employeeFactory = new EmployeeFactory();
        Factory managerFactory = new ManagerFactory();
        Factory directorFactory = new DirectorFactory();

        insanKaynaklari.addNewEmployee(employeeFactory.create());
        insanKaynaklari.addNewEmployee(directorFactory.create());
        insanKaynaklari.addNewEmployee(managerFactory.create());

        insanKaynaklari.listEmployees();
    }



}
