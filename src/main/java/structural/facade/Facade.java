package structural.facade;

public class Facade {

    public void doIt(){
        Class1 class1 = new Class1();
        Class2 class2 = new Class2();
        Class3 class3 = new Class3();

        class1.doSomething(); class2.doSomething(); class3.doSomething();
    }
}
