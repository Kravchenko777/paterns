package creational.mfabric;

public class FabricClass1 extends Fabric{
    @Override
    public Inter createIter() {
        return new Class1();
    }
}
