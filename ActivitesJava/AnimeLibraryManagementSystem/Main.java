package AnimeLibraryManagementSystem;

import java.util.*;

// ==========================================
// 1. EXCEPTIONS (3 Custom Exceptions)
// ==========================================
class DuplicateAnimeException extends Exception {
    public DuplicateAnimeException(String message) { super(message); }
}

class AnimeNotFoundException extends Exception {
    public AnimeNotFoundException(String message) { super(message); }
}

class InvalidInputException extends Exception {
    public InvalidInputException(String message) { super(message); }
}

// ==========================================
// 2. ABSTRACTION (2 Interfaces)
// ==========================================
interface Watchable {
    void watch();
}

interface Reviewable {
    void addReview(String review);
}

// ==========================================
// 3. ABSTRACTION & ENCAPSULATION 
// (1 Abstract Class, Private fields + Getters/Setters)
// ==========================================
abstract class Anime implements Watchable, Reviewable {
    private String id;
    private String title;
    private String genre;
    private double rating;
    private List<String> reviews;

    public Anime(String id, String title, String genre, double rating) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.rating = rating;
        this.reviews = new ArrayList<>();
    }

    // Getters and Setters (Encapsulation)
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }

    public double getRating() { return rating; }
    
    // POLYMORPHISM: Overloaded Methods
    public void setRating(double rating) { this.rating = rating; }
    public void setRating(int rating) { this.rating = (double) rating; } 

    // Abstract method to be overridden by subclasses
    public abstract String getDetails();

    @Override
    public void addReview(String review) {
        this.reviews.add(review);
    }
}

// ==========================================
// 4. INHERITANCE & POLYMORPHISM
// (1 Parent Class, 3 Subclasses, Overridden methods)
// ==========================================
class TVSeries extends Anime {
    private int episodes;

    public TVSeries(String id, String title, String genre, double rating, int episodes) {
        super(id, title, genre, rating);
        this.episodes = episodes;
    }

    public int getEpisodes() { return episodes; }
    public void setEpisodes(int episodes) { this.episodes = episodes; }

    // POLYMORPHISM: Overridden Method 1
    @Override
    public String getDetails() {
        return "[TV Series] ID: " + getId() + " | Title: " + getTitle() + " | Genre: " + getGenre() + 
               " | Rating: " + getRating() + " | Episodes: " + episodes;
    }

    @Override
    public void watch() {
        System.out.println("Binge-watching TV Series: " + getTitle());
    }
}

class Movie extends Anime {
    private int durationMinutes;

    public Movie(String id, String title, String genre, double rating, int durationMinutes) {
        super(id, title, genre, rating);
        this.durationMinutes = durationMinutes;
    }

    public int getDurationMinutes() { return durationMinutes; }
    public void setDurationMinutes(int durationMinutes) { this.durationMinutes = durationMinutes; }

    // POLYMORPHISM: Overridden Method 2
    @Override
    public String getDetails() {
        return "[Movie] ID: " + getId() + " | Title: " + getTitle() + " | Genre: " + getGenre() + 
               " | Rating: " + getRating() + " | Duration: " + durationMinutes + " mins";
    }

    @Override
    public void watch() {
        System.out.println("Grabbing popcorn for Movie: " + getTitle());
    }
}

class OVA extends Anime {
    private String studio;

    public OVA(String id, String title, String genre, double rating, String studio) {
        super(id, title, genre, rating);
        this.studio = studio;
    }

    public String getStudio() { return studio; }
    public void setStudio(String studio) { this.studio = studio; }

    // POLYMORPHISM: Overridden Method 3
    @Override
    public String getDetails() {
        return "[OVA] ID: " + getId() + " | Title: " + getTitle() + " | Genre: " + getGenre() + 
               " | Rating: " + getRating() + " | Studio: " + studio;
    }

    @Override
    public void watch() {
        System.out.println("Watching original video animation: " + getTitle());
    }
}

// ==========================================
// 5. MAIN PROGRAM (Menu, Collections, Try-Catch)
// ==========================================
public class Main {
    // COLLECTIONS: 3 Types Used (HashMap, ArrayList, Queue)
    private static Map<String, Anime> animeMap = new HashMap<>(); // For fast lookup by ID
    private static List<Anime> animeList = new ArrayList<>();     // For ordered iteration
    private static Queue<String> recentActivityQueue = new LinkedList<>(); // To track recent actions
    
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            System.out.println("\n=== ANIME LIBRARY MANAGEMENT SYSTEM ===");
            System.out.println("1. Add Anime");
            System.out.println("2. View Anime Library");
            System.out.println("3. Update Anime");
            System.out.println("4. Delete Anime");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            try {
                String choice = scanner.nextLine();
                switch (choice) {
                    case "1":
                        addAnime();
                        break;
                    case "2":
                        viewLibrary();
                        break;
                    case "3":
                        updateAnime();
                        break;
                    case "4":
                        deleteAnime();
                        break;
                    case "5":
                        running = false;
                        System.out.println("Exiting System. Sayonara!");
                        break;
                    default:
                        throw new InvalidInputException("Invalid menu option. Please select 1-5.");
                }
            } catch (InvalidInputException | DuplicateAnimeException | AnimeNotFoundException e) {
                System.out.println("ERROR: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("UNEXPECTED ERROR: Invalid input format.");
            } finally {
                // Try-catch-finally block implementation
                System.out.println("--- Action Processed ---");
            }
        }
        scanner.close();
    }

    private static void addAnime() throws DuplicateAnimeException, InvalidInputException {
        System.out.print("Enter Anime ID: ");
        String id = scanner.nextLine().trim();
        if (id.isEmpty()) throw new InvalidInputException("ID cannot be empty.");
        if (animeMap.containsKey(id)) throw new DuplicateAnimeException("Anime with ID " + id + " already exists.");

        System.out.print("Enter Title: ");
        String title = scanner.nextLine().trim();
        System.out.print("Enter Genre: ");
        String genre = scanner.nextLine().trim();
        
        System.out.print("Enter Rating (0.0 to 10.0): ");
        double rating;
        try {
            rating = Double.parseDouble(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            throw new InvalidInputException("Rating must be a valid number.");
        }

        System.out.println("Select Type: 1. TV Series  2. Movie  3. OVA");
        String typeStr = scanner.nextLine().trim();
        Anime newAnime = null;

        if (typeStr.equals("1")) {
            System.out.print("Enter number of episodes: ");
            int ep = Integer.parseInt(scanner.nextLine().trim());
            newAnime = new TVSeries(id, title, genre, rating, ep);
        } else if (typeStr.equals("2")) {
            System.out.print("Enter duration in minutes: ");
            int duration = Integer.parseInt(scanner.nextLine().trim());
            newAnime = new Movie(id, title, genre, rating, duration);
        } else if (typeStr.equals("3")) {
            System.out.print("Enter Studio name: ");
            String studio = scanner.nextLine().trim();
            newAnime = new OVA(id, title, genre, rating, studio);
        } else {
            throw new InvalidInputException("Invalid Anime type selected.");
        }

        animeMap.put(id, newAnime);
        animeList.add(newAnime);
        logActivity("Added Anime: " + title);
        System.out.println("Anime successfully added!");
    }

    private static void viewLibrary() {
        if (animeList.isEmpty()) {
            System.out.println("Library is currently empty.");
            return;
        }
        
        System.out.println("\n--- Anime Collection ---");
        // 1. Display a simplified list first
        for (Anime anime : animeList) {
            System.out.println("ID: " + anime.getId() + " | Title: " + anime.getTitle());
        }
        
        // 2. Add functionality to inspect specific anime details
        System.out.print("\nEnter an Anime ID to view full details (or press Enter to go back): ");
        String searchId = scanner.nextLine().trim();
        
        if (!searchId.isEmpty()) {
            Anime selectedAnime = animeMap.get(searchId);
            if (selectedAnime != null) {
                System.out.println("\n--- Full Details ---");
                System.out.println(selectedAnime.getDetails());
                System.out.print("Action: ");
                selectedAnime.watch(); // Demonstrates the interface method
            } else {
                System.out.println("ERROR: Anime with ID '" + searchId + "' not found.");
            }
        }
        
        System.out.println("\n--- Recent Activity Log ---");
        for (String activity : recentActivityQueue) {
            System.out.println("- " + activity);
        }
    }

    private static void updateAnime() throws AnimeNotFoundException, InvalidInputException {
        System.out.print("Enter Anime ID to update: ");
        String id = scanner.nextLine().trim();
        
        Anime anime = animeMap.get(id);
        if (anime == null) {
            throw new AnimeNotFoundException("Anime with ID " + id + " not found.");
        }

        System.out.print("Enter new Title (Leave blank to keep current): ");
        String newTitle = scanner.nextLine().trim();
        if (!newTitle.isEmpty()) anime.setTitle(newTitle);

        System.out.print("Enter new Rating (Leave blank to keep current): ");
        String newRatingStr = scanner.nextLine().trim();
        if (!newRatingStr.isEmpty()) {
            try {
                // Using overloaded setRating method
                if (newRatingStr.contains(".")) {
                    anime.setRating(Double.parseDouble(newRatingStr));
                } else {
                    anime.setRating(Integer.parseInt(newRatingStr));
                }
            } catch (NumberFormatException e) {
                throw new InvalidInputException("Rating must be a valid number.");
            }
        }
        
        logActivity("Updated Anime ID: " + id);
        System.out.println("Anime updated successfully.");
    }

    private static void deleteAnime() throws AnimeNotFoundException {
        System.out.print("Enter Anime ID to delete: ");
        String id = scanner.nextLine().trim();
        
        Anime removedAnime = animeMap.remove(id);
        if (removedAnime == null) {
            throw new AnimeNotFoundException("Anime with ID " + id + " not found.");
        }
        
        animeList.remove(removedAnime);
        logActivity("Deleted Anime: " + removedAnime.getTitle());
        System.out.println("Anime deleted successfully.");
    }

    // Helper method to manage the Queue collection
    private static void logActivity(String action) {
        if (recentActivityQueue.size() >= 5) {
            recentActivityQueue.poll(); // Keep only the last 5 activities
        }
        recentActivityQueue.offer(action);
    }
}