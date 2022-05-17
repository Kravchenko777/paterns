package behavior.iterator;

import java.util.ArrayList;

public class NorthCompany {

    ArrayList<Developer> developers;

    public NorthCompany(){
        developers = new ArrayList<>();
        developers.add(new Developer("Max", 100));
        developers.add(new Developer("Peter", 200));
        developers.add(new Developer("Steve", 300));
    }

    public Iterator<Developer> createIterator(){
        return new NorthCompanyIterator(developers);
    }



}
