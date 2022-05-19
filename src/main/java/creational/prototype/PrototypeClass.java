package creational.prototype;

/*
    Класс реализующий интерфейс прототипа
 */
public class PrototypeClass implements IPrototype {

    private String fio;
    private Long age;
    private Boolean sex;

    @Override
    public Object cloneIt(Object prototypeClass) {
        PrototypeClass prototype = new PrototypeClass();
        prototype.fio = ((PrototypeClass)prototypeClass).getFio();
        prototype.age = ((PrototypeClass)prototypeClass).getAge();
        prototype.sex = ((PrototypeClass)prototypeClass).getSex();
        return prototype;
    }

    public PrototypeClass() {
    }

    public PrototypeClass(String fio, Long age, Boolean sex) {
        this.fio = fio;
        this.age = age;
        this.sex = sex;
    }

    public String getFio() {
        return fio;
    }

    public Long getAge() {
        return age;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }
}
