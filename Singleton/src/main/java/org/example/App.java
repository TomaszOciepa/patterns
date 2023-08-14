package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        GameEngine game = GameEngine.getInstance();
        game.play();

        int score = game.getScore();
        System.out.println("Punkty: "+score);

        GameEngine anotherGame = GameEngine.getInstance();

        if (game == anotherGame){
            System.out.println("Singleton");

            if (score == anotherGame.getScore()){
                System.out.println("I punkty się zgadzają");
            }
        }

    }
}
