import java.util.ArrayList;

public class School {
    private String schoolName;
    ArrayList<SchoolClass> schoolsClasses = new ArrayList<SchoolClass>();
    School(String schoolName,ArrayList<SchoolClass> schoolsClasses){
        this.schoolName = schoolName;
        this.schoolsClasses.addAll(schoolsClasses);
    }
    public int schoolAverage(){
        int count=0;
        int sum=0;
        for(SchoolClass school:schoolsClasses){
            for(Student student: school.studentsList){
                sum+= student.getStudentsAverage();
                count++;
            }
        }
        return sum/count;
    }
    public String highestClass(){
        String topClass="";
        int max = Integer.MIN_VALUE;
        for(SchoolClass classes:this.schoolsClasses){
            if(classes.getClassAverage()>max){
                max = classes.getClassAverage();
                topClass = classes.getDivision();
            }
        }
        return topClass;
    }
}
