import java.util.Scanner;

class GameManager
{   
   private char player1;
   private char player2;
   private Scanner scan = new Scanner(System.in);

//-------------------------------------

   public void startGame()
   {
      GameTray gameBoard = new GameTray();
      Display display = new Display();
      boolean winnerFound = false;
      char userInput;
   
      handlePlayerColor();      
      display.showBoard(gameBoard);      
          
      System.out.print("Player 1 Enter a column number or 0 to exit >> ");
      userInput = scan.nextLine().charAt(0);      
      
      while (userInput != '0')
      {
         gameBoard.addDisc(userInput, player1);
         display.showBoard(gameBoard);
         
         winnerFound = gameBoard.checkWinner(player1);
         
         if (winnerFound)
            break;
         
         System.out.print("Player 2 Enter a column number or 0 to exit >> ");
         userInput = scan.nextLine().charAt(0);
        
         gameBoard.addDisc(userInput, player2);
         display.showBoard(gameBoard);        
         
         winnerFound = gameBoard.checkWinner(player2);
         
         if (winnerFound)
            break;
         
         
         System.out.print("Player 1 Enter a column number or 0 to exit >> ");
         userInput = scan.nextLine().charAt(0);
      
      
      }// End while   
      
      if (winnerFound)
            System.out.println("WINNER!!!");
      
   
   }// End method
   
//--------------------------------------

   private void handlePlayerColor()
   {
      char userInput;
      
      System.out.print("Player 1 Enter R for Red or Y for Yellow >> ");
      userInput = scan.nextLine().charAt(0);      
      
      while (userInput != 'R' && userInput != 'Y')
      {      
         System.out.print("Player 1 Enter R for Red or Y for Yellow >> ");
         userInput = scan.nextLine().charAt(0);
      
      }// End while
      
      if (userInput == 'R')
      {
         player1 = 'R';
         player2 = 'Y';
      }// End if
      
      else
      {
         player1 = 'Y';
         player2 = 'R';
      }// End else   
   
   }// End method
   
//-----------------------------------------

      


}// End class
