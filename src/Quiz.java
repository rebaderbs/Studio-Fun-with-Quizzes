import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    private ArrayList<Questions> questions = new ArrayList<Questions>();
    private int correctAnswers = 0;
    private Scanner scanner = new Scanner(System.in);

    public Quiz() {
    }

    public ArrayList<Questions> getQuestions() {
        return this.questions;
    }
//    Add questions
    public void addQuestion(Questions question)  {
        this.questions.add(question);
    }

//    Run or carry out the quiz
    public void runQuiz()   {
        //need to loop through each question
        for (Questions question : questions) {
            System.out.println(question.getTheQuestion());
            String userAnswer = this.getUserAnswer();
            boolean userAnswerCorrect = question.checkAnswer(userAnswer);
            //add to count of correctAnswer if true
            if (userAnswerCorrect)  {
                this.correctAnswers++;
            }
        }
        //    Grade the quiz
        double percentCorrect = ((double) this.correctAnswers / (double) this.questions.size()) * 100;
        System.out.println("User's Grade: " + percentCorrect + "%");
    }


    private String getUserAnswer()  {
        String userAnswer = scanner.nextLine();
        return userAnswer;
    }
}
