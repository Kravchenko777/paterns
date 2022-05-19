package creational.mfabric;

/*
    Объект имплементирующий интерфейс
 */
public class Metal implements IProduct{

    @Override
    public Integer getCost() {
        return 100;
    }
}
