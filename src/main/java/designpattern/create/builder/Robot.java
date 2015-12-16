package designpattern.builder;

public class Robot {

    private String header;
    private String body;

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "header='" + header + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
