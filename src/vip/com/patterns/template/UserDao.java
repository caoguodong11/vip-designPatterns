package vip.com.patterns.template;

import java.lang.reflect.Field;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserDao {

    JdbcTemplate jdbcTemplate = new JdbcTemplate();

    public List<User> query(String sql,Object[] values) throws Exception {
        List<User> users = jdbcTemplate.executeQuery(sql, values, new RowMapper<User>() {
            @Override
            public List<User> rowMapper(ResultSet resultSet) throws Exception {
                List<User> userList = new ArrayList<>();
                while (resultSet.next()) {
                    User user = new User();
                    Field[] files = user.getClass().getDeclaredFields();
                    for (Field field : files) {
                        field.setAccessible(true);
                        Object value = resultSet.getObject(field.getName());
                        field.set(user, value);
                    }
                    userList.add(user);
                }
                return userList;
            }
        });
        return users;
    }

}
