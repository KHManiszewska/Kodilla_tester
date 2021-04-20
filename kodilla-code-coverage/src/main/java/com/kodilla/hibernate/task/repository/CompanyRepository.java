package com.kodilla.hibernate.task.repository;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.tasklist.TaskList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface CompanyRepository extends CrudRepository<Company, Integer> {
    List<Company> findByName(String name);

}