package vip.com.patterns.decorator;

public class ThirdSignService extends SignService{
    private SignService signService;

    public ThirdSignService(SignService signService){
        this.signService = signService;
    }

    public void wechatLogin(){
        System.out.println("微信登陆");
    }
}
