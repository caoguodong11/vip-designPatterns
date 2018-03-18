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
            String sql = "select * from upms_user where user_id = ?";
            UserDao userDao = new UserDao();
            List<User> users = userDao.query(sql, new Object[]{2});
            System.out.println(users);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
