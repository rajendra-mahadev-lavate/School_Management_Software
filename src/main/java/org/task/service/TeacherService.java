package org.task.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.task.entity.Teacher;
import org.task.repo.TeacherRepository;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;

    public Teacher createTeacher(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    public List<Teacher> getAllTeachers() {
        return teacherRepository.findAll();
    }

    public Optional<Teacher> getTeacherById(Integer teacherId) {
        return teacherRepository.findById(teacherId);
    }

    public Teacher updateTeacher(Integer teacherId, Teacher teacherDetails) {
        Teacher teacher = teacherRepository.findById(teacherId)
                .orElseThrow(() -> new RuntimeException("Teacher not found"));
        teacher.setTeacherName(teacherDetails.getTeacherName());
        return teacherRepository.save(teacher);
    }

    public void deleteTeacher(Integer teacherId) {
        teacherRepository.findById(teacherId)
                .orElseThrow(() -> new RuntimeException("Teacher not found"));
        teacherRepository.deleteById(teacherId);
    }
}
