public class MedicalProfessional {
    private String name;
    private String specialization;

    // Constructor
    public MedicalProfessional(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Medical Professional Name: " + name);
        System.out.println("Specialization: " + specialization);
    }
}
