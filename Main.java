
import java.util.HashMap;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {

        HashMap<String, Integer> speciesRegistry = new HashMap<>();

        speciesRegistry.put("Deer", 120);
        speciesRegistry.put("Wolf", 25);
        speciesRegistry.put("Bear", 15);
        speciesRegistry.put("Fox", 45);
        speciesRegistry.put("Eagle", 30);

        System.out.println("=== Global Biodiversity Initiative ===");

        // Read sightings from the text file
        try {
            File file = new File("sightings.txt");
            Scanner fileScanner = new Scanner(file);

            while (fileScanner.hasNextLine()) {
                String species = fileScanner.nextLine().trim();

                if (species.isEmpty()) {
                    continue;
                }

                if (speciesRegistry.containsKey(species)) {
                    int currentCount = speciesRegistry.get(species);
                    speciesRegistry.put(species, currentCount + 1);
                } else {
                    speciesRegistry.put(species, 1);
                }
            }

            fileScanner.close();
            System.out.println("Sighting log processed successfully!");

        } catch (FileNotFoundException e) {
            System.out.println("Error: sightings.txt was not found.");
        }

        // Display the updated registry
        System.out.println("\n=== Updated Species Registry ===");

        for (String species : speciesRegistry.keySet()) {
            System.out.println(
                    species + ": " + speciesRegistry.get(species)
            );
        }

        // Query a species
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter a species name: ");
        String searchSpecies = scanner.nextLine().trim();

        if (speciesRegistry.containsKey(searchSpecies)) {
            System.out.println(
                    searchSpecies + " population: "
                            + speciesRegistry.get(searchSpecies)
            );
        } else {
            System.out.println(
                    searchSpecies + " is not currently in the registry."
            );
        }

        scanner.close();
    }
}
