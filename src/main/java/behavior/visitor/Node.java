package behavior.visitor;

//Интерфейс элементов
public abstract class Node {

    public abstract void accept(Visitor v);
}
