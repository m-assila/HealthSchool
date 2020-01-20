package com.Federateur.Repositories;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.Federateur.Beans.Doctor;
;
@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {
	@Query(value="SELECT d FROM Doctor d WHERE d.email LIKE :keyword% ")	
	Doctor findDoctorByEmail(@Param("keyword") String keyword);

}
