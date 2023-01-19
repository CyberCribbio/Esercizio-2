public class CompetitionJava {
    public static void main(String[] args) {
        //Inserire regole
        CompetitionRules rules = CompetitionRules.getInstance();
        rules.printRules();
        Team teamA = new Team();
        Team teamB = new Team();
        teamA.teamName = "Vamos";
        teamB.teamName = "Andale";

        //info team A
        teamA.p1.name = "Gigi";
        teamA.p2.name = "Lucia";
        teamA.p1.programmingLanguage = "Java script";
        teamA.p2.programmingLanguage = "Java";
        teamA.p1.yearsOfExperience = 8;
        teamA.p2.yearsOfExperience = 10;

        //info team B
        teamB.p1.name = "Alice";
        teamB.p2.name = "Diego";
        teamB.p1.programmingLanguage = "Python";
        teamB.p2.programmingLanguage = "CSS";
        teamB.p1.yearsOfExperience = 6;
        teamB.p2.yearsOfExperience = 2;
        teamA.printTeamDetails();
        teamB.printTeamDetails();


    }
}
