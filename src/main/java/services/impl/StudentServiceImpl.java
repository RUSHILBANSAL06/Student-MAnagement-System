package services.impl;

import services.StudentService;
import java.util.List;

import org.springframework.stereotype.Service;

import entity.Student;
import repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        super();
        this.studentRepository = studentRepository;
    }

    
    @Override
    public List<Student> getAllStudents() {

        return studentRepository.findAll();
    }

}
