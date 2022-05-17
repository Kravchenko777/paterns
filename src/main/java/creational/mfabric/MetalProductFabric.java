package creational.mfabric;

public class MetalProductFabric implements ProductFabric{
    @Override
    public IProduct createProduct() {
        return new Metal();
    }
}
