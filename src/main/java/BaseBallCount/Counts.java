package BaseBallCount;

public enum Counts {
    Strike("ストライク"),
    Ball("ボール"),
    Foul("ファール");
    private final String name;

    Counts(String s) {
        this.name = s;
    }

    public String getName() {
        return this.name;
    }
}
