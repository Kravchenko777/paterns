package behavior.iterator;

public class SouthCompany {

    private Developer[] developers;

    public SouthCompany(){
        developers = new Developer[]{
                new Developer("Elena", 150),
                new Developer("Faust", 400),
                new Developer("Fedor", 250),
        };
    }

    public Iterator<Developer> createIterator(){
        return new SouthCompanyIterator(developers);
    }
}
