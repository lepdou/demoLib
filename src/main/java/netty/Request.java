package netty;

import java.io.Serializable;

public class Request implements Serializable {
    private static final long serialVersionUID = -8076148755812520660L;

    private int version;
    private String data;

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Request{" +
                "version=" + version +
                ", data='" + data + '\'' +
                '}';
    }
}
