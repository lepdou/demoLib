package concurrent.threadlocal;


public class Action {

    public void execute(){
        //获取当前请求的Request，每个线程都不一样，
        // 通过把Request放到ThreadLocal里面，则很容易获取
        System.out.println(ServletActionContext.getRequest());
    }
}
