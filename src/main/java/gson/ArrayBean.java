package gson;

import java.util.List;

public class ArrayBean {
    private List<IDBean> array1;
    private List<IDBean> array2;
    private List<IDBean> array3;

    public List<IDBean> getArray1() {
        return array1;
    }

    public void setArray1(List<IDBean> array1) {
        this.array1 = array1;
    }

    public List<IDBean> getArray2() {
        return array2;
    }

    public void setArray2(List<IDBean> array2) {
        this.array2 = array2;
    }

    public List<IDBean> getArray3() {
        return array3;
    }

    public void setArray3(List<IDBean> array3) {
        this.array3 = array3;
    }

    @Override
    public String toString() {
        return "ArrayBean{" +
                "array1=" + array1 +
                ", array2=" + array2 +
                ", array3=" + array3 +
                '}';
    }
}
