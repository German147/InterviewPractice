package signInEnum;

public enum SignInInputEnum {
    USER("email"),
    PASSWORD("pass");

    private final String id;

    SignInInputEnum(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }
}
