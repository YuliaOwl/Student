package controller;

import model.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ASUS on 02.06.2017.
 */
public class StudentManager implements Manager <Student> {


    private Map<String, Student> students = new HashMap<>();


    public void save(Student student) {
        students.put(student.getName(),student);
    }
    public void remove(String name) {
        students.remove(name);
    }

    public Student search(String name) {
        return students.get(name);
    }

    public Student edit(String name, Student student) {
        Student toReturn = student;
        if(students.containsKey(name)){
            toReturn = students.get(name);
            students.put(student.getName(),student);
        }
        return toReturn;
    }

    public List getAll() {
        List<Student> studentList = new ArrayList<>();
        for (Student student : students.values()){
            studentList.add(student);

        }
        return studentList;
    }
}
