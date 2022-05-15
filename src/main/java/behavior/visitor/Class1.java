package behavior.visitor;

public class Class1 extends Node{

    public void makeClass1(){
        System.out.println("Class1");
    }

    @Override
    public void accept(Visitor v) {
        v.doForClass1(this);
    }
}
