package com.example.demo.student;

import com.example.demo.student.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    @Autowired
    StudentService(StudentRepository thestudentRepository) {
        studentRepository = thestudentRepository;

    }

    public void saveStudent(Student thestudent) {
        studentRepository.save(thestudent);
    }


    public List<Student> GetStudents() {
        return studentRepository.findAll();
    }

    @Transactional
    public void DeletebyId(long id) {
        studentRepository.deleteById(id);
    }
}
