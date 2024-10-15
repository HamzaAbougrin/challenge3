//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Product.welcomeMessage();


        Electronics laptop = new Electronics("Laptop", 999.99, 50, "TechBrand", 2);
        Food apple = new Food("Apple", 0.99, 100, "2025-01-01");


        System.out.println("\nElectronics Product Info:");
        laptop.displayInfo();

        System.out.println("\nFood Product Info:");
        apple.displayInfo();


        laptop.updateQuantity(60, true);
        apple.updateQuantity(120);


        System.out.println("\nUpdated Electronics Product Info:");
        laptop.displayInfo();

        System.out.println("\nUpdated Food Product Info:");
        apple.displayInfo();
    }
}
