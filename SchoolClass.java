import java.util.ArrayList;

public class SchoolClass {
    private String division;
    private String classTeacher;
    public ArrayList<Student> studentsList= new ArrayList<Student>();
    SchoolClass(String division, String classTeacher,ArrayList<Student> students){
        this.division = division;
        this.classTeacher = classTeacher;
        this.studentsList.addAll(students);
    }
    SchoolClass(){

    }
    public String getDivision(){
        return this.division;
    }
    public String getClassTeacher(){
        return this.classTeacher;
    }

    public void setDivision(String division){
        this.division = division;
    }
    public void setClassTeacher(String classTeacher){
        this.classTeacher = classTeacher;
    }

    public void addStudent(Student sampleStudent){
        this.studentsList.add(sampleStudent);
    }
    public String findTopper(){
        int max = -1;
        String topper = "";
        for(Student student:this.studentsList){
            if(student.getStudentsAverage()>max){
                topper = student.getName();
                max = student.getStudentsAverage();
            }
        }
        return topper;
    }
    public Integer getClassAverage(){
        int sum=0;
        int count=0;
        for(Student i:this.studentsList){
            sum+=i.getStudentsAverage();
            count+=1;
        }
        return sum/count;
    }
}
