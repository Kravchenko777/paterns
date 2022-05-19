package structural.flyweight;

import java.util.Date;

public class Message {

    //внутреннее состояние
    private Integer min;
    private Integer max;
    private String type;

    //Внешнее состояние
    //private String text;
    //private Date date;



    public Message(Integer min, Integer max, String type) {
        this.min = min;
        this.max = max;
        this.type = type;
    }

    // Замещение внешнего состояния параметрами метода
    public void sendText(String text, Date date){
        System.out.println(type+ " " + text + " " + date);
    }
}
