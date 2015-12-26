package apachecommon.beanutils;

import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class Demo {

    public static void main(String[] args) throws Exception {
        POJO pojo = populateDemo();
        Map map = BeanUtils.describe(pojo);
        System.out.println(map);
        System.out.println(BeanUtils.getProperty(pojo, "name"));
    }

    private static POJO populateDemo() throws InvocationTargetException, IllegalAccessException {
        POJO pojo = new POJO();
        Map<String,Object> context = new HashMap<String, Object>();
        context.put("id",1);
        context.put("name","lepdou");
        context.put("male",true);
        BeanUtils.populate(pojo, context);
//        System.out.println(pojo);
        return pojo;
    }
}


