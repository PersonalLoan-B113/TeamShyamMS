package com.webcore.app.loan.main.repository;

import org.springframework.data.repository.CrudRepository;

import com.webcore.app.loan.main.model.User;

public interface RepositoryUser extends CrudRepository<User, Integer> {

}
