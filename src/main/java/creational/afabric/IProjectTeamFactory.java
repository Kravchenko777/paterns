package creational.afabric;

public interface IProjectTeamFactory {

    IDeveloper getDeveloper();
    IManager getManager();
    ITester getTester();
}
