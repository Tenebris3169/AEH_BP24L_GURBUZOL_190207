package pl.pp;

public class MyEighthApp {
    public static void main(String[] args) {
        // Person example
        pl.pp.Person person1 = new pl.pp.Person();
        person1.hiToAll();
        person1.forename = "John";
        person1.surname = "Doe";
        person1.age = 24;
        person1.hiToAll();

        pl.pp.Person person2 = new pl.pp.Person("Alice", "Hart", 42);
        person2.hiToAll();

        person1.growOld(1);
        person2.growOld(3);

        person1.hiToAll();
        person2.hiToAll();

        System.out.println(person1.getName());
        person1.setName("Lolo");
        System.out.println(person1.getName());
        person1.hiToAll();

        // Circle example
        Circle circle = new Circle(5.0);
        circle.getInfo();

        // Account example
        Account acc = new Account("1234567890", 1000.0, "Jane Smith", "jane@example.com", "123-456-789");
        acc.withdraw(900.0);
        acc.deposit(250.0);
        acc.withdraw(50.0);
        acc.withdraw(500.0); // Insufficient funds
    }
}
