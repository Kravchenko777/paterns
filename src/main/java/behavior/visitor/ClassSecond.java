package behavior.visitor;

public class ClassSecond extends Node{

    public void makeClassSecond(){
        System.out.println("ClassSecond");
    }

    @Override
    public void accept(Visitor v) {
        v.doForClassSecond(this);
    }
}
