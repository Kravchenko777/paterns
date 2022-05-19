package structural.decorator;

// Декоратор
public class Decorator implements IObject {

    protected IObject wrapper;

    public Decorator(IObject message){
        this.wrapper = message;
    }

    @Override
    public String getName() {
        return wrapper.getName();
    }

    @Override
    public Integer getSumm() {
        return 1;
    }
}
