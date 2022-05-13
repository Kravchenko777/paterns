package behavioral.builder;

public class ExampleClassBuilder {
    private String attrString = "str";
    private Long attrLong = 1L;
    private Boolean attrBoolean = true;

    public ExampleClassBuilder setAttrString(String attrString) {
        this.attrString = attrString;
        return this;
    }

    public ExampleClassBuilder setAttrLong(Long attrLong) {
        this.attrLong = attrLong;
        return this;
    }

    public ExampleClassBuilder setAttrBoolean(Boolean attrBoolean) {
        this.attrBoolean = attrBoolean;
        return this;
    }

    public ExampleClass build() {
        return new ExampleClass(attrString, attrLong, attrBoolean);
    }
}