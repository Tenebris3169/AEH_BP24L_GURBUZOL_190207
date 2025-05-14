package pl.pp;

public class MyNinthApp {
    public static void main(String[] args) {
        // Create a Warehouse object
        Warehouse warehouse = new Warehouse("W001", 5000, "John Smith", "owner@example.com", "+48 000 000 000");

        // Example operations
        warehouse.addGoods(3000); // Adds 3000 units
        warehouse.removeGoods(1000); // Removes 1000 units
        warehouse.addGoods(2500); // Try adding more goods

        // Check current occupancy
        warehouse.checkOccupancy();

        // Update owner contact
        warehouse.updateContact("owner@magazyn.pl", "+48 123 456 789");

        // Try to add goods exceeding capacity
        warehouse.addGoods(1000); // Should print "Not enough space"
    }
}
