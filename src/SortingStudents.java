public class SortingStudents extends Student implements Comparable<Student> {

    public SortingStudents(String name, int iD, int points) {
        super(name, iD, points);
    }

    @Override
    public int compareTo(Student o) {
        return this.points.compareTo(o.points);
    }
}