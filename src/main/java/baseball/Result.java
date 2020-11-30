package baseball;

public class Result {
    public enum Determinable {
        Determinable,
        EvenOrOther,
    }

    private final String result;
    private final Determinable determinable;

    public Result(String result, Determinable determinable) {
        this.result = result;
        this.determinable = determinable;
    }

    public String getResult() {
        return this.result;
    }

    public Determinable getDeterminable() {
        return this.determinable;
    }
}
