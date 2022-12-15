
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        int count = 0;
        int wins = 0;
        int losses = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String fileName = scan.nextLine();

        ArrayList<Teams> teamsRecords = readRecordsFromFile(fileName);

        System.out.println("Teams:");
        String teamName = scan.nextLine();

        for (Teams team : teamsRecords) {

            if (team.getHomeTeam().contains(teamName)) {

                count++;

                if (team.getHomeTeamScore() >= team.getVisitingTeamScore()) {
                    wins++;
                    team.setGamesWins();
                } else {
                    losses++;
                    team.setGamesLosses();
                }

                team.playGame();
            } else if (team.getVisitingTeam().contains(teamName)) {

                count++;

                if (team.getVisitingTeamScore() >= team.getHomeTeamScore()) {
                    wins++;
                    team.setGamesWins();
                } else {
                    losses++;
                    team.setGamesLosses();
                }

                team.playGame();
            }

        }
        
        System.out.println("Games: " + count);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
        
    }

    public static ArrayList<Teams> readRecordsFromFile(String fileName) {

        ArrayList<Teams> teamsList = new ArrayList<>();

        try (Scanner scanFile = new Scanner(Paths.get(fileName))) {
            while (scanFile.hasNextLine()) {
                String dataRead = scanFile.nextLine();
                if (dataRead.isEmpty()) {
                    break;
                }
                String[] readDataAry = dataRead.split(",");
                String homeTeam = readDataAry[0];
                String visitingTeam = readDataAry[1];
                int homeTeamPoints = Integer.valueOf(readDataAry[2]);
                int visitingTeamPoints = Integer.valueOf(readDataAry[3]);

                teamsList.add(new Teams(homeTeam, visitingTeam, homeTeamPoints, visitingTeamPoints));
                
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return teamsList;
    }

}
