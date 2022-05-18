package behavior.snapshot;

public class Redactor {

    private String attrStr;
    private Boolean bool;
    private Integer inter;
    private Snapshot snapshot;

    public void makeSnapshot(){
        snapshot = new Snapshot(attrStr,bool,inter);
    }

    public void restore(){
        snapshot.restore(this);
    }

    public String getAttrStr() {
        return attrStr;
    }

    public void setAttrStr(String attrStr) {
        this.attrStr = attrStr;
    }

    public void setBool(Boolean bool) {
        this.bool = bool;
    }

    public void setInter(Integer inter) {
        this.inter = inter;
    }
}
