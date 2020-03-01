package com.webcore.app.loan.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.webcore.app.loan.main.model.Branch;
import com.webcore.app.loan.main.model.BranchType;
@Repository
public interface HomeRepository extends CrudRepository<Branch , Integer> {

	void save(BranchType bt);

}
