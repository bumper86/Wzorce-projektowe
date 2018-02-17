package factory.method;

public class Application {

    public static void main(String[] args) {
        DevelopmentManager manager = new DevelopmentManager();
        manager.makeInterviewer().askQuestions();

        MarketingManager marketingManager = new MarketingManager();
        marketingManager.makeInterviewer().askQuestions();
    }
}
