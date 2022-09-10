public class CheckBoxQuestion extends Questions {

    public CheckBoxQuestion(String question, String answer)   {
        super(question, answer);
    }

    public boolean checkAnswer(String answer)   {
        String actualAnswer = this.getTheAnswer();

        if (answer.toLowerCase().equals(actualAnswer.toLowerCase()))    {
            return true;
        } else {
            return false;
        }
    }

}
