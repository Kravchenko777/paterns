package creational.builder;

/*
    Класс объекта, экземпляр которого будет создаваться через паттерн Builder
 */
public class PersonCardClass {

    private String fio;
    private Long age;
    private Boolean sex;

    public PersonCardClass(String fio, Long age, Boolean sex) {
        this.fio = fio;
        this.age = age;
        this.sex = sex;
    }

}
