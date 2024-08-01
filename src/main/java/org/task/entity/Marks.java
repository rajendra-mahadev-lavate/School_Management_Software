package org.task.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "marks")
public class Marks {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer studentId;
	private String studentName;
	private String teacherName;
	private String subject;
	private Integer marks;

	public Marks() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Marks(Integer studentId, String studentName, String teacherName, String subject, Integer marks) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.teacherName = teacherName;
		this.subject = subject;
		this.marks = marks;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Integer getMarks() {
		return marks;
	}

	public void setMarks(Integer marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Marks [studentId=" + studentId + ", studentName=" + studentName + ", teacherName=" + teacherName
				+ ", subject=" + subject + ", marks=" + marks + "]";
	}

}
