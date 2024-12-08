import java.util.*;

import javax.lang.model.util.ElementScanner6;

class Guesser{

    int guessNum;

    int guessingNumber(){
        Scanner scan = new Scanner (System.in);
        System.out.print("Guesser! please guess the number :- ");
        guessNum = scan.nextInt();
        return guessNum;
    }
}


class Player
{
    int guessNum;
    int guessingNumber()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Player! kindly guess the number :- ");
        guessNum = scan.nextInt();
        return guessNum;
    }
}


class Umpire
{
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    void collectNumFromGuesser()
    {
        Guesser g=new Guesser();
        numFromGuesser=g.guessingNumber();
    }

    void CollectNumFromPlayer()
    {
        Player p1=new Player();
        Player p2=new Player();
        Player p3=new Player();
        numFromPlayer1=p1.guessingNumber();
        numFromPlayer2=p2.guessingNumber();
        numFromPlayer3=p3.guessingNumber();
    }

    void compare()
    {
        if(numFromGuesser==numFromPlayer1)
        {
            if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3){
                System.out.println("Everyone won the game , All guess correct number");
            }else if(numFromGuesser==numFromPlayer2){
                System.out.println("player 1 and player 2 won the game, lets celebrate");
            }else if(numFromGuesser==numFromPlayer3){
                System.out.println("player 1 and player 3 won the game, lets celebrate");
            }else {
                System.out.println("Player 1 won the game ! yeahhhhhhhhh ");
            }
            
        }else if(numFromGuesser==numFromPlayer2)
        {
            if(numFromGuesser==numFromPlayer3){
                System.out.println("Player 2 and player 3 won the game:");
            }else{
                System.out.println("player 2 won the game ! oh yesssss");
            }
            
        }else if(numFromGuesser==numFromPlayer3)
        {
            System.out.println("Player 3 won the game ! ohhh yesss yehhhh");
        } else
        {
            System.out.println("saalo sab galat ho ");
        }
    }

}


public class _01Launch1 {

    public static void main(String[] args) {
        System.out.println("Game Started Players Lets Play the Fucking Game !");
        Umpire u=new Umpire();
        u.collectNumFromGuesser();
        u.CollectNumFromPlayer();
        u.compare();   
        
    }
}