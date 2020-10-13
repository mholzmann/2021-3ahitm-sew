package at.htl;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Season {

    protected List<Team> teams = new LinkedList<>();

    public void addMatch(Match match) {
        Team homeTeam = findOrCreateTeam(match.getHomeName());
        homeTeam.addMatchResult(match.getHomePoints(), match.getHomeGoals(), match.getGuestGoals());

        Team guestTeam = findOrCreateTeam(match.getGuestName());
        guestTeam.addMatchResult(match.getGuestPoints(), match.getGuestGoals(), match.getHomeGoals());;
    }

    private Team findOrCreateTeam(String name) {
        for (Team team : teams) {
            if (team.getName().equals(name)) {
                return team;
            }
        }
        Team newTeam = new Team(name);
        teams.add(newTeam);
        return newTeam;
    }

    public List<Team> getTeamsSortedByRank() {
        Collections.sort(teams);
        return Collections.unmodifiableList(teams);
    }
}
