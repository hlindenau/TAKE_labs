/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */

import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Len
 */

@ManagedBean
@ViewScoped
public class TableBean {
    
    private List<Student> students;
    /**
     * Creates a new instance of TableBean
     */
    public TableBean() {
        students = new ArrayList<>();
        students.add(new Student("Adam", "Adams", 4.1f));
        students.add(new Student("Will", "Smith", 4.3f));
        students.add(new Student("Jada", "Smith", 4.4f));
        students.add(new Student("Jaden", "Smith", 2.5f));
        students.add(new Student("Zonica", "Zmith", 3.1f));
        students.add(new Student("Donica", "Dmith", 3.1f));
        students.add(new Student("Ronica", "Rmith", 3.1f));
        students.add(new Student("Tonica", "Tmith", 3.1f));
        students.add(new Student("Gonica", "Gmith", 3.1f));
    }

    /**
     * @return the students
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     * @param students the students to set
     */
    public void setStudents(List<Student> students) {
        this.students = students;
    }
    
}
