package designpattern.builder;

public class Human {
    private String header;
    private String body;
    private String hair;

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

    public String getHair() {
        return hair;
    }

    public void setHair(String hair) {
        this.hair = hair;
    }

    @Override
    public String toString() {
        return "Human{" +
                "header='" + header + '\'' +
                ", body='" + body + '\'' +
                ", hair='" + hair + '\'' +
                '}';
    }
}
