package behavior.observer;

public class ClientThird implements Subscriber {

    private Publisher newspaper;

    @Override
    public void getNews(String news) {
        System.out.println("ClientThird: "+news);
    }

    public void setNewspaper(Publisher newspaper){
        this.newspaper = newspaper;
    }

    public void read(){
        System.out.println(newspaper.getLast());
    }



}
