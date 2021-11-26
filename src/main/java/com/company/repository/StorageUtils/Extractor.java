package com.company.repository.StorageUtils;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@FunctionalInterface
public interface Extractor<T> {

    List<T> extract(ResultSet rs) throws SQLException;
}
