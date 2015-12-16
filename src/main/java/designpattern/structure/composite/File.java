package designpattern.structure.composite;

public interface File {

    String getFileName();

    void addFile(File file);

    void remove();

    void listFiles();
}
