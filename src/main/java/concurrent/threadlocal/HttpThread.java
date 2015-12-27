package concurrent.threadlocal;


import java.util.Random;

public class HttpThread extends Thread {

    @Override
    public void run() {
        super.run();
        initContext();
        Action action = new Action();
        action.execute();
    }

    //模拟初始context，把HttpServletRequest放到context里面
    public void initContext(){
        ServletActionContext.putContext("request", randomRequest());
    }

    private String randomRequest(){
        return "HttpServletRequest" + new Random().nextInt(100);
    }


}
