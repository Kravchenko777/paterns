package creational.afabric;

public class FabricInter extends Fabric{
    @Override
    public Inter getInter() {
        return new Class1();
    }

    @Override
    public Inter2 getInter2() {
        return new Class1_2();
    }
}
