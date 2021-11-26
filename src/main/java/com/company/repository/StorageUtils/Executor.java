package com.company.repository.StorageUtils;

import java.sql.*;
import java.util.Collections;
import java.util.List;

public final class Executor {

    private static Executor instance;
    private Executor(){

    }

    public void execute(String query) {
        try (
                Connection connection = ConnectionManager.getInstance().getConnection();
                Statement statement = connection.createStatement()
        ) {
            statement.executeUpdate(query);
        } catch (SQLException e) {
            System.out.println("Unable to get data: " + e.getMessage());
        }
    }

    public <T> List<T> executeSelect(String query, Extractor<T> extractor) {
        try (
                Connection connection = ConnectionManager.getInstance().getConnection();
                Statement statement = connection.createStatement()
        ) {
            ResultSet resultSet = statement.executeQuery(query);
            return extractor.extract(resultSet);
        } catch (SQLException e) {
            System.out.println("Unable to get data: " + e.getMessage());
        }
        return Collections.emptyList();
    }


    public static Executor getInstance() {
        if (instance == null) {
            instance = new Executor();
        }
        return instance;
    }
}
