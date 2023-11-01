package prob2A;

public class Student {
    private String name;
private GradeReport gradeReport;

    public Student(String name) {
        this.name = name;
        this.gradeReport=null;

    }



    public GradeReport getGradeReport() {
        return gradeReport;
    }

    public void setGradeReport(GradeReport gradeReport) {
        this.gradeReport = gradeReport;
    }
}
