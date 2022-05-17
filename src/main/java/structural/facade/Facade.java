package structural.facade;

public class Facade {

    public Boolean makeProgram(){
       IDeveloper developer = new JavaDeveloper();
       IManager manager = new Manager();
       ITester tester = new QATester();

        manager.manage();
        developer.write();
        tester.test();
        developer.write();
        tester.test();
        developer.write();
        tester.test();
        developer.write();
        tester.test();
        manager.manage();

        return true;
    }
}
