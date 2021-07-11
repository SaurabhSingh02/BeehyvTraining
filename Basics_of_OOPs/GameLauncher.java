/*
The Guessing Game:
The guessing game involves a 'game' object and three 'player' objects. The game generates a random number between
0 and 9, and the three player objects try to guess it.
Write a program for the game.
Classes:
GuessGame.class
Player.class
GameLauncher.class
The logic:
i. The GameLauncher class is where the application starts; it has the main method.
ii. In the main() method a GuessGame object is created, and its startGame() method is called.
iii. The GuessGame objects startGame() method is where the entire game plays out.
It creates three playerd, then thinkd of a random number(the target). It then asks each player to guess, checks the 
result, and either prints out information about the winning players or asks them to guess again.
*/

package com.company;
import java.util.Scanner;
class Player{
    String name;
    int playerID;
    public Player() {
        name = "Anonymous";
        playerID= 0000;
    }
    public Player(String s, int n) {
        name = s;
        playerID = n;
    }
}

class GuessGame{
    public static void StartGame(){
        int min = 0;
        int max = 9;
        int target = (int) (Math.random()*(max-min+1)+min);
        //System.out.println(target);
        Scanner input = new Scanner(System.in);
        System.out.println("It is a three player guessing game");
        System.out.println("Player1 please enter your name");
        String S1 = input.next();
        System.out.println(S1+ ", Enter your player ID : ");
        int ID1 = input.nextInt();
        Player player1 = new Player(S1, ID1);
        System.out.println("Player2 please enter your name");
        String S2 = input.next();
        System.out.println(S2+ ", Enter your player ID : ");
        int ID2 = input.nextInt();
        Player player2 = new Player(S2, ID2);
        System.out.println("Player3 please enter your name");
        String S3 = input.next();
        System.out.println(S3+ ", Enter your player ID : ");
        int ID3 = input.nextInt();
        Player player3 = new Player(S3, ID3);
        int flag =0;
        int g1=0,g2=0,g3=0;
        while(flag==0){
            System.out.println(player1.name+ ", enter your number : ");
            g1 = input.nextInt();

            System.out.println(player2.name+ ", enter your number : ");
            g2 = input.nextInt();

            System.out.println(player3.name+ ", enter your number : ");
            g3 = input.nextInt();

            if (g1==target) {
                System.out.println(player1.name+"("+player1.playerID+") guessed the right number and won the game");
                flag=1;
            }
            else if (g2==target) {
                System.out.println(player2.name+"("+player2.playerID+") guessed the right number and won the game");
                flag=1;
            }
            else if (g3==target) {
                System.out.println(player3.name+"("+player3.playerID+") guessed the right number and won the game");
                flag=1;
            }
            else
            {
                System.out.println("No one has guessed the number right try again ");
            }
        }
    }
}
public class GameLauncher {
    public static void main(String[] args) {
        GuessGame.StartGame();
    }
}




