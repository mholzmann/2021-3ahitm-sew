package at.htl;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.assertj.core.api.Assertions.assertThat;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class TeamTest {

    @Test
    @Order(10)
    void addMatchResult_Win_PointsOk() {
        Team team = new Team("A-Team");
        team.addMatchResult(3, 2, 1);
        assertThat(team.getPoints()).isEqualTo(3);
    }

    @Test
    @Order(20)
    void addMatchResult_Win_GoalsShotOk() {
        Team team = new Team("A-Team");
        team.addMatchResult(3, 2, 1);
        assertThat(team.getGoalsShot()).isEqualTo(2);
    }

    @Test
    @Order(30)
    void addMatchResult_Win_GoalsReceivedOk() {
        Team team = new Team("A-Team");
        team.addMatchResult(3, 2, 1);
        assertThat(team.getGoalsReceived()).isEqualTo(1);
    }

    @Test
    @Order(40)
    void addMatchResult_Win_WinsOk() {
        Team team = new Team("A-Team");
        team.addMatchResult(3, 2, 1);
        assertThat(team.getWins()).isEqualTo(1);
    }

    @Test
    @Order(50)
    void addMatchResult_SeveralResults_WinsOk() {
        Team team = new Team("A-Team");
        team.addMatchResult(3, 2, 1);
        team.addMatchResult(0, 0, 1);
        team.addMatchResult(3, 3, 0);
        team.addMatchResult(1, 0, 0);
        team.addMatchResult(0, 1, 4);
        team.addMatchResult(3, 5, 2);
        assertThat(team.getWins()).isEqualTo(3);
    }

    @Test
    @Order(60)
    void addMatchResult_SeveralResults_DrawsOk() {
        Team team = new Team("A-Team");
        team.addMatchResult(3, 2, 1);
        team.addMatchResult(0, 0, 1);
        team.addMatchResult(3, 3, 0);
        team.addMatchResult(1, 0, 0);
        team.addMatchResult(0, 1, 4);
        team.addMatchResult(3, 5, 2);
        assertThat(team.getDraws()).isEqualTo(1);
    }

    @Test
    @Order(70)
    void addMatchResult_SeveralResults_DefeatsOk() {
        Team team = new Team("A-Team");
        team.addMatchResult(3, 2, 1);
        team.addMatchResult(0, 0, 1);
        team.addMatchResult(3, 3, 0);
        team.addMatchResult(1, 0, 0);
        team.addMatchResult(0, 1, 4);
        team.addMatchResult(3, 5, 2);
        assertThat(team.getDefeats()).isEqualTo(2);
    }

    @Test
    @Order(80)
    void compareTo_OtherWithMorePoints_ReturnsNumberBiggerThanZero() {
        Team team = new Team("A-Team");
        team.addMatchResult(1, 2, 2);
        team.addMatchResult(3, 1, 0);

        Team other = new Team("B-Team");
        other.addMatchResult(3, 4, 0);
        other.addMatchResult(3, 2, 1);

        assertThat(team.compareTo(other)).isGreaterThan(0);
    }

    @Test
    @Order(90)
    void compareTo_OtherWithEqualPointsButSmallerGoalDifference_ReturnsNumberLowerThanZero() {
        Team team = new Team("A-Team");
        team.addMatchResult(1, 2, 2);
        team.addMatchResult(3, 4, 0);

        Team other = new Team("B-Team");
        other.addMatchResult(3, 2, 0);
        other.addMatchResult(1, 1, 1);

        assertThat(team.compareTo(other)).isLessThan(0);
    }

    @Test
    @Order(100)
    void compareTo_OtherWithSameResults_ReturnsZero() {
        Team team = new Team("A-Team");
        team.addMatchResult(1, 2, 2);
        team.addMatchResult(3, 4, 0);

        Team other = new Team("B-Team");
        other.addMatchResult(3, 4, 0);
        other.addMatchResult(1, 2, 2);

        assertThat(team.compareTo(other)).isEqualTo(0);
    }
}