package vip.com.patterns.strategy;

public class Order {
    public PayState pay(PayEnum payEnum){
        Payment payment = payEnum.get();
        PayState payState = payment.pay();
        return payState;
    }
}
