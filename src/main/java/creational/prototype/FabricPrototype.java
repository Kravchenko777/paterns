package creational.prototype;

public class FabricPrototype {

    IPrototype prototype;

    public FabricPrototype(IPrototype prototype) {
        this.prototype = prototype;
    }

    public Object clone(Object prototype){
        return this.prototype.cloneIt(prototype);
    }
}
