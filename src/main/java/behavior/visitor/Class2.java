package behavior.visitor;

public class Class2 extends Node{

    public void makeClass2(){
        System.out.println("Class2");
    }

    @Override
    public void accept(Visitor v) {
        v.doForClass2(this);
    }
}
