package at.htl;

import org.junit.jupiter.api.*;

import static org.assertj.core.api.Assertions.assertThat;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class MatchTest {

    @Test
    @Order(10)
    void getHomePoints_HomeWin_ReturnsThree() {
        Match match = new Match("A-Team", "B-Team", 1, 0);
        assertThat(match.getHomePoints()).isEqualTo(3);
    }

    @Test
    @Order(20)
    void getHomePoints_Draw_ReturnsOne() {
        Match match = new Match("A-Team", "B-Team", 2, 2);
        assertThat(match.getHomePoints()).isEqualTo(1);
    }

    @Test
    @Order(30)
    void getHomePoints_GuestWin_ReturnsZero() {
        Match match = new Match("A-Team", "B-Team", 1, 4);
        assertThat(match.getHomePoints()).isEqualTo(0);
    }

    @Test
    @Order(40)
    void getGuestPoints_HomeWin_ReturnsZero() {
        Match match = new Match("A-Team", "B-Team", 1, 0);
        assertThat(match.getGuestPoints()).isEqualTo(0);
    }

    @Test
    @Order(50)
    void getGuestPoints_Draw_ReturnsOne() {
        Match match = new Match("A-Team", "B-Team", 2, 2);
        assertThat(match.getGuestPoints()).isEqualTo(1);
    }

    @Test
    @Order(60)
    void getGuestPoints_GuestWin_ReturnsThree() {
        Match match = new Match("A-Team", "B-Team", 1, 4);
        assertThat(match.getGuestPoints()).isEqualTo(3);
    }
}