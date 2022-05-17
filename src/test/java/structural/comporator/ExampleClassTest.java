package structural.comporator;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class ExampleClassTest {

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
