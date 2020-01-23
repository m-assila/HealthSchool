package com.Federateur.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.Federateur.Beans.CommonDisease;



public interface CommonDiseaseRepository extends JpaRepository<CommonDisease, Long> {
	
	@Query(value="SELECT d FROM CommonDisease d WHERE d.name LIKE :keyword% ")	
	CommonDisease findCommonDiseaseByName(@Param("keyword") String keyword);

}
