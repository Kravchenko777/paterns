package creational.mfabric;

public class FabricClass2 extends Fabric{
    @Override
    public Inter createIter() {
        return new Class2();
    }
}
