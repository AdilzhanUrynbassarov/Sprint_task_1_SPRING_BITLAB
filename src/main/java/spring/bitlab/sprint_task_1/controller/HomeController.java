package spring.bitlab.sprint_task_1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import spring.bitlab.sprint_task_1.db.Student;

import java.lang.reflect.Array;
import java.util.ArrayList;

@Controller
public class HomeController {
    @GetMapping(value = "/")
    public String indexPage(Model model) {
        ArrayList<Student> students = DBManager.getStudents();
        model.addAttribute("studenty", students);

        return "index";

    }

    @PostMapping("/add-student")
    public String addStudent(Student student) {
        DBManager.addStudent(student);
        return "redirect:/";
    }
    @GetMapping(value = "/add-student") // Одинаковые ссылки можно использовать для Get и Post mapping
    public String addMusicPage(Model model) {
        return "addStudent";// request.getDispatcher("/addmusic.html");
    }

}
