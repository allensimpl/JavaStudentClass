import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Johnny","Aluva",21,93F,96F,80F);
        Student s2 = new Student("Aaron","Fort Kochi",22,91F,90F,88F);
        Student s3 = new Student("Abel","Alapuzha",24,65F,85F,99F);
        Student s3 = new Student("Abel","Alapuzha",24,65F,85F,99F);
        ArrayList<Student> students1 = new ArrayList<Student>();
        students1.add(s1);
        students1.add(s2);
        students1.add(s3);
        SchoolClass class1 = new SchoolClass("5A","Reeba",students1);
        System.out.println(s1.getStudentsAverage());
        System.out.println("Class 1 Topper: "+class1.findTopper());
        System.out.println("Class 2 Average: "+class1.getClassAverage());

        Student s4  = new Student("David","Aluva",21,100,99,100);
        Student s5 = new Student("Aaron","Fort Kochi",27,100,100,54);
        Student s6 = new Student("Abel","Alapuzha",18,100,93,90);
        ArrayList<Student> students2 = new ArrayList<Student>();
        students2.add(s4);
        students2.add(s5);
        students2.add(s6);
        SchoolClass class2 = new SchoolClass("5B","Riya",students2);
        System.out.println("Class 1 Topper"+class1.findTopper());
        System.out.println("Class 2 Topper"+class2.getClassAverage());
        ArrayList<SchoolClass> allClasses= new ArrayList<SchoolClass>();
        allClasses.add(class1);
        allClasses.add(class2);
        School sampleSchool = new School("Vidyodaya",allClasses);
        System.out.println(sampleSchool.highestClass());
        System.out.println(sampleSchool.schoolAverage());
    }
}