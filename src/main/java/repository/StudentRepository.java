package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
                                                         //Jpa repository <entity class, primary key data type>
}
