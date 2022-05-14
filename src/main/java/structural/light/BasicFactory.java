package structural.light;

import java.util.ArrayList;
import java.util.List;

public class BasicFactory {

    List<BasicType> basicTypes = new ArrayList<>();

    public BasicType getBasicType(){
        if(findBasicType()!=null) {
            return findBasicType();
        } else {
            BasicType basicType = new BasicType(true,true,true);
            basicTypes.add(basicType);
            return basicType;
        }

    }

    private BasicType findBasicType(){

        return null;
    }
}
