package prob2A;

public class GradeReport {
    private String grade;
    private Student student;

    public GradeReport(String grade) {
        this.grade = grade;
        this.student=null;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
