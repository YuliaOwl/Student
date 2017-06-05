package controller;

import model.Student;

import java.util.List;

/**
 * Created by ASUS on 02.06.2017.
 */
public interface Manager<T> {
    void save (T person);
    void remove (String name);
    Student search (String name);
    Student edit (String name, T person);
    List<T> getAll();
}
