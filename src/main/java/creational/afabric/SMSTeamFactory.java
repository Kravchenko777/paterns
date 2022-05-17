package creational.afabric;

public class SMSTeamFactory implements IProjectTeamFactory{
    @Override
    public IDeveloper getDeveloper() {
        return new CPlusPlusDeveloper();
    }

    @Override
    public IManager getManager() {
        return new Manager();
    }

    @Override
    public ITester getTester() {
        return new QATester();
    }
}
