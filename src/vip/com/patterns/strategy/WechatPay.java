package vip.com.patterns.strategy;

public class WechatPay implements Payment{
    @Override
    public PayState pay() {
        System.out.println("使用微信支付");
        PayState payState = new PayState(200,"微信支付成功",400);
        return payState;
    }
}
