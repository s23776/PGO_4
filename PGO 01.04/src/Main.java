public class Main {

    public static void main(String[] args) {


        User guest1 = new User("guest1@gmai.com");
        User guest2 = new User("guest2@gmail.com");

        User user1 = new User("Will", "Smith", "willsmith@gmail.com", "12345678");

        User user2 = new User(guest1, "Alex", "Brown", "12345678");


        //--------------------------------------------------------------------------------

        Product product1 = new Product("A", 1000, 91920, 5);
        Product product2 = new Product("B", 2000, 59302, 2);
        Product product3 = new Product("C", 3000, 45678);

        product3.setPrice(4000);
        product3.setNumberOfUnits(5);
    }

}