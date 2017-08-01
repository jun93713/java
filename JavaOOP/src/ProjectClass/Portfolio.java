package ProjectClass;

import java.util.ArrayList;

public class Portfolio {
    ArrayList<Project> projects = new ArrayList<>();

    public ArrayList<Project> getProjects() {
        return projects;
    }

    public void addProject(Project project) {
        this.projects.add(project);
    }

    public double getPortfolioCost(){
        double cost = 0.0;
        for (Project project: projects){
            cost += project.getInitialCost();
        }
        return cost;
    }

    public void showPortfolio(){
        for (Project project: projects){
            System.out.println(project.elevatorPitch());
        }
        System.out.println(getPortfolioCost());
    }
}
