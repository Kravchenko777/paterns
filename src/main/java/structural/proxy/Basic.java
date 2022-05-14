package structural.proxy;

import structural.light.BasicType;

public class Basic implements Inter{


    @Override
    public void set() {
        System.out.println("set");
    }

    @Override
    public void get() {
        System.out.println("get");
    }
}
