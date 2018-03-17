package vip.com.patterns.strategy;

public enum PayEnum {
    ALI(new Alipay()),
    Wechat(new WechatPay());

    Payment payment;

    PayEnum(Payment payment){
       this.payment = payment;
    }

    public Payment get(){
        return this.payment;
    }
}
