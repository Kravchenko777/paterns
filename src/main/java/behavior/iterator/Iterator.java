package behavior.iterator;

//Общий интерфейс итераторов
public interface Iterator<T> {

    public T getNext();

    public boolean hasNext();
}
