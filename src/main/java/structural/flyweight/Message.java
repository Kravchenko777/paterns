package structural.flyweight;

import java.util.Date;

public class Message {

    private Integer min;
    private Integer max;
    private String type;

    //private String text;
    //private Date date;


    public Message(Integer min, Integer max, String type) {
        this.min = min;
        this.max = max;
        this.type = type;
    }

    public void sendText(String text, Date date){
        System.out.println(type+ " " + text + " " + date);
    }
}
