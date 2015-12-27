package concurrent.threadlocal;

import java.util.HashMap;
import java.util.Map;

/**
 * 模拟 ServletActionContext
 * 一般一个线程用一个ThreadLocal，然后在ThreadLocal里面自己封装一个容器，例如strut2里面的ActionContext
 */
public class ServletActionContext {
    private static ThreadLocal<Map<String, String>> threadLocal = new ThreadLocal<Map<String, String>>();

    public static void putContext(String key, String value) {
        Map<String, String> context = getContext();
        context.put(key, value);
    }
    public static String getRequest(){
        Map<String, String> context = getContext();
        return context.get("request");
    }

    private static Map<String,String> getContext(){
        Map<String, String> context = threadLocal.get();
        if (context == null) {
            context = new HashMap<String, String>();
            threadLocal.set(context);
        }
        return context;
    }
}
