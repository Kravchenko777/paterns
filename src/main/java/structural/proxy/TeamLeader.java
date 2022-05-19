package structural.proxy;

import java.util.ArrayList;
import java.util.List;

// Реализация Заместителя
public class TeamLeader implements IDeveloper{

    @Override
    public Boolean write() {
        IDeveloper developer = new JavaDeveloper();
        System.out.println("Найду кого нибудь кто поработает за меня");
        developer.write();
        System.out.println("Получу ЗП");
        return true;
    }
}
