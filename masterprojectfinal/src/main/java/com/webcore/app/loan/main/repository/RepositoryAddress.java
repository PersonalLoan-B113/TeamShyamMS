package com.webcore.app.loan.main.repository;

import org.springframework.data.repository.CrudRepository;

import com.webcore.app.loan.main.model.City;

public interface RepositoryAddress extends CrudRepository<City, Integer> {

}
