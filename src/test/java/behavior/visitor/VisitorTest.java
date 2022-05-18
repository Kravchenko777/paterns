package behavior.visitor;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class VisitorTest {

    private Boolean is = true;
    static List<Node> nodes = new ArrayList<>();
    @BeforeAll
    static void init(){
        nodes.add(new Class1());
        nodes.add(new Class2());
        nodes.add(new Class3());
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
