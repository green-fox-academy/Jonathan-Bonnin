package com.greenfoxacademy.restapi.repository;

import com.greenfoxacademy.restapi.models.Log;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LogRepository extends CrudRepository<Log, Integer> {

    @Override
    List<Log> findAll();

}
