package concurrent.threadlocal;

public class Tomcat {

    public static void main(String[] args){
        HttpThread thread1 = new HttpThread();
        thread1.start();

        HttpThread thread2 = new HttpThread();
        thread2.start();

    }
}
