package vip.com.patterns.template;

import java.sql.*;
import java.util.List;

public class JdbcTemplate {

    private final static String url = "jdbc:mysql://127.0.0.1:3306/zheng";
    private final static String username = "root";
    private final static String password = "123456";

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Connection getConn() throws SQLException {
        Connection connection = DriverManager.getConnection(url, username, password);
        return connection;
    }

    public void closeConn(Connection connection) throws SQLException {
        if (connection != null) connection.close();
    }

    public void closeResultset(ResultSet resultSet) throws SQLException {
        if (resultSet != null) resultSet.close();
    }

    public void closeStatement(Statement statement) throws SQLException {
        if (statement != null) statement.close();
    }

    public PreparedStatement preparedStatement(Connection conn, String sql, Object[] values) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        if (values != null && values.length > 0) {
            for (int i = 1; i <= values.length; i++) {
                preparedStatement.setObject(i, values[i-1]);
            }
        }
        return preparedStatement;
    }


    public <T> List<T> executeQuery(String sql, Object[] values, RowMapper<T> rowMapper) throws Exception {
        Connection conn = this.getConn();
        PreparedStatement preparedStatement = this.preparedStatement(conn, sql, values);
        ResultSet resultSet = preparedStatement.executeQuery();
        List<T> list = rowMapper.rowMapper(resultSet);
        this.closeResultset(resultSet);
        this.closeStatement(preparedStatement);
        this.closeConn(conn);
        return list;
    }

}
