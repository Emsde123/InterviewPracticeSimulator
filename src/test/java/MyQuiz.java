public interface MyQuiz {



    public int getRandomNumber();

    public void generateQuestion();

    public void answeredCorrect();

    public long calculateScore();

    public void start();

    public void generateResult(long score);



    void generateAnswer();
}
