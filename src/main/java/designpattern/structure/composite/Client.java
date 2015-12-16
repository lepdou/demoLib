package designpattern.structure.composite;

/**
 * (Composite)组合模式
 *  核心：具体对象和组合对象具有一样的接口，
 *  具体对象和组合对象递归可以生产任意大小的树结构。对待组合对象和具体对象是一样的。
 */
public class Client {

    public static void main(String[] args){
        File img1 = new Image("readme.md");
        File img2 = new Image("list.png");
        File img3 = new Image("face.png");
        File images = new Directory("images");
        images.addFile(img2);
        images.addFile(img3);
        images.listFiles();
        System.out.println(images.getFileName());
        img1.listFiles();
    }
}
