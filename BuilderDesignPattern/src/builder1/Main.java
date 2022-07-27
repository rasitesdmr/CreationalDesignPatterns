package builder1;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer.Builder()
                .firstName("Raşit")
                .lastName("Eşdemir")
                .build();
        Customer customer2 = new Customer.Builder()
                .firstName("Ahmet")
                .firstName("ay")
                .customerCar(true)
                .customerHouse(true)
                .married(true)
                .build();
        System.out.println(customer);
        System.out.println(customer2);
    }


}
