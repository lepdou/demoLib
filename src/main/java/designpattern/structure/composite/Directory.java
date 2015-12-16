package designpattern.structure.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements File {
    private String fileName;
    private List<File> subFiles = new ArrayList<File>();

    public Directory(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public String getFileName() {
        return fileName;
    }

    @Override
    public void addFile(File file) {
        subFiles.add(file);
    }

    @Override
    public void remove() {
        for (File file : subFiles) {
            file.remove();
        }
    }

    @Override
    public void listFiles() {
        for (File file : subFiles)
            System.out.println(file.getFileName());

    }
}
