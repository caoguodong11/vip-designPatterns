package vip.com.patterns.template;

import java.util.List;

/**
 * 模板模式
 */
public class templateTest {
    public static void main(String[] args) {
        tempTest();
    }


    public static void tempTest() {
        try {
            String sql = "select * from upms_user";
            UserDao userDao = new UserDao();
            List<User> users = userDao.query(sql, null);
            System.out.println(users);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
