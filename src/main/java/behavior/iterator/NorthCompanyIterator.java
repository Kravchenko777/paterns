package behavior.iterator;

import java.util.ArrayList;

public class NorthCompanyIterator implements Iterator<Developer>{

    ArrayList<Developer> developers;
    int position = 0;

    public NorthCompanyIterator(ArrayList developers){
        this.developers = developers;
    }

    @Override
    public Developer getNext() {
        Developer developer = developers.get(position);
        position ++;
        return developer;
    }

    @Override
    public boolean hasNext() {
        if(developers.size() > position) return true;
        else return false;
    }
}
