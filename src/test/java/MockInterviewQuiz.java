
import QuestionsDB.MockQuestions;

import java.util.ArrayList;
import java.util.Scanner;

public class MockInterviewQuiz implements MyQuiz {
        private final ArrayList<String> wrongQuestions = new ArrayList<>();
        private final ArrayList<Integer> arr = new ArrayList<>();
        private int totalAsked;
        private int correctAnswered;
        private int random;
        MockInterviewQuiz(){

        }



        @Override
        public int getRandomNumber() {

            int max = MockQuestions.mockQuestions.size() - 1;
            int rand = (int) (Math.random() * (max));
            if(arr.contains(rand)){
                do{
                    rand = (int) (Math.random() * max);
                }while(arr.contains(rand) && arr.size() != MockQuestions.mockQuestions.size());

            }
            random = rand;
            arr.add(rand);
            return rand;
        }

        @Override
        public void generateQuestion() {
            System.out.println(MockQuestions.mockQuestions.get(getRandomNumber()));
            ++totalAsked;
        }

        @Override
        public void answeredCorrect() {
            ++correctAnswered;
        }

        @Override
        public long calculateScore() {
            Double correctAnswers = Double.valueOf(correctAnswered);
            long percent = Math.round((correctAnswers / totalAsked) * 100);
            return percent;
        }

        @Override
        public void start() {
            System.out.println(ConsoleColors.ANSI_BLUE + "Welcome! Mock Interview is starting now.." + ConsoleColors.ANSI_RESET);
            int count = 0;
            Scanner scan = new Scanner(System.in);

            do{
                ++count;
                generateQuestion();
                System.out.println("Ready for the answer? Press enter.");
                scan.nextLine();
                generateAnswer();
                System.out.println(ConsoleColors.ANSI_GREEN + "Did you answer correctly? Y or N" + ConsoleColors.ANSI_RESET);
                String answer = scan.nextLine();
                if(answer.equalsIgnoreCase("y")){
                    answeredCorrect();
                }else{
                    System.out.println(ConsoleColors.ANSI_RED + "Try better next time!" + ConsoleColors.ANSI_RESET);
                    wrongQuestions.add(MockQuestions.mockQuestions.get(random));

                }
                System.out.println("Would you like another question? Press enter for yes, or N for no.");
                String anotherQuestion = scan.nextLine();
                if(anotherQuestion.equalsIgnoreCase("n")){
                    break;
                }
            }while(count < MockQuestions.mockQuestions.size());
            long score = calculateScore();
            generateResult(score);
            System.out.println("Would you like to see the questions you missed? Y or N");
            String anotherAnswer = scan.nextLine();
            if(anotherAnswer.equalsIgnoreCase("y")){
                for(int i = 0; i < wrongQuestions.size(); i++){
                    System.out.println(wrongQuestions.get(i));
                }
            }
        }

        @Override
        public void generateResult(long score) {
            if(score >= 80){
                System.out.println("Great job! You scored "
                        + ConsoleColors.ANSI_GREEN + correctAnswered  +
                        " out of " + totalAsked + ConsoleColors.ANSI_RESET + " and scored "
                        + ConsoleColors.ANSI_GREEN + calculateScore() + "%" + ConsoleColors.ANSI_RESET);
            }else if(score >= 50 && score < 80){
                System.out.println("Good job but it can be improved! You scored "
                        + ConsoleColors.ANSI_BLUE + correctAnswered  +
                        " out of " + totalAsked + ConsoleColors.ANSI_RESET + " and scored "
                        + ConsoleColors.ANSI_BLUE + calculateScore() + "%" + ConsoleColors.ANSI_RESET);
            }else{
                System.out.println("Try to practice more and try again! You scored "
                        + ConsoleColors.ANSI_RED + correctAnswered  +
                        " out of " + totalAsked + ConsoleColors.ANSI_RESET + " and scored "
                        + ConsoleColors.ANSI_RED + calculateScore() + "%" + ConsoleColors.ANSI_RESET);
            }
        }

        @Override
        public void generateAnswer() {
            System.out.println(MockQuestions.mockAnswers.get(random));
        }
    }


