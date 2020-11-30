package baseball;

import java.util.List;

public class ScoreBord {
    private final List<Integer> firstScore;
    private final List<Integer> secondScore;

    public ScoreBord(List<Integer> firstScore, List<Integer> secondScore) {
        this.firstScore = firstScore;
        this.secondScore = secondScore;
    }

    public List<Integer> getFirstScore() {
        return this.firstScore;
    }

    public List<Integer> getSecondScore() {
        return this.secondScore;
    }

    public void addFirstScore(int Score) {
        this.firstScore.add(Score);
    }

    public void addSecondScore(int Score) {
        this.secondScore.add(Score);
    }

    public int sumFirstScore() {
        return this.firstScore.stream().mapToInt(score -> score).sum();
    }

    public int sumSecondScore() {
        return this.secondScore.stream().mapToInt(score -> score).sum();
    }


}
