public class Main {
    public static void main(String[] args) {
        // Create Patient instances
        Patient patient1 = new Patient("Assylkahn Toilybekov", 45, "Diabetes");
        Patient patient2 = new Patient("Temirlan Mirzanov", 30, "Hypertension");

        // Create MedicalProfessional instances
        MedicalProfessional doctor1 = new MedicalProfessional("Dr. Borat", "Cardiology");
        MedicalProfessional doctor2 = new MedicalProfessional("Dr. Alibek", "Neurology");

        // Create Hospital instance
        Hospital hospital = new Hospital("#2 Astana Hospital", "Astana");

        // Display details
        System.out.println("=== Patient Details ===");
        patient1.displayDetails();
        System.out.println();
        patient2.displayDetails();

        System.out.println("\n=== Medical Professional Details ===");
        doctor1.displayDetails();
        System.out.println();
        doctor2.displayDetails();

        System.out.println("\n=== Hospital Details ===");
        hospital.displayDetails();

        // Compare patients based on their names
        System.out.println("\n=== Comparing Patients ===");
        if (patient1.getName().equals(patient2.getName())) {
            System.out.println("Patients have the same name.");
        } else {
            System.out.println("Patients have different names.");
        }

        // Compare doctors based on their specializations
        System.out.println("\n=== Comparing Doctors ===");
        if (doctor1.getSpecialization().equals(doctor2.getSpecialization())) {
            System.out.println("Doctors have the same specialization.");
        } else {
            System.out.println("Doctors have different specializations.");
        }
    }
}
