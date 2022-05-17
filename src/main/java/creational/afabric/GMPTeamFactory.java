package creational.afabric;

public class GMPTeamFactory implements IProjectTeamFactory{
    @Override
    public IDeveloper getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public IManager getManager() {
        return new Manager();
    }

    @Override
    public ITester getTester() {
        return new ManualTester();
    }
}
