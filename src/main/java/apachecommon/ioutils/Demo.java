package apachecommon.ioutils;

import org.apache.commons.io.IOUtils;
import org.apache.commons.io.LineIterator;

import java.io.InputStream;
import java.util.List;

public class Demo {

    public static void main(String[] args) throws Exception{
        InputStream inputStream = IOUtils.toInputStream("servlet中有这样的使用：\n" +
                "先定义form表单内容的Info对象(当然你要先写一个bean,这个bean中包含form表单中各个对象的属性)\n" +
                "    InsuranceInfo info = new InsuranceInfo();  （这是一个javabean）\n" +
                "    BeanUtilities.populateBean(info, request);\n" +
                "——> populateBean(info, request.getParameterMap());（先将request内容转为Map类型）\n" +
                "——>BeanUtils.populate(info, propertyMap);（调用包中方法映射）");

//        System.out.println(IOUtils.toString(inputStream));

//        LineIterator lineIterator = IOUtils.lineIterator(inputStream, "utf-8");
//        String line = null;
//        while (lineIterator.hasNext()){
//            line = (String) lineIterator.next();
//            System.out.println(line);
//        }

//        List<String> lines =IOUtils.readLines(inputStream);
//        for (String line:lines){
//            System.out.println(line);
//        }
    }
}
