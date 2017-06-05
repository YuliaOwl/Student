package controller;

import model.Student;
import model.Teacher;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ASUS on 02.06.2017.
 */
public class TeacherManager implements Manager <Teacher> {

    private Map<String, Teacher> teachers = new HashMap<>();
    public void save(Teacher teacher) {
        teachers.put(teacher.getName(),teacher);
    }
    public void remove(String name) {
        teachers.remove(name);

    }

    public Student search(String name) {
        return null;
    }

    public Student edit(String name, Teacher person) {
        return null;
    }


    public List getAll() {
        return null;
    }
}
