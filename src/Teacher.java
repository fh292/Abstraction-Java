//Define the Teacher Class
public class Teacher extends Person {

    //Add Specific Properties
    private String subject;
    private String school;

    //Implement a Constructor
    public Teacher(String name, String subject, String school) {
        super(name);
        this.subject = subject;
        this.school = school;
    }

    //Override the describeRole Method
    @Override
    void describeRole() {
        System.out.println(getName() + " teaches " + subject + " at " + school);

    }

    @Override
    public String toString() {
        return getName() + " teaches " + subject + " at " + school;
    }
}
