
import java.util.*;

public class QuizApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Question> questions = new ArrayList<>();

        // Adding questions
        questions.add(new Question(
                "What is the capital of India?",
                new String[]{"Mumbai", "Delhi", "Kolkata", "Chennai"},
                2));

        questions.add(new Question(
                "Which language is used for Android development?",
                new String[]{"Python", "Kotlin", "JavaScript", "Swift"},
                2));

        questions.add(new Question(
                "2 + 2 = ?",
                new String[]{"3", "4", "5", "6"},
                2));

        int score = 0;

        System.out.println("\n======= Welcome to Online Quiz App =======\n");

        int qNo = 1;

        for (Question q : questions) {
            System.out.println("Q" + qNo + ": " + q.getQuestionText());

            String[] options = q.getOptions();
            for (int i = 0; i < options.length; i++) {
                System.out.println((i + 1) + ". " + options[i]);
            }

            System.out.print("Your answer: ");
            int answer = sc.nextInt();

            if (answer == q.getCorrectOption()) {
                score++;
                System.out.println("✔ Correct!\n");
            } else {
                System.out.println("✘ Wrong! Correct answer: " + q.getCorrectOption() + "\n");
            }

            qNo++;
        }

        System.out.println("====================================");
        System.out.println("Quiz Completed!");
        System.out.println("Your Score: " + score + " / " + questions.size());
        System.out.println("====================================");

        sc.close();
    }
}
