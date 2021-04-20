package com.kodilla.hibernate.task.repository;

import com.kodilla.hibernate.manytomany.Company;
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
public class CompanyRepositoryTestSuite {
    @Autowired
    private CompanyRepository companyRepository;

    private static final String NAME = "BIG BAG";

    @Test
    public void testCompanyRepositoryFindByName() {
        //Given
        Company company = new Company(NAME);
        companyRepository.save(company);
        String nameC = company.getName();

        //When
        List<Company> readCompanies = companyRepository.findByName(nameC);

        //Then
        Assert.assertEquals(1, readCompanies.size());

        //CleanUp
        int id = readCompanies.get(0).getId();
        companyRepository.deleteById(id);
    }
}
