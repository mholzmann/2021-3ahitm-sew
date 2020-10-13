package at.htl;

import org.junit.jupiter.api.*;

import static org.assertj.core.api.Assertions.assertThat;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class SeasonTest {

    private Season season;

    @BeforeEach
    void beforeEach() {
        season = new Season();
    }

    @Test
    @Order(10)
    void addMatch_HomeWin_TeamsExist() {
        season.addMatch(new Match("A", "B", 2, 1));

        // passes only if you override Team.equals()
        // assertThat(season.teams).containsExactlyInAnyOrder(new Team("A"), new Team("B"));

        // uses with reflection
        assertThat(season.teams).extracting("name").containsExactlyInAnyOrder("A", "B");
    }

    @Test
    @Order(20)
    void addMatch_HomeWin_WinsOfHomeTeamOk() {
        season.addMatch(new Match("A", "B", 2, 1));
        Team homeTeam = getTeam("A");
        assertThat(homeTeam.getWins()).isEqualTo(1);
    }

    @Test
    @Order(30)
    void addMatch_HomeWin_DefeatsOfGuestTeamOk() {
        season.addMatch(new Match("A", "B", 2, 1));
        Team guestTeam = getTeam("B");
        assertThat(guestTeam.getDefeats()).isEqualTo(1);
    }

    @Test
    @Order(40)
    void addMatch_SeveralMatches_PointsOfTeamOk() {
        season.addMatch(new Match("A", "B", 3, 1));
        season.addMatch(new Match("A", "C", 2, 1));
        season.addMatch(new Match("B", "C", 3, 3));
        season.addMatch(new Match("B", "A", 2, 0));
        season.addMatch(new Match("C", "A", 3, 3));
        season.addMatch(new Match("C", "B", 1, 3));
        Team teamB = getTeam("B");
        assertThat(teamB.getWins()).isEqualTo(2);
    }

    @Test
    @Order(50)
    void getTeamsSortedByRank_AddedSeveralMatches_TeamOrderOk() {
        season.addMatch(new Match("A", "B", 3, 1));
        season.addMatch(new Match("A", "C", 2, 1));
        season.addMatch(new Match("B", "C", 3, 3));
        season.addMatch(new Match("B", "A", 2, 0));
        season.addMatch(new Match("C", "A", 3, 3));
        season.addMatch(new Match("C", "B", 1, 3));
        Team teamA = getTeam("A"); // 7 points (8:7 goals)
        Team teamB = getTeam("B"); // 7 points (9:7 goals)
        Team teamC = getTeam("C"); // 2 points
        assertThat(season.getTeamsSortedByRank()).containsExactly(teamB, teamA, teamC);
    }

    private Team getTeam(String teamName) {
        for (Team team : season.teams) {
            if (team.getName().equals(teamName)) {
                return team;
            }
        }
        return null;
    }
}