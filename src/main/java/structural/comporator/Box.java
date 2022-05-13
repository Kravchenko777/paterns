package structural.comporator;

import java.util.ArrayList;
import java.util.List;

public class Box implements Inter {

    List<Inter> interList = new ArrayList<>();

    @Override
    public Integer getSumm() {
        Integer result = 0;
        for(Inter inter:interList){
            result += inter.getSumm();
        }

        return result;
    }

    public void doAnotherWork(){

    }

    public void setInterList(List<Inter> interList) {
        this.interList = interList;
    }
}
