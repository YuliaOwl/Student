package view;

import controller.Manager;
import controller.StudentManager;
import model.Student;

import javax.swing.table.AbstractTableModel;

/**
 * Created by ASUS on 04.06.2017.
 */
public class TableModel extends AbstractTableModel {

    private Manager<Student> manager = new StudentManager;

    public int getRowCount() {
        return manager.getAll().size();
    }

    public int getColumnCount() {
        return 7;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        Student student = manager.getAll().get(rowIndex);
        switch (columnIndex){
            case 0 : return student.getName();
            case 1 : return student.getAge();
            case 2 : return student.getAverageGrade();
            case 3 : return student.getTeacher().getName();
            case 4 : return student.getTeacher().getAge();
            case 5 : return student.getTeacher().getDegree();
            case 6 : return student.getTeacher().getSalary();
        }

        return "text";
    }
    public String getColumnName (int columnIndex){
        switch (columnIndex){
            case 0 : return "NAME";
            case 1 : return "AGE";
            case 2 : return "AVERAGE GRADE";
            case 3 : return "TEACHER";
            case 4 : return "TEACHER'S AGE";
            case 5 : return "DEGREE";
            case 6 : return "SALARY";
        }
        return "*";
    }





}
