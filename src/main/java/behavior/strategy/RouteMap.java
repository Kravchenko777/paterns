package behavior.strategy;

public class RouteMap {

    private Strategy strategy;

    public RouteMap(Strategy strategy){
        this.strategy = strategy;
    }

    public Boolean getResult(){
        return strategy.execute();
    }
}
