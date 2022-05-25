package behavior.visitor;

public class ClassFirst extends Node{

    public void makeClassFirst(){
        System.out.println("ClassFirst");
    }

    @Override
    public void accept(Visitor v) {
        v.doForClassFirst(this);
    }
}
