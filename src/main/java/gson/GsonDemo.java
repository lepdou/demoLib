package gson;

import com.alibaba.fastjson.JSON;
import com.google.gson.Gson;

public class GsonDemo {
    private static final Gson gson = new Gson();

    public static void main(String[] args) {

        String jsonStr = "{\n" +
                "\t\"id\":1,\n" +
                "\t\"name\":\"ledpou\",\n" +
                "\t\"likes\":[\n" +
                "\t\t{\n" +
                "\t\t\t\"array1\":[\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"id\":1\n" +
                "\t\t\t\t}\n" +
                "\t\t\t],\n" +
                "\t\t\t\"array2\":[\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"id\":2\n" +
                "\t\t\t\t}\n" +
                "\t\t\t],\n" +
                "\t\t\t\"array3\":[\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"id\":2\n" +
                "\t\t\t\t}\n" +
                "\t\t\t]\n" +
                "\t\t}\n" +
                "\t\t\n" +
                "\t]\n" +
                "}";
//        UserBean user = jsonToBean(jsonStr, UserBean.class);
        UserBean user = JSON.parseObject(jsonStr, UserBean.class);
        System.out.println(user);
    }


    public static <T> T jsonToBean(String json, Class<T> clazz) {
        Object obj = gson.fromJson(json, clazz);
        return (T) obj;
    }


}
