package com.scorpio.h2.repository;

import org.springframework.data.repository.CrudRepository;

import com.scorpio.h2.entity.Country;

public interface CountryRepository extends CrudRepository<Country, Long>{

}
