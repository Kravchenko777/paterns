package creational.singleton;

public class ExampleClass {

    private static String value;
    private static ExampleClass exampleClass;

    private ExampleClass(){
        value = "String";
    }

    public static ExampleClass getInstance(){
        if(exampleClass == null) {
            exampleClass = new ExampleClass();
        }
        return exampleClass;
    }
}
