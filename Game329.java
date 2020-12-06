import java.util.Scanner;




public class Game329{




  public static void start(){

      System.out.println("Welcome to our CPSC329 Unessay! Please enter your name to get going!");
      Scanner keyboard = new Scanner(System.in);
      String playerName = keyboard.nextLine();
      System.out.println("Hey "+playerName+", Nice to meet ya!");
      System.out.println("We made this game to teach people about popular exploits from the past");
      System.out.println("There are many different intereresting exploits, so we chose our three faves");
      System.out.println();
    }

  public static void levelOne(){
    System.out.println("Level one bruh");

  }

  public static void main(String[] args){

      start();
      levelOne();

  }


  }
