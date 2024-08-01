package org.task.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.task.entity.Marks;

public interface MarksRepository extends JpaRepository<Marks, Long> {
}
