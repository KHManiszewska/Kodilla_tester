package com.kodilla.hibernate.task.repository;

import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.task.TaskFinancialDetails;
import com.kodilla.hibernate.task.repository.TaskListRepository;
import com.kodilla.hibernate.task.repository.TaskRepository;
import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static java.lang.Boolean.TRUE;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskFinancialDetailsRepositoryTestSuite {
    @Autowired
    private TaskFinancialDetailsRepository taskFinancialDetailsRepository;

    private static final double PRICE = 1334;
    private static final boolean PAID = TRUE;
    private static final double PRICE2 = 2569;
    private static final boolean PAID2 = TRUE;

    @Test
    public void testTaskFinancialDetailsRepositoryFindByPaid() {
        //Given
        TaskFinancialDetails taskFinancialDetails = new TaskFinancialDetails(PRICE, PAID);
        taskFinancialDetailsRepository.save(taskFinancialDetails);
        taskFinancialDetails = new TaskFinancialDetails(PRICE2, PAID2);
        taskFinancialDetailsRepository.save(taskFinancialDetails);
        boolean paid = taskFinancialDetails.getPaid();

        //When
        List<TaskFinancialDetails> readTasksFD = taskFinancialDetailsRepository.findByPaid(true);

        //Then
        Assert.assertEquals(2, readTasksFD.size());

        //CleanUp
        int id = readTasksFD.get(0).getId();
        taskFinancialDetailsRepository.deleteById(id);
        id = readTasksFD.get(1).getId();
        taskFinancialDetailsRepository.deleteById(id);
    }
}
