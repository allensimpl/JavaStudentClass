import java.util.ArrayList;

public class Student {
    private String name;
    private String address;
    private Integer age;
    private Float marks1;
    private Float marks2;
    private Float marks3;

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

    public Float getMarks1() {
        return this.marks1;
    }

    public void setMarks1(Float marks1) {
        this.marks1 = marks1;
    }

    public Float getMarks2() {
        return this.marks2;
    }

    public void setMarks2(Float marks2) {
        this.marks2 = marks2;
    }

    public Float getMarks3() {
        return marks3;
    }

    public void setMarks3(Float marks3) {
        this.marks3 = marks3;
    }

    public Student(String name, String address, Integer age, Float marks1, Float marks2, Float marks3){
        this.name = name;
        this.address = address;
        this.age = age;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }
    public Student(){

    }
    public Float getStudentsAverage(){
        return ((float)this.marks1+(float)this.marks2+(float)this.marks3)/3F;
    }
    public Float getStudentSum(){
        return (this.marks1+this.marks2+this.marks3);
    }
}
