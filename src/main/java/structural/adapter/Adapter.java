package structural.adapter;

public class Adapter {

    public void doIt(Class1 class1, Class2 class2){
        class2.doSome(Integer.valueOf(class1.getString()));
    }
}
