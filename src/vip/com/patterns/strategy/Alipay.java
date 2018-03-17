package vip.com.patterns.strategy;

public class Alipay implements Payment{
    @Override
    public PayState pay() {
        System.out.println("使用支付宝");
        PayState payState = new PayState(200,"支付宝支付成功",200);
        return payState;
    }
}
