package behavior.snapshot;

public class Snapshot {

    private Redactor redactor;
    private String attrStr;
    private Boolean bool;
    private Integer inter;

    public Snapshot(Redactor redactor, String attrStr, Boolean bool, Integer inter) {
        this.redactor = redactor;
        this.attrStr = attrStr;
        this.bool = bool;
        this.inter = inter;
    }

    public void restore(){
        this.redactor.setAttrStr(this.attrStr);
        this.redactor.setBool(this.bool);
        this.redactor.setInter(this.inter);
    }
}
