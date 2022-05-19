package creational.afabric;

/*
    Интерфейс фабрики - семейства
 */
public interface IProjectTeamFactory {

    IDeveloper getDeveloper();
    IManager getManager();
    ITester getTester();
}
