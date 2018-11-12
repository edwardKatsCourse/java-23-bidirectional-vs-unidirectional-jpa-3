package com.telran.repository.unidirectional.many_to_one;

import com.telran.model.unidirectional.many_to_one.Group;
import com.telran.model.unidirectional.many_to_one.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {

    List<Student> findByGroup(Group group);
    List<Student> findByGroup_Id(Long id);
}
