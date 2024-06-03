class cricketplayer{
    String name;
    int no_of_innings;
    int no_times_notout;
    int total_runs;
    double bat_avg;
    // constructor
    cricketplayer(String name,int no_of_innings,int no_times_notout,int total_runs){
        this.name=name;
        this.no_of_innings=no_of_innings;
        this.no_times_notout=no_times_notout;
        this.total_runs=total_runs;
        this.bat_avg=avg(total_runs,no_of_innings-no_times_notout);


}
// CALCULATING AVERAGE
static double avg(int totalRuns, int inningsNotOut) {
    if (inningsNotOut == 0) return -1;
    return (double) totalRuns / inningsNotOut;
}
//   SORTING AS PER AVERAGE
static  void sort(cricketplayer [] players){
    int n=players.length;
    for(int i=0;i<n-1;i++){
       for(int j=0;j<n-i-1;j++){
        if(players[j].bat_avg<players[j+1].bat_avg){
            cricketplayer temp=players[j];
            players[j]=players[j+1];
            players[j+1]=temp;
            }
        }
       } 
    }
    // DISPLAYs
 static void displays(cricketplayer [] players){
    for(cricketplayer p:players){
        System.out.println(p.name+" "+p.bat_avg);
        
    }
}
public static void main(String[] args) {
    cricketplayer[] players = {
        new cricketplayer("Player1", 10, 2, 500),
        new cricketplayer("Player2", 15, 5, 600),
        new cricketplayer("Player3", 20, 4, 800),
        new cricketplayer("Player4", 8, 0, 300),
        new cricketplayer("Player5", 12, 3, 400)
    };

    System.out.println("Before sorting:");
    displays(players);

    sort(players);

    System.out.println("After sorting:");
    displays(players);
}
}



