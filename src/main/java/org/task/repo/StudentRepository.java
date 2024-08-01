package org.task.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.task.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
