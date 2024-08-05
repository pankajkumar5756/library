package com.student.repositroy;

import org.springframework.data.repository.CrudRepository;

import com.student.entity.StuEntity;

public interface StuRepositroy extends CrudRepository<StuEntity, Long> {
	
}
