package behavior.visitor;

public class ClassThird extends Node{

    public void makeClassThird(){
        System.out.println("ClassThird");
    }

    @Override
    public void accept(Visitor v) {
        v.doForClassThird(this);
    }
}
