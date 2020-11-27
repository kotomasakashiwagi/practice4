package BaseBallCount;

public enum Counts {
    Strike("ストライク"),
    Ball("ボール"),
    Foul("ファール");
    private int count;
    private final String name;

    Counts(String s) {
        this.name = s;
    }

    public String getName() {
        return this.name;
    }

    public int getCount() {
        return this.count;
    }
}
