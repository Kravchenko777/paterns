package creational.mfabric;

/*
    Класс имплементирующий интерфейс фабрики
 */
public class WoodProductFabric implements ProductFabric{
    @Override
    public IProduct createProduct() {
        return new Wood();
    }
}
