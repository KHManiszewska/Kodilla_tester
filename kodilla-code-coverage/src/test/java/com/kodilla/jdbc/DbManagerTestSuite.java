package com.kodilla.jdbc;

import org.junit.Assert;
import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DbManagerTestSuite {

    @Test
    public void testConnect() throws SQLException {
        //Given
        //When
        DbManager dbManager = DbManager.getInstance();
        //Then
        Assert.assertNotNull(dbManager.getConnection());
    }

    @Test
    public void testSelectUsers() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();
        String countQuery = "SELECT COUNT(*) FROM USERS";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(countQuery);
        int count = 0;
        while (rs.next()) {
            count = rs.getInt("COUNT(*)");
        }
        String sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('Zara', 'Ali')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('Otman', 'Use')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('Mark', 'Boq')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('Uli', 'Wimer')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('Oli', 'Kosiw')";
        statement.executeUpdate(sql);

        //When
        String sqlQuery = "SELECT * FROM USERS";
        statement = dbManager.getConnection().createStatement();
        rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while(rs.next()) {
            System.out.println(rs.getInt("ID") + ", " +
                    rs.getString("FIRSTNAME") + ", " +
                    rs.getString("LASTNAME"));
            counter++;
        }
        int expected = count + 5;
        Assert.assertEquals(expected, counter);
        sql = "DELETE FROM USERS WHERE FIRSTNAME = 'Zara' AND LASTNAME = 'Ali'";
        statement.executeUpdate(sql);
        sql = "DELETE FROM USERS WHERE FIRSTNAME = 'Otman' AND LASTNAME = 'Use'";
        statement.executeUpdate(sql);
        sql = "DELETE FROM USERS WHERE FIRSTNAME = 'Mark' AND LASTNAME = 'Boq'";
        statement.executeUpdate(sql);
        sql = "DELETE FROM USERS WHERE FIRSTNAME = 'Uli' AND LASTNAME = 'Wimer'";
        statement.executeUpdate(sql);
        sql = "DELETE FROM USERS WHERE FIRSTNAME = 'Oli' AND LASTNAME = 'Kosiw'";
        statement.executeUpdate(sql);
        rs.close();
        statement.close();
    }

    @Test
    public void testSelectUsersAndPosts() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();
        String countQuery = "SELECT U.FIRSTNAME, U.LASTNAME, COUNT(*) FROM USERS U\n" +
                "JOIN POSTS P ON U.ID = P.USER_ID\n" +
                "GROUP BY P.USER_ID\n" +
                "HAVING COUNT(*) > 1;";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(countQuery);

        int count = 0;

        while(rs.next()) {
            System.out.println("Current search status: "+ count);
            System.out.println(rs.getString("FIRSTNAME") + ", " +
                    rs.getString("LASTNAME"));
            count++;
        }

        String sql = "INSERT INTO POSTS(USER_ID, BODY) VALUES (3, 'Hi!')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO POSTS(USER_ID, BODY) VALUES (3, 'I am new')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO POSTS(USER_ID, BODY) VALUES (3, 'I need help!')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO POSTS(USER_ID, BODY) VALUES (5, 'Halo człowieki')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO POSTS(USER_ID, BODY) VALUES (5, 'Jest tam ktoś!')";
        statement.executeUpdate(sql);

        // When
        String sqlQuery = "SELECT U.FIRSTNAME, U.LASTNAME, COUNT(*) FROM USERS U\n" +
                "JOIN POSTS P ON U.ID = P.USER_ID\n" +
                "GROUP BY P.USER_ID\n" +
                "HAVING COUNT(*) > 1;";
        statement = dbManager.getConnection().createStatement();
        rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while(rs.next()) {
            System.out.println(rs.getString("FIRSTNAME") + ", " +
                    rs.getString("LASTNAME"));
            counter++;
        }
        int expected = count + 2;
        Assert.assertEquals(expected, counter);

        // CLEAN Database and close tools
        sql = "DELETE FROM POSTS WHERE USER_ID=3 AND BODY ='Hi!'";
        statement.executeUpdate(sql);
        sql = "DELETE FROM POSTS WHERE USER_ID=3 AND BODY ='I am new'";
        statement.executeUpdate(sql);
        sql = "DELETE FROM POSTS WHERE USER_ID=3 AND BODY ='I need help!'";
        statement.executeUpdate(sql);
        sql = "DELETE FROM POSTS WHERE USER_ID=5 AND BODY ='Halo człowieki'";
        statement.executeUpdate(sql);
        sql = "DELETE FROM POSTS WHERE USER_ID=5 AND BODY ='Jest tam ktoś!'";
        statement.executeUpdate(sql);
        rs.close();
        statement.close();
    }
}
