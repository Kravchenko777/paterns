package creational.builder;

public class PersonCardClassBuilder {
    private String fio = "";
    private Long age = 18l;
    private Boolean sex = true;

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

    public PersonCardClass build() {
        return new PersonCardClass(fio, age, sex);
    }
}