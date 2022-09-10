public class QuizRunner {
    public static void main(String[] args) {

        Quiz hobbitQuiz = new Quiz();

        MultipleChoiceQuestion hobbitMultipleChoiceQuestion = new MultipleChoiceQuestion("Who didn't know what a potato is?" + "\nA: Gandalf\nB: Borimir\nC: Gollum\nD: Sauron", "C");
        hobbitQuiz.addQuestion(hobbitMultipleChoiceQuestion);

        CheckBoxQuestion hobbitCheckBoxQuestion = new CheckBoxQuestion("Which of the following do Hobbits consider a time to eat? (Select all that apply)" + "\nA: Second breakfast\nB: Brunch\nC: Elevenses\nD: Supper", "A, C, D");
        hobbitQuiz.addQuestion(hobbitCheckBoxQuestion);

        TrueFalseQuestion hobbitTrueFalseQuestion = new TrueFalseQuestion("True or False: Hobbits eat too much.", "False");
        hobbitQuiz.addQuestion(hobbitTrueFalseQuestion);

        hobbitQuiz.runQuiz();
    }
}