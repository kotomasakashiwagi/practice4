package baseball;

import java.util.List;

public class BaseballTeam {
    private final List<Integer> score;

    public BaseballTeam(List<Integer> score) {
        this.score = score;
    }

    public int sumScore() {
        return score.stream().mapToInt(i -> i).sum();
    }

    public List<Integer> addScore(int latestScore) {
        score.add(latestScore);
        return score;
    }
}
