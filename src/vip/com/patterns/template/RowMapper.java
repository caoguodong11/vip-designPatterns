package vip.com.patterns.template;

import java.sql.ResultSet;
import java.util.List;

public interface RowMapper<T> {
    List<T> rowMapper(ResultSet resultSet) throws Exception;
}
