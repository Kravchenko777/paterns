package creational.builder;

/*
    Класс Builder инкапсулирущий создание объекта
 */
public class PersonCardClassBuilder {

    //Атрибуты класса, который должен быть создан
    private String fio = "";
    private Long age = 18l;
    private Boolean sex = true;

    // Set методы в Fluent стиле
    public PersonCardClassBuilder setFio(String fio) {
        this.fio = fio;
        return this;
    }

    public PersonCardClassBuilder setAge(Long age) {
        this.age = age;
        return this;
    }

    public PersonCardClassBuilder setSex(Boolean sex) {
        this.sex = sex;
        return this;
    }

    // Метод создания объекта
    public PersonCardClass build() {
        return new PersonCardClass(fio, age, sex);
    }
}