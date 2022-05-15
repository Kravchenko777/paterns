package behavior.visitor;

import java.util.List;

public class Visitor {

    public void doForClass1(Class1 class1){
        class1.makeClass1();
    }

    public void doForClass2(Class2 class2){
        class2.makeClass2();
    }

    public void doForClass3(Class3 class3){
        class3.makeClass3();
    }

    public void makeWork(List<Node> nodes){
        for(Node node:nodes){
            if(node instanceof Class3){
                doForClass3((Class3) node);
            } else if(node instanceof Class2) {
                doForClass2((Class2) node);
            } else if(node instanceof Class1) {
                doForClass1((Class1) node);
            }
        }
    }

    public void makeWorkWithAccept(List<Node> nodes){
        for(Node node:nodes){
            node.accept(this);
        }
    }


}
