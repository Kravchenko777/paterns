package creational.singleton;

/*
    Решение задачи с использование Enum
 */
public enum ConnectionToRESTAPIEnum {

    url("https://url.net"),
    apiToken("2jkdf8934jdfu83hnf");

    public String value;

    ConnectionToRESTAPIEnum(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
