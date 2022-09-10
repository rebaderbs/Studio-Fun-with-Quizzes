public abstract class Questions {
    private String theQuestion;
    private String theAnswer;

    public Questions(String theQuestion, String theAnswer) {
        this.theQuestion = theQuestion;
        this.theAnswer = theAnswer;
    }

    public String getTheQuestion() {
        return theQuestion;
    }
    public String getTheAnswer() {
        return theAnswer;
    }

    public abstract boolean checkAnswer(String answer);
}
