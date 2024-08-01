package org.task.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.task.entity.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Integer> {
    // Additional query methods can be defined here if needed
}