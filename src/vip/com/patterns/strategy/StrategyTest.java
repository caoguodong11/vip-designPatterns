package vip.com.patterns.strategy;

/**
 * 策略模式
 */
public class StrategyTest {
    public static void main(String[] args) {
        Order order = new Order();
        System.out.println(order.pay(PayEnum.Wechat));
    }
}
