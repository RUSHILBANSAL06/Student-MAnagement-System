package controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import entity.Student;
import services.StudentService;

@Controller
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService) {
        super();
        this.studentService = studentService;
    }


@GetMapping("/students")
    public String listStudents(Model model) {
       
        model.addAttribute("students", studentService.getAllStudents());
        return "students";
    }
}

