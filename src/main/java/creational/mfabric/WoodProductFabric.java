package creational.mfabric;

public class WoodProductFabric implements ProductFabric{
    @Override
    public IProduct createProduct() {
        return new Wood();
    }
}
