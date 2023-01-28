import dataDto.*;

import java.util.List;

public class App {
    public static void main(String[] args) {

        List<MaxProjectClient> maxProjectClients = new DatabaseQueryService().findMaxProjectsClient();
        List<MaxSalaryWorker> maxSalaryWorkers = new DatabaseQueryService().findMaxSalaryWorker();
        List<LongestProject> longestProjects = new DatabaseQueryService().findLongestProject();
        List<ProjectPrices> projectPrices = new DatabaseQueryService().findProjectPrices();
        List<YoungestEldestWorkers> youngestEldestWorkers = new DatabaseQueryService().findYoungestOrEldestWorkers();

        System.out.println("maxProjectClients = " + maxProjectClients);
        System.out.println("maxSalaryWorkers = " + maxSalaryWorkers);
        System.out.println("longestProjects = " + longestProjects);
        System.out.println("projectPrices = " + projectPrices);
        System.out.println("youngestEldestWorkers = " + youngestEldestWorkers);
    }
}
