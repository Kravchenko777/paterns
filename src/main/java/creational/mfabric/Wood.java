package creational.mfabric;

/*
    Объект имплементирующий интерфейс
 */
public class Wood implements IProduct{
    @Override
    public Integer getCost() {
        return 200;
    }
}
