package factory.method;

abstract class HiringManager {
    private Interviewer makeInterviewer;

    public void takeInterview() {
        Interviewer interviewer = this.makeInterviewer;
        interviewer.askQuestions();
    }
}
