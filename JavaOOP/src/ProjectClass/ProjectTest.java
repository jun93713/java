package ProjectClass;

public class ProjectTest {
    public static void main(String[] args){
        Portfolio portfolio = new Portfolio();
        Project proj1 = new Project("Project 1", "Description 1");
        Project proj2 = new Project("Project 2", "Description 2");
        Project proj3 = new Project("Project 3", "Description 3");

        proj1.setInitialCost(10.0);
        proj2.setInitialCost(15.0);
        proj3.setInitialCost(35.0);


        System.out.println(proj1.elevatorPitch());
        System.out.println(proj2.elevatorPitch());
        System.out.println(proj3.elevatorPitch());


        portfolio.addProject(proj1);
        portfolio.addProject(proj2);
        portfolio.addProject(proj3);

        System.out.println(portfolio.getPortfolioCost());
        System.out.println("------------------------------");

        portfolio.showPortfolio();
    }

}




