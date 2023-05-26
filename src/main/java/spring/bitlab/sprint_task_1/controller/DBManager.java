package spring.bitlab.sprint_task_1.controller;

import spring.bitlab.sprint_task_1.db.Student;

import java.util.ArrayList;

public class DBManager {

    private static final ArrayList<Student> students = new ArrayList<Student>();
    private static Long id = 3L;
    static {
        students.add(new Student(1L, "Adil", "Uryn", 95, "A"));
        students.add(new Student(2L, "Nur", "Beksultanov", 50, "D"));
    }

    public static ArrayList<Student> getStudents() {
        return students;
    }

    public static void addStudent(Student student) {
        student.setId(id);
        id++;
        if(student.getExam() >= 90) {
            student.setMark("A");
        } else if (student.getExam() >= 75 && student.getExam() < 89) {
            student.setMark("B");
        } else if (student.getExam() >= 60 && student.getExam() < 74) {
            student.setMark("C");
        } else if (student.getExam() >= 50 && student.getExam() < 59) {
            student.setMark("D");
        } else {
            student.setMark("F");
        }
        students.add(student);
    }

//    public static void setMark(Student student) {
//
//    }
}
