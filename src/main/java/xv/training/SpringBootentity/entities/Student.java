package xv.training.SpringBootentity.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

// create student class 
// we give entity persistence class

@Entity
public class Student {
	// create id and generated value
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	// create member fields
	private long id;

	private String name, sex, qualification;

	private int age;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "organization")
	@JsonIgnore
	private Organization organization;

	// create default constructor for student
	public Student() {

	}

	public Student(String name, String sex, String qualification, int age) {
		super();
		this.name = name;
		this.sex = sex;
		this.qualification = qualification;
		this.age = age;
	}
	// create getter and setter

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
