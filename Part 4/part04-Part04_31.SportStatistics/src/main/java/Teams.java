/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SGurjar
 */
public class Teams {

    private String homeTeamName;
    private String visitingTeamName;
    private int homeTeamPoints;
    private int visitingTeamPoints;
    private int gamesPlayed;
    private int gamesWon;
    private int gamesLoss;

    public Teams(String homeTeam, String visitingTeam, int homeTeamPoints, int visitingTeamPoints) {
        this.homeTeamName = homeTeam;
        this.visitingTeamName = visitingTeam;
        this.homeTeamPoints = homeTeamPoints;
        this.visitingTeamPoints = visitingTeamPoints;
        this.gamesPlayed = 0;
        this.gamesWon = 0;
        this.gamesLoss = 0;
    }

    public String getHomeTeam() {
        return this.homeTeamName;
    }

    public String getVisitingTeam() {
        return this.visitingTeamName;
    }

    public int getHomeTeamScore() {
        return this.homeTeamPoints;
    }

    public int getVisitingTeamScore() {
        return this.visitingTeamPoints;
    }

    public int playGame() {
        return this.gamesPlayed++;
    }

    public int setGamesWins() {
        return this.gamesWon++;
    }

    public int getGameWon() {
        return this.gamesWon;
    }

    public int setGamesLosses() {
        return this.gamesLoss++;
    }

    public int getGameLoss() {
        return this.gamesLoss;
    }

    public String toString() {
        return ("Team Name: " + this.homeTeamName + "\n"
                + "No. of Games Played: " + this.gamesWon + "\n"
                + "No. of Games Won: " + this.gamesWon + "\n"
                + "No. of Games Lost: " + this.gamesLoss);
    }
}
