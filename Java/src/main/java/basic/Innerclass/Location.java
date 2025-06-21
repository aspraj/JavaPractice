package basic.Innerclass;
import java.util.*;

public class Location {
    private final int locationID;
    private final String description;
    private final Map<String, Integer> exits;

    public Location(int locationID, String description) {
        this.locationID = locationID;
        this.description = description;
        this.exits = new HashMap<String, Integer>();
        this.exits.put("Q", 0);
    }

    public void addExit(String direction, int location) {
        exits.put(direction, location);
    }
    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExits() {
        return new HashMap<String, Integer>(exits);
    }
}




class Main {

    private Map<Integer, Location> locations = new HashMap<Integer, Location>();
    private Map<String, String> vocabulary = new HashMap<>();

    public Main() {
        locations.put(0, new Location(0, "You are sitting in front of a computer learning Java"));
        locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building"));
        locations.put(2, new Location(2, "You are at the top of a hill"));
        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring"));
        locations.put(4, new Location(4, "You are in a valley beside a stream"));
        locations.put(5, new Location(5, "You are in the forest"));

        locations.get(1).addExit("W", 2);
        locations.get(1).addExit("E", 3);
        locations.get(1).addExit("S", 4);
        locations.get(1).addExit("N", 5);

        locations.get(2).addExit("N", 5);

        locations.get(3).addExit("W", 1);

        locations.get(4).addExit("N", 1);
        locations.get(4).addExit("W", 2);

        locations.get(5).addExit("S", 1);
        locations.get(5).addExit("W", 2);
    }

    public void command() {

        String currentLocation = "You are standing at the end of a road before a small brick building";
        Set<String> availableExits = new HashSet<>(Arrays.asList("N", "S", "E", "W"));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Display the current location
            System.out.println(currentLocation);

            // Display available exits
            System.out.print("\nAvailable exits are ");
            for (String exit : availableExits) {
                System.out.print(exit + " ");
            }
            System.out.println("\n");

            // Prompt user for input
            System.out.print("Enter command: ");
            String input = scanner.nextLine().trim();

            // Normalize input: convert to uppercase to handle case-insensitivity
            input = input.toUpperCase();

            // Handle the command
            if (vocabulary.containsValue(input)) {
                // Single letter command, e.g., N, S, E, W, Q
                if (input.equals("Q")) {
                    System.out.println("\nYou are sitting in front of a computer learning Java");
                    break;  // Exit the game
                }
                // Define new locations for each direction
                Map<String, String> locationChanges = new HashMap<>();
                locationChanges.put("N", "You are in the forest");
                locationChanges.put("S", "You are in a valley beside a stream");
                locationChanges.put("E", "You are inside a building, a well house for a small spring");
                locationChanges.put("W", "You are at the top of a hill");

                if (locationChanges.containsKey(input)) {
                    currentLocation = locationChanges.get(input);  // Update current location
                    Map<String, Set<String>> exits = new HashMap<>();
                    exits.put("You are standing at the end of a road before a small brick building", new HashSet<>(Arrays.asList("N", "S", "E", "W")));
                    exits.put("You are in the forest", new HashSet<>(Arrays.asList("S", "W")));
                    exits.put("You are in a valley beside a stream", new HashSet<>(Arrays.asList("N", "W")));
                    exits.put("You are inside a building, a well house for a small spring", new HashSet<>(Arrays.asList("W")));
                    exits.put("You are at the top of a hill", new HashSet<>(Arrays.asList("N")));

                    availableExits = exits.get(currentLocation);  // Set available exits for the new location  // Update exits for the new location
                } else {
                    System.out.println("\nYou cannot go in that direction\n");
                }
            } else if (vocabulary.containsKey(input)) {
                // Full word command, e.g., "NORTH", "SOUTH", etc.
                String shortCommand = vocabulary.get(input);
                // Define new locations for each direction
                Map<String, String> locationChanges = new HashMap<>();
                locationChanges.put("N", "You are in the forest");
                locationChanges.put("S", "You are in a valley beside a stream");
                locationChanges.put("E", "You are inside a building, a well house for a small spring");
                locationChanges.put("W", "You are at the top of a hill");

                if (locationChanges.containsKey(input)) {
                    currentLocation = locationChanges.get(input);  // Update current location
                    Map<String, Set<String>> exits = new HashMap<>();
                    exits.put("You are standing at the end of a road before a small brick building", new HashSet<>(Arrays.asList("N", "S", "E", "W")));
                    exits.put("You are in the forest", new HashSet<>(Arrays.asList("S", "W")));
                    exits.put("You are in a valley beside a stream", new HashSet<>(Arrays.asList("N", "W")));
                    exits.put("You are inside a building, a well house for a small spring", new HashSet<>(Arrays.asList("W")));
                    exits.put("You are at the top of a hill", new HashSet<>(Arrays.asList("N")));

                    availableExits = exits.get(currentLocation);  // Set available exits for the new location  // Update exits for the new location
                } else {
                    System.out.println("\nYou cannot go in that direction\n");
                }
            } else {
                // Invalid command or direction
                System.out.println("\nYou cannot go in that direction\n");
            }
        }
        scanner.close();  // Close the scanner after use
    }
}


