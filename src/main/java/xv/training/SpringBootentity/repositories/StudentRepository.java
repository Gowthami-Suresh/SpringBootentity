package xv.training.SpringBootentity.repositories;

import java.util.List;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import xv.training.SpringBootentity.entities.Student;

//create interface student repository and extends Crud repository
public interface StudentRepository extends CrudRepository<Student, Long> {

	// write query one field
	// find name return student list
	//List<Student>findByName(String name);

	// find age
	// List<Student>findByAge(int age)
	;

	// find qualification
	// List<Student>findByQualification(String qualification);

	// find name and age
	// List<Student>findByNameandAge(String name,int age);

	// find qualification and gender
	// List<Student>findByQualificationandGender(String qualification,String
	// gender);

	// @Query("select s from Student where s.name = ?1")
	// List<Student>findByName1(String name);

}
