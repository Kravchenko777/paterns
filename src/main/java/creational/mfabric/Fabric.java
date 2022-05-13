package creational.mfabric;

public abstract class Fabric {

    public void makeSomeWork(){
        Inter inter = createIter();
        inter.get();
        inter.set();
    }

    public abstract Inter createIter();
}
