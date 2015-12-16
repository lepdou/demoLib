package designpattern.builder;

/**
 * 创建者模式
 *  核心:
 *   1.定义一个接口，接口里定义生产线的每一个步骤，而且可能具有多条生产线，每条生产线的产品不一样。
 *   每条生产线自定义每一个步骤实现。
 *
 *  结合其他模式:
 *   1.当只有一条生产线的时候，就没必要定义生产线一系列步骤的接口了。直接定义一个Builder类，
 *   Builder类暴露一个build()接口，在build()实现中，可以定义一系列的私有方法来表示每一个
 *   创建过程。此种情况我们叫它“Factory Class”模式吧。相对于"Factory method"而言。
 *
 *  模式是死的，人是活的
 */
public class Client {

    public static void main(String[] args){
        //创建指定的builder
        HumanBuilder humanBuilder = new HumanBuilder();
        //把builder塞给director
        Director director = new Director(humanBuilder);
        //开始build
        director.construct();
        //从builder中获取产品
        Human human = humanBuilder.getResult();
        System.out.println(human);

        //简单变型二
        HumanBuilder humanBuilder1 = new HumanBuilder();
        Human human1 = humanBuilder1.build();
        System.out.println(human1);


    }
}
