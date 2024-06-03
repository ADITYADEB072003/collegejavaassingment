public class CricketPlayer {
    String name;
    int no_of_innings;
    int no_times_notout;
    int total_runs;
    double bat_avg;

    public CricketPlayer(String name, int no_of_innings, int no_times_notout, int total_runs) {
        this.name = name;
        this.no_of_innings = no_of_innings;
        this.no_times_notout = no_times_notout;
        this.total_runs = total_runs;
        this.bat_avg = avg(total_runs, no_of_innings - no_times_notout);
    }

    static double avg(int totalRuns, int inningsNotOut) {
        if (inningsNotOut == 0) return -1;
        return (double) totalRuns / inningsNotOut;
    }

    static void sortPlayer(CricketPlayer[] players) {
        for (int i = 0; i < players.length - 1; i++) {
            for (int j = 0; j < players.length - i - 1; j++) {
                if (players[j].bat_avg > players[j + 1].bat_avg) {
                    CricketPlayer temp = players[j];
                    players[j] = players[j + 1];
                    players[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        // Array of  objects created
        CricketPlayer[] players = {
                new CricketPlayer("Player1", 20, 5, 500),
                new CricketPlayer("Player2", 15, 3, 400),
                new CricketPlayer("Player3", 25, 8, 600),
                new CricketPlayer("Player1", 20, 5, 500),
                new CricketPlayer("Player2", 15, 3, 400),
                new CricketPlayer("Player3", 25, 8, 600)
        };

        sortPlayer(players);

        for (CricketPlayer player : players) {
            System.out.println("Name: " + player.name + ", Batting Average: " + player.bat_avg);
        }
    }
}
