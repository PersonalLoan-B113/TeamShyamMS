package com.webcore.app.ms.main.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.webcore.app.ms.main.model.BranchType;

@Repository

public interface HomeRepository extends CrudRepository<BranchType, Integer>
{
	
}
