package at.htl;

public class Match {

    private final String homeName;
    private final String guestName;
    private final int homeGoals;
    private final int guestGoals;

    public Match(String homeName, String guestName, int homeGoals, int guestGoals) {
        this.homeName = homeName;
        this.guestName = guestName;
        this.homeGoals = homeGoals;
        this.guestGoals = guestGoals;
    }

    public int getHomePoints() {
        if (homeGoals > guestGoals) {
            return 3;
        } else if (homeGoals == guestGoals) {
            return 1;
        } else {
            return 0;
        }
    }

    public int getGuestPoints() {
        if (homeGoals < guestGoals) {
            return 3;
        } else if (homeGoals == guestGoals) {
            return 1;
        } else {
            return 0;
        }
    }

    public String getHomeName() {
        return homeName;
    }

    public String getGuestName() {
        return guestName;
    }

    public int getHomeGoals() {
        return homeGoals;
    }

    public int getGuestGoals() {
        return guestGoals;
    }
}
