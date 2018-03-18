package vip.com.patterns.decorator;

public class DecoratorTest {
    public static void main(String[] args) {
        SignService signService = new SignService();
        ThirdSignService thirdSignService = new ThirdSignService(signService);
        thirdSignService.login();
        thirdSignService.wechatLogin();
    }
}
