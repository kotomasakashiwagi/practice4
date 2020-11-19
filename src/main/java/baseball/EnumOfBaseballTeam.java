package baseball;

public enum EnumOfBaseballTeam {
    Giants("巨人"),
    Tigers("阪神"),
    ;

    private final String team;

    private EnumOfBaseballTeam(String team) {
        this.team = team;
    }

    public String getTeamName() {
        return team;
    }
};




