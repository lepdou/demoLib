package concurrent.threadlocal;

import java.util.HashMap;
import java.util.Map;

/**
 * 模拟 ServletActionContext
 * 一般一个线程用一个ThreadLocal，然后在ThreadLocal里面自己封装一个容器，例如strut2里面的ActionContext
 */
public class ServletActionContext {
    /**
     * 当new ThreadLocal时，
     * <p/>
     * 1.在表示当前线程的Thread实例上创建一个Map<ThreadLocal,Value>
     * ThreadLocal.ThreadLocalMap threadLocals = null;
     * <p/>
     * 2.创建多个ThreadLocal，只是往这个map里面添加多项
     * public void set(T value) {
     * Thread t = Thread.currentThread();
     * ThreadLocalMap map = getMap(t);
     * if (map != null)
     * map.set(this, value);
     * else
     * createMap(t, value);
     * }
     * <p/>
     * 3.TheadLocal维护一个全局的自增长hashcode值，确保Map不会被覆盖掉
     * private static int nextHashCode() {
     * return nextHashCode.getAndAdd(HASH_INCREMENT);
     * }
     */
    private static ThreadLocal<Map<String, String>> threadLocal = new ThreadLocal<Map<String, String>>();

    public static void putContext(String key, String value) {
        Map<String, String> context = getContext();
        context.put(key, value);
    }

    public static String getRequest() {
        Map<String, String> context = getContext();
        return context.get("request");
    }

    private static Map<String, String> getContext() {
        Map<String, String> context = threadLocal.get();
        if (context == null) {
            context = new HashMap<String, String>();
            threadLocal.set(context);
        }
        return context;
    }
}
