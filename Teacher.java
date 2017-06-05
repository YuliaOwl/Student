package model;
import static model.Degree.DEFAULT;

/**
 * Created by ASUS on 29.05.2017.
 */
public class Teacher extends Person {

    public static final Teacher DEFAULT_INSTANCE = new Teacher("set name", -1,DEFAULT, -1);
    private Degree degree;
    private int salary;

    public Teacher(String name, int age, Degree degree, int salary){
        this.name = name;
        this.age = age;
        this.degree = degree;
        this.salary = salary;
    }
    public static Teacher getInstance(){
        return DEFAULT_INSTANCE;

    }

    public Degree getDegree() {
        return degree;
    }

    public void setDegree(Degree degree) {
        this.degree = degree;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static Teacher getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public String toString(){
        return String.format("Name - %s, Age - %d, Degree - %s, Salary - %d", name,age,degree,salary);

    }
}
