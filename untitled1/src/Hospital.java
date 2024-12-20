public class Hospital {
    private String name;
    private String location;

    // Constructor
    public Hospital(String name, String location) {
        this.name = name;
        this.location = location;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Hospital Name: " + name);
        System.out.println("Location: " + location);
    }
}
