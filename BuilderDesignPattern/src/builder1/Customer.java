package builder1;

public class Customer {

    private String firstName;

    private String lastName;

    private boolean customerCar;

    private boolean customerHouse;

    private boolean married;

    public Customer(String firstName, String lastName, boolean customerCar, boolean customerHouse, boolean married) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.customerCar = customerCar;
        this.customerHouse = customerHouse;
        this.married = married;
    }

    public static class Builder {

        private String firstName;

        private String lastName;

        private boolean customerCar;

        private boolean customerHouse;

        private boolean married;

        public Builder(){

        }

        public Builder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

       public Builder firstName(String firstName){
            this.firstName = firstName;
            return this;
       }
       public Builder lastName(String lastName){
            this.lastName = lastName;
            return this;
       }

       public Builder customerCar(boolean customerCar){
            this.customerCar = customerCar;
            return this;
       }
       public Builder customerHouse(boolean customerHouse){
            this.customerHouse = customerHouse;
            return this;
       }
       public Builder married(boolean married){
            this.married = married;
            return this;
       }
       public Customer build(){
            return new Customer(firstName,lastName,customerCar,customerHouse,married);
       }

        @Override
        public String toString() {
            return "Builder{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", customerCar=" + customerCar +
                    ", customerHouse=" + customerHouse +
                    ", married=" + married +
                    '}';
        }
    }
}
