package creational.mfabric;

/*
    Класс имплементирующий интерфейс фабрики
 */
public class MetalProductFabric implements ProductFabric{

    /*
        Фабричный метод
     */
    @Override
    public IProduct createProduct() {
        return new Metal();
    }
}
