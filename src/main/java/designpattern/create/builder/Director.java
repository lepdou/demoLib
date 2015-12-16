package designpattern.builder;

public class Director {
    private PersonBuilder builder;

    public Director(PersonBuilder personBuilder){
        this.builder = personBuilder;
    }

    public void construct(){
        builder.buildHair();
        builder.buildHead();
        builder.buildBody();
    }
}
