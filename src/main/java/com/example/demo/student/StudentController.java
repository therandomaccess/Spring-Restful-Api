package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/student")
public class StudentController {

    private StudentService theService;

    @Autowired
    StudentController(StudentService Service) {
        theService = Service;
    }


    @GetMapping("/")
    public List<Student> GetStudents() {
        return theService.GetStudents();
    }

    @PostMapping("/")
    public void saveStudent(@RequestBody Student student) {
        theService.saveStudent(student);
    }

    @DeleteMapping(path ="{studentId}")
    public void DeleteStudent(@PathVariable("studentId") Long id) {
        theService.DeletebyId(id);
    }


}
