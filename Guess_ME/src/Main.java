
import java.util.*;

public class Main{

    public static void game(int min, int max){
        Random ran = new Random();
        int randint = ran.nextInt((max - min) + 1) + min;
        System.out.println(randint);

        int lives = 5;
        while(lives > 0) {

            Scanner s = new Scanner(System.in);
            System.out.println("Enter Your Number I am not watching:");
            int user_options = s.nextInt();

            if(randint==user_options){
                System.out.println("Yay! You have Won I knew You are Psychic");
                break;
            }

            else{
                if(randint > user_options){
                    lives--;
                    System.out.println("You guess is too low well Try again :D " + "And you have still " + lives + " Left");
                }

                else{
                    lives--;
                    System.out.println("You guess is too high well Try again :D " + "And you have still " + lives + " Left");
                }
            }
        }
        if(lives == 0){
            System.out.println("Hmph ! You have no lives well you may this day is not yours but don't quit");
        }
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Welcome to Goats playground Select your difficulty \n for Easy click E \n for Medium click M \n for Hard click H");
        String game_option = s.nextLine();

        if (game_option.equals("E")) {
            System.out.println("The range of numbers you are gussing will be from 1 to 9");
            game(1,9);

        }

        if (game_option.equals("M")) {
            System.out.println("The range of numbers you are gussing will be from 10 to 50");
            game(10,50);
        }

        if(game_option.equals("H")){
            System.out.println("The range of numbers you are gussing will be from 1 to 100");
            game(1,100);
        }
  }
}