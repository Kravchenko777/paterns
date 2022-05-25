package behavior.visitor;

import java.util.List;

//Интерфейс посетителя
public class Visitor {

    // методы посещения объектов
    public void doForClassFirst(ClassFirst classFirst){
        classFirst.makeClassFirst();
    }

    public void doForClassSecond(ClassSecond classSecond){
        classSecond.makeClassSecond();
    }

    public void doForClassThird(ClassThird classThird){
        classThird.makeClassThird();
    }

    public void makeWork(List<Node> nodes){
        for(Node node:nodes){
            if(node instanceof ClassThird){
                doForClassThird((ClassThird) node);
            } else if(node instanceof ClassSecond) {
                doForClassSecond((ClassSecond) node);
            } else if(node instanceof ClassFirst) {
                doForClassFirst((ClassFirst) node);
            }
        }
    }

    public void makeWorkWithAccept(List<Node> nodes){
        for(Node node:nodes){
            node.accept(this);
        }
    }


}
