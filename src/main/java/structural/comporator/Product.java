package structural.comporator;

public class Product implements Inter {

    private Integer summ;

    public Product(Integer summ){
        this.summ = summ;
    }

    @Override
    public Integer getSumm() {
        return summ;
    }

}
