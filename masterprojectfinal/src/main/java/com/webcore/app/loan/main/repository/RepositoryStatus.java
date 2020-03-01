package com.webcore.app.loan.main.repository;

import org.springframework.data.repository.CrudRepository;

import com.webcore.app.loan.main.model.Status;

public interface RepositoryStatus extends CrudRepository<Status, Integer> {

}
