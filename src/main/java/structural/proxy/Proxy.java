package structural.proxy;

public class Proxy implements Inter{

    private Basic basic;

    public Proxy(){
        basic = new Basic();
    }

    @Override
    public void set() {
        basic.set();
        System.out.println("done");
    }

    @Override
    public void get() {
        basic.get();
        System.out.println("done");
    }
}
