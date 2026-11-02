
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        HashMap<String, Integer> speciesRegistry = new HashMap<>();

        speciesRegistry.put("Deer", 120);
        speciesRegistry.put("Wolf", 25);
        speciesRegistry.put("Bear", 15);
        speciesRegistry.put("Fox", 45);
        speciesRegistry.put("Eagle", 30);

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Global Biodiversity Initiative ===");
        System.out.println("Species Population Registry");

        System.out.print("\nEnter a species name: ");
        String species = scanner.nextLine().trim();

        if (speciesRegistry.containsKey(species)) {
            System.out.println(
                    species + " population: " + speciesRegistry.get(species)
            );
        } else {
            System.out.println(
                    species + " is not currently in the registry."
            );
        }

        scanner.close();
    }
}
