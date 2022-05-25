package behavior.snapshot;

//Класс снимка
public class Snapshot {

    //Поля которые должны быть сохранены
    private String attrStr;
    private Boolean bool;
    private Integer inter;

    //Создание Snapshot
    public Snapshot(String attrStr, Boolean bool, Integer inter) {
        this.attrStr = attrStr;
        this.bool = bool;
        this.inter = inter;
    }

    //Восстановление Snapshot
    public void restore(Redactor redactor){
        redactor.setAttrStr(this.attrStr);
        redactor.setBool(this.bool);
        redactor.setInter(this.inter);
    }
}
