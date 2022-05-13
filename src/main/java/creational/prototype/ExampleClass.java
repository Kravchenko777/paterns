package creational.prototype;

public class ExampleClass {

    private String str;
    private Boolean bool;

    public ExampleClass(){}

    public ExampleClass(String str, Boolean bool){
        this.str  =str;
        this.bool = bool;
    }

    public ExampleClass cloneIt(ExampleClass exampleClass){
        exampleClass.str = this.str;
        exampleClass.bool = this.bool;
        return exampleClass;
    }

    public String getStr() {
        return str;
    }

    public Boolean getBool() {
        return bool;
    }
}
