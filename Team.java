public class Team {
    public String teamName;
    Programmer p1 = new Programmer();
    Programmer p2 = new Programmer();


    public void printTeamDetails(){
        System.out.println("Name team is " + teamName);

        p1.printProgrammerDetails (p1.name, p1.programmingLanguage, p1.yearsOfExperience);
        p2.printProgrammerDetails (p2.name, p1.programmingLanguage, p2.yearsOfExperience);
    }
}
