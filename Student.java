import java.util.ArrayList;

public class Student {
    private String name;
    private String address;
    private Integer age;
    private Integer marks1;
    private Integer marks2;
    private Integer marks3;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getMarks1() {
        return marks1;
    }

    public void setMarks1(Integer marks1) {
        this.marks1 = marks1;
    }

    public Integer getMarks2() {
        return marks2;
    }

    public void setMarks2(Integer marks2) {
        this.marks2 = marks2;
    }

    public Integer getMarks3() {
        return marks3;
    }

    public void setMarks3(Integer marks3) {
        this.marks3 = marks3;
    }

    public Student(String name, String address, Integer age, Integer marks1, Integer marks2, Integer marks3){
        this.name = name;
        this.address = address;
        this.age = age;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }
    public Student(){

    }
    public Integer getStudentsAverage(){
        return (this.marks1+this.marks2+this.marks3)/3;
    }
    public Integer getStudentSum(){
        return (this.marks1+this.marks2+this.marks3);
    }
}
