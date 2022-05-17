package behavior.iterator;

public class SouthCompanyIterator implements Iterator<Developer>{

    private Developer[] developers;
    int position = 0;

    public SouthCompanyIterator(Developer[] developers) {
        this.developers = developers;
    }

    @Override
    public Developer getNext() {
        Developer developer = developers[position];
        position ++;
        return developer;
    }

    @Override
    public boolean hasNext() {
        if(position >= developers.length || developers[position] == null) return false;
        else return true;
    }
}
