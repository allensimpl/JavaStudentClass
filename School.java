import java.util.ArrayList;

public class School {
    private String schoolName;
    public ArrayList<SchoolClass> schoolsClasses = new ArrayList<SchoolClass>();
    public School(String schoolName,ArrayList<SchoolClass> schoolsClasses){
        this.schoolName = schoolName;
        this.schoolsClasses.addAll(schoolsClasses);
    }
    public Float schoolAverage(){
        int count=0;
        int sum=0;
        for(SchoolClass school:schoolsClasses){
            for(Student student: school.studentsList){
                sum+= student.getStudentsAverage();
                count++;
            }
        }
        return sum/(float)count;
    }
    public String highestClass(){
        String topClass="";
        Float max = Float.MIN_VALUE;
        for(SchoolClass classes:this.schoolsClasses){
            if(classes.getClassAverage()>max){
                max = classes.getClassAverage();
                topClass = classes.getDivision();
            }
        }
        return topClass;
    }
}
