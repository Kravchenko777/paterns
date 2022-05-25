package behavior.iterator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/*
    Паттерн Итератор предоставляет механизм последовательного перебора
    элементов коллекции без раскрытия ее внутреннего представления.
 */
public class IteratorTest {

    @Test
    void testSingleton(){

        NorthCompany northCompany = new NorthCompany();
        SouthCompany southCompany = new SouthCompany();

        printAllDeveloper(northCompany.createIterator());
        printAllDeveloper(southCompany.createIterator());


    }

    private void printAllDeveloper(Iterator<Developer> iterator){
        while (iterator.hasNext()){
            System.out.println(iterator.getNext().toString());
        }
    }
}
