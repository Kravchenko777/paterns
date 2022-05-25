package behavior.visitor;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/*
    Паттерн Посетитель используется для расширения
    возможностей комбинации объектов в том случае,
    если инкапсуляция несущественна.
 */
public class VisitorTest {

    static List<Node> nodes = new ArrayList<>();

    @BeforeAll
    static void init(){
        nodes.add(new ClassFirst());
        nodes.add(new ClassSecond());
        nodes.add(new ClassThird());
    }

    @Test
    void testVisitor(){

        Visitor visitor = new Visitor();
        visitor.makeWork(nodes);

    }

    @Test
    void testVisitorWithDispatcher(){
        Visitor visitor = new Visitor();
        visitor.makeWorkWithAccept(nodes);

    }
}
