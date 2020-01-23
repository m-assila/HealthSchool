package com.Federateur.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.Federateur.Beans.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

	@Query(value="SELECT d FROM Student d WHERE d.email LIKE :keyword% ")	
	Student findStudentByEmail(@Param("keyword") String keyword);
}
