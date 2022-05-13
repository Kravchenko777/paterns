package structural.bridge;

public class Form {

    private Inter inter;

    public Form(Inter inter){
        this.inter = inter;
    }

    public void doIt(){
        inter.get();
        inter.set();
    }
}
