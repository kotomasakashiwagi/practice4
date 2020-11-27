package baseball;

public enum ProTeam {
    Giants("巨人"),
    Tigers("阪神"),
    ;

    private final String team;

    private ProTeam(String team) {
        this.team = team;
    }

    public String getTeamName() {
        return team;
    }
};




