public class Patient extends Person {
    private int age;
    private String ailment;

    public Patient(String name, int age, String ailment) {
        super(name);
        this.age = age;
        this.ailment = ailment;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAilment() {
        return ailment;
    }

    public void setAilment(String ailment) {
        this.ailment = ailment;
    }

    @Override
    public void displayDetails() {
        System.out.println("Patient Details:");
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return super.toString() + ", Age: " + age + ", Ailment: " + ailment;
    }
}
