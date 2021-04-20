package com.kodilla.hibernate.task.repository;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.task.Task;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeRepositoryTestSuite {
    @Autowired
    private EmployeeRepository employeeRepository;

    private static final String FIRSTNAME = "Jack";
    private static final String LASTNAME = "Smith";
    private static final String FIRSTNAME2 = "Adam";
    private static final String LASTNAME2 = "Smith";
    private static final String FIRSTNAME3 = "Jack";
    private static final String LASTNAME3 = "Black";
    @Test
    public void testEmployeeRepositoryFindByName() {
        //Given
        Employee employee = new Employee(FIRSTNAME, LASTNAME);
        employeeRepository.save(employee);
        employee = new Employee(FIRSTNAME2, LASTNAME2);
        employeeRepository.save(employee);
        employee = new Employee(FIRSTNAME3, LASTNAME3);
        employeeRepository.save(employee);

        //When
        List<Employee> readEmployees = employeeRepository.findByLastname(LASTNAME);

        //Then
        Assert.assertEquals(2, readEmployees.size());

        //CleanUp
        int id;
        for (Employee employee1 : employeeRepository.findAll()) {
            id = employee1.getId();
            employeeRepository.deleteById(id);
        }
    }
}
