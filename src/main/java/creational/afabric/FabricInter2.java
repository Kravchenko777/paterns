package creational.afabric;

public class FabricInter2 extends Fabric{
    @Override
    public Inter getInter() {
        return new Class2();
    }

    @Override
    public Inter2 getInter2() {
        return new Class2_2();
    }
}
