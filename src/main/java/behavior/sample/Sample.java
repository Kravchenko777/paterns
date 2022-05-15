package behavior.sample;

public abstract class Sample {

    protected void step1(){
        System.out.println("step1");
    }

    protected abstract void step2();

    protected void step3(){
        System.out.println("step3");
    }

    public void makeWork(){
        step1();
        step2();
        step3();
    }
}
