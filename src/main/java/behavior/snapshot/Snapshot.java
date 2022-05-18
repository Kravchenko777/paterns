package behavior.snapshot;

public class Snapshot {

    private String attrStr;
    private Boolean bool;
    private Integer inter;

    public Snapshot(String attrStr, Boolean bool, Integer inter) {
        this.attrStr = attrStr;
        this.bool = bool;
        this.inter = inter;
    }

    public void restore(Redactor redactor){
        redactor.setAttrStr(this.attrStr);
        redactor.setBool(this.bool);
        redactor.setInter(this.inter);
    }
}
