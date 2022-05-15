package behavior.visitor;

public class Class3 extends Node{

    public void makeClass3(){
        System.out.println("Class3");
    }

    @Override
    public void accept(Visitor v) {
        v.doForClass3(this);
    }
}
