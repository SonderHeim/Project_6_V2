public class Student implements Comparable<Student> {

    protected final String name;
    protected final Integer ID;
    protected final Integer points;

    public Student(String name, int iD, int points) {
        this.name = name;
        this.ID = iD;
        this.points = points;
    }

    @Override
    public int compareTo(Student o) {
        return this.ID.compareTo(o.ID);
    }

    @Override
    public String toString() {
        return "Student: " + this.name + ". ID: " + this.ID + ". Points: " + this.points + ".";
    }
}