import java.util.ArrayList;

class GameTray
{
   private final int ROWS = 6;
   private char[] column1;
   private char[] column2;
   private char[] column3;
   private char[] column4;
   private char[] column5;
   private char[] column6;
   private char[] column7;   
   
//-------------------------------------

   GameTray()
   {      
      initialize();    
   
   }// End constructor
   
//-------------------------------------

   private void initialize()
   {
      /*
         this method instantiates the columns and sets them to a deafult space value.
      */
      
      column1 = new char[ROWS];
      column2 = new char[ROWS];
      column3 = new char[ROWS];
      column4 = new char[ROWS];
      column5 = new char[ROWS];
      column6 = new char[ROWS];
      column7 = new char[ROWS];
   
      for (int i = 0; i < ROWS; i++) 
         column1[i] = ' ';
         
      for (int i = 0; i < ROWS; i++) 
         column2[i] = ' ';
         
      for (int i = 0; i < ROWS; i++) 
         column3[i] = ' ';
         
      for (int i = 0; i < ROWS; i++) 
         column4[i] = ' ';
         
      for (int i = 0; i < ROWS; i++) 
         column5[i] = ' ';
         
      for (int i = 0; i < ROWS; i++) 
         column6[i] = ' ';
         
      for (int i = 0; i < ROWS; i++) 
         column7[i] = ' ';         
         
   }// End method
   
//----------------------------------------

   public void addDisc(char column, char playerColor)
   {
      /*
         this method recieves a column value and a disc color and then passes those values to the add() function to be added.
      */
   
      char disc = playerColor;      
      
      switch(column)
      {
         
         case '1':
         {  
            add(column1 , disc);            
            break;
         }// End case
         
         case '2':
         {  
            add(column2 , disc);            
            break;
         }// End case
         
         case '3':
         {  
            add(column3 , disc);            
            break;
         }// End case
         
         case '4':
         {  
            add(column4 , disc);            
            break;
         }// End case
         
         case '5':
         {  
            add(column5 , disc);            
            break;
         }// End case
         
         case '6':
         {  
            add(column6 , disc);            
            break;
         }// End case
         
         case '7':
         {  
            add(column7 , disc);            
            break;
         }// End case         
         
         default:
         {
            System.out.println("Invalid Entry");
         
         }// End case
         
         
      }// End switch
   
   
   }// End method

//------------------------------------------------------
   
   public char getDiscColor(int column, int row)
   {
      /*
         this method recieves a column and row value and returns the disc color for that space in the game tray.   
      */
   
      char temp = '$';     
      
      switch(column)
      {
         
         case 1:
         {  
            temp = column1[row];            
            break;
         }// End case
         
         case 2:
         {  
            temp = column2[row];            
            break;
         }// End case
         
         case 3:
         {  
            temp = column3[row];            
            break;
         }// End case
         
         case 4:
         {  
            temp = column4[row];            
            break;
         }// End case
         
         case 5:
         {  
            temp = column5[row];            
            break;
         }// End case
         
         case 6:
         {  
            temp = column6[row];            
            break;
         }// End case
         
         case 7:
         {  
            temp = column7[row];            
            break;
         }// End case         
         
         default:
         {
            System.out.println("Invalid Entry");            
            break;
         }// End case
         
         
      }// End switch
   
      return temp;
   
   }// End method

//----------------------------------------------

   public boolean checkWinner(char playerColor)
   {
   
      /*
         
         This method recieves a player color and first checks for a winner in each column, followed by checking each row
         for a winner. If a winner is found no other column or row will be checked for a winner.
         
      */
         
   
      boolean winnerFound = false;
      
      
      if (!winnerFound)
         winnerFound = checkColumnsForWinner(column1, playerColor);
      
      if (!winnerFound)
         winnerFound = checkColumnsForWinner(column2, playerColor);
      
      if (!winnerFound)
         winnerFound = checkColumnsForWinner(column3, playerColor);
      
      if (!winnerFound)
         winnerFound = checkColumnsForWinner(column4, playerColor);
      
      if (!winnerFound)
         winnerFound = checkColumnsForWinner(column5, playerColor);
      
      if (!winnerFound)
         winnerFound = checkColumnsForWinner(column6, playerColor);
      
      if (!winnerFound)
         winnerFound = checkColumnsForWinner(column7, playerColor);
      
      
      if (!winnerFound)
      {
         for (int row = 0; row < ROWS; row++)
         {
            winnerFound = checkRowsForWinner(row, playerColor);
            
            if (winnerFound)
               break;
         }// End for loop
      
      }// End if
      
      
      return winnerFound;
   
   }// End method

//-----------------------------------------

   private boolean checkRowsForWinner(int row, char playerColor)
   {
      /*
         This method first checks the the middle spaces in the row for a player color match. If there is a match,
         then the 3 corresponding spaces are checked for a winner.
      
      */
   
      boolean winner = false;
      
      if (column4[row] == playerColor)
      {
         if (column1[row] == playerColor && column2[row] == playerColor && column3[row] == playerColor)
            winner = true;
      }// End if
      
      if (!winner)
      {
         if (column4[row] == playerColor)
         {
            if (column2[row] == playerColor && column3[row] == playerColor && column5[row] == playerColor)
               winner = true;
         }// End if
         
      }// End outer if
      
      if (!winner)
      {
         if (column4[row] == playerColor)
         {
            if (column3[row] == playerColor && column5[row] == playerColor && column6[row] == playerColor)
               winner = true;
         }// End if
         
      }// End outer if
      
      if (!winner)
      {
         if (column4[row] == playerColor)
         {
            if (column5[row] == playerColor && column6[row] == playerColor && column7[row] == playerColor)
               winner = true;
         }// End if
         
      }// End outer if
   
      return winner;
   
   }// End method

//-----------------------------------------------

   private boolean checkColumnsForWinner(char[] column, char playerColor)
   {
      /*
         This method first checks the the middle 2 spaces in the column for matching colors. If those 2 spaces match then there is a possible
         winner and then the 2 other spaces are checked for a match.
      
      */      
      
      boolean winner = false;
      
      if (column[3] == playerColor && column[2] == playerColor)
      {
         if (column[1] == playerColor && column[4] == playerColor)
            winner = true;
      }// End if      
      
      if (!winner)
      {
         if (column[3] == playerColor && column[2] == playerColor)
         {
            if (column[5] == playerColor && column[4] == playerColor)
               winner = true;
         }// End if
         
      }// End outer if
      
      if (!winner)
      {         
         if (column[3] == playerColor && column[2] == playerColor)
         {
            if (column[1] == playerColor && column[0] == playerColor)
               winner = true;
         }// End if
      
      }// End outer if      
      
      return winner;
   
   }// End method

//-------------------------------------

   private void add(char[] column, char playerColor)
   {
      /*
         this method recieves a column and player disc color and then adds the disc color to the column.
      */
   
      for (int i = 0; i < ROWS; i++)
      {
      
         if (column[i] == ' ') 
         {     
            column[i] = playerColor;
            break;
         }// End if        
         
         
      }// End for loop   
   
   }// End method


}// End class
