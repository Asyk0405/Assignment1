public class MedicalProfessional extends Person {
    private String specialization;

    public MedicalProfessional(String name, String specialization) {
        super(name);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public void displayDetails() {
        System.out.println("Medical Professional Details:");
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return super.toString() + ", Specialization: " + specialization;
    }
}
