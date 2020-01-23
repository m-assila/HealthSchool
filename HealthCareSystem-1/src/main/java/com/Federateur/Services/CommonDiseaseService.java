package com.Federateur.Services;

import java.util.List;
import java.util.Optional;

import com.Federateur.Beans.CommonDisease;

public interface CommonDiseaseService {
	
	void saveCommonDisease(CommonDisease m);
	public void deleteCommonDiseaseById(Long id);
	Optional<CommonDisease> getCommonDiseaseById(Long id);
	List<CommonDisease> getAllCommonDiseases();

}
