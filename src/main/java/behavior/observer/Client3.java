package behavior.observer;

public class Client3 implements IClient{

    private Newspaper newspaper;

    @Override
    public void getNews(String news) {
        System.out.println("Client 3: "+news);
    }

    public void setNewspaper(Newspaper newspaper){
        this.newspaper = newspaper;
    }

    public void read(){
        System.out.println(newspaper.getLast());
    }



}
