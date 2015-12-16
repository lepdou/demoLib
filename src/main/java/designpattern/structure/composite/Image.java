package designpattern.structure.composite;

public class Image implements File{
    private String fileName;

    public Image(String fileName){
        this.fileName = fileName;
    }
    @Override
    public String getFileName() {
        return fileName;
    }

    @Override
    public void addFile(File file) {

    }

    @Override
    public void remove() {

    }

    @Override
    public void listFiles() {

    }
}
