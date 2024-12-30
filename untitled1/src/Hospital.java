import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private String name;
    private String location;
    private List<Patient> patients;

    public Hospital(String name, String location) {
        this.name = name;
        this.location = location;
        this.patients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void displayDetails() {
        System.out.println("Hospital Details:");
        System.out.println("Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Patients:");
        for (Patient patient : patients) {
            System.out.println(" - " + patient.getName());
        }
    }
}
