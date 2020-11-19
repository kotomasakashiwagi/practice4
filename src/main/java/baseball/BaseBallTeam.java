package baseball;

import java.util.List;

public class BaseBallTeam {
    private final List<Integer> score;

    public BaseBallTeam(List<Integer> score) {
        this.score = score;
    }

    public int calculateSum() {
        return score.stream().mapToInt(i -> i).sum();
    }

    public List<Integer> addScore(int latestScore) {
        score.add(latestScore);
        return score;
    }
}
