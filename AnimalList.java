import java.util.ArrayList;
import java.util.Scanner;

public class AnimalList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Animal> animals = new ArrayList<>();

        while (true) {
            System.out.print("Enter the name of the animal (or press Enter to stop): ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            System.out.print("Is it a dog (true/false)? ");
            boolean isDog = Boolean.parseBoolean(scanner.nextLine());

            animals.add(new Animal(name, isDog));
        }

        System.out.println("\nList of Animals:");
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }
}

class Animal {
    private String name;
    private boolean isDog;

    // Constructor
    public Animal(String name, boolean isDog) {
        this.name = name;
        this.isDog = isDog;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for isDog
    public boolean isDog() {
        return isDog;
    }

    // Override toString() method to print animal details
    @Override
    public String toString() {
        return "Animal [Name: " + getName() + ", Is Dog: " + (isDog() ? "Yes" : "No") + "]";
    }
}
