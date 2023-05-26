package spring.bitlab.sprint_task_1.controller;

import spring.bitlab.sprint_task_1.db.Student;

import java.util.ArrayList;

public class DBManager {

    private static final ArrayList<Student> students = new ArrayList<>();

    static {
        students.add(new Student(1L, "Adil", "Uryn", 95, "A"));
        students.add(new Student(2L, "Nur", "Beksultanov", 50, "D"));
    }

    public static ArrayList<Student> getStudents() {
        return students;
    }
}
