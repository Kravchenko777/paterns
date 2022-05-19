package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

// Паттерн простая фабрика
public class FlyweightFactory {

    // Кэширование объектов
    private static final Map<String, Message> messages = new HashMap<>();

    public Message getMessage(String type){
        Message message = messages.get("type");

        if(message == null) {
            switch (type){
                case "sms":
                    message = new Message(1,172,type);
                    break;
                case "email":
                    message = new Message(100,1000,type);
                    break;
                case "telegram":
                    message = new Message(1,1000000,type);
                    break;
            }
            messages.put(type,message);
        }
        return message;
    }

    }
