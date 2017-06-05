package model;

/**
 * Created by ASUS on 27.05.2017.
 */
public class Student extends Person{

    private static final Student defaultStudent = new Student("enter name", -1,-1,Teacher.getInstance());

    private double averageGrade;
    private Teacher teacher;

    public Student(){}
    public Student(String name, int age, double averageGrade, Teacher teacher){
       this.name = name;
       this.age = age;
       this.averageGrade = averageGrade;
       this.teacher = teacher;
    }
    public static Student getInstance(){
        return defaultStudent;
    }

    public void setAverageGrade(double averageGrade) {
        if (averageGrade < 0) {
            return;
        }
        this.averageGrade = averageGrade;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public String toString(){
        return String.format("Student: Name - %s, Age - %d, Average grade - %.1f, Teacher: %s", name,age,averageGrade,teacher);
    }

    public void getTeacher() {


    }
}