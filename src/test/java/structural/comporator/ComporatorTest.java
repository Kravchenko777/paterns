package structural.comporator;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
/*
    Паттерн Компоновщик объединяет объекты
    в древовидные структуры для представления
    иерархий «часть/целое». Компоновщик позволяет клиенту выполнять однородные операции
    с отдельными объектами и их совокупностями.
 */
public class ComporatorTest {

    @Test
    void test(){
        ArrayList<Inter> arrayList = new ArrayList<>();
        arrayList.add(new Product(10));
        arrayList.add(new Product(20));
        arrayList.add(new Product(30));

        Box box = new Box();
        box.setInterList(arrayList);

        ArrayList<Inter> arrayList2 = new ArrayList<>();
        arrayList2.add(new Product(100));
        arrayList2.add(box);

        Box box2 = new Box();
        box2.setInterList(arrayList2);

        System.out.println(box2.getSumm());
    }
}
