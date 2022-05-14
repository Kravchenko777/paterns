package behavior.snapshot;

public class Redactor {

    private String attrStr;
    private Boolean bool;
    private Integer inter;

    public Snapshot makeSnapshot(){
        return new Snapshot(this,attrStr,bool,inter);
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

    public String getAttrStr() {
        return attrStr;
    }
}
