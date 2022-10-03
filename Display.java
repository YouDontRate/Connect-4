class Display
{   
   private final int ROWS = 13;
   private final int COLUMNS = 15;   
   private char[][] gameBoard;


//-------------------------------------

   Display()
   {
      initialize();      
      
   }// End constructor

//------------------------------------

   private void initialize()
   {
      gameBoard = new char[ROWS][COLUMNS]; 
      makeBoarder();       
   
   }// End method

//----------------------------------

   public void showBoard(GameTray tray)
   {
   
      /*
         This is the method that handles the output. it recieves the current game tray and passes it to the addDiscs() method.
         the addDiscs() populates the gameBoard with the disc colors.
      */
    
      addDiscs(tray);
   
      for (int i = 0; i < ROWS; i++)
      {
         System.out.println();
         
         for (int j = 0; j < COLUMNS; j++)
            System.out.print(gameBoard[i][j]);
      
      }// End i for loop      
      
      System.out.println();
      
      System.out.println(" 1 2 3 4 5 6 7");
  
   }// End method
   
//----------------------------------  

   private void makeBoarder()
   {
      /*
         This method populates the gameBoard array with the boarder.
      */
   
      for (int i = 0; i < ROWS; i++)         
         for (int j = 0; j < COLUMNS; j=j+2)
            gameBoard[i][j] = '|';         
      
      
      for (int i = 0; i < ROWS; i=i+2)         
         for (int j = 0; j < COLUMNS; j++)
            gameBoard[i][j] = '-';      
      
      
      for (int i = 2; i < ROWS-1; i=i+2)         
         for (int j = 2; j < COLUMNS; j=j+2)
            gameBoard[i][j] = '+';     
           
      
      gameBoard[2][0] = '|';
      gameBoard[2][14] = '|';
      
      gameBoard[4][0] = '|';
      gameBoard[4][14] = '|';
      
      gameBoard[6][0] = '|';
      gameBoard[6][14] = '|';
      
      gameBoard[8][0] = '|';
      gameBoard[8][14] = '|';
      
      gameBoard[10][0] = '|';
      gameBoard[10][14] = '|';      
      
   }// End method

//-----------------------------------------

   private void addDiscs(GameTray tray)
   {
   
      /*
         This method fills the gameboard row by row. Each foor loop represents a row.
         the column value is reset after each for loop. each for loop is incremented by 2.
      
      */     
   
      int column;
      int row = 6;     
      
      for (int i = 1; i < ROWS; i=i+2)
      {
         column = 1;
         row--;     
      
         for (int j = 1; j < COLUMNS; j=j+2)
         {
            gameBoard[i][j] = tray.getDiscColor(column, row);
            column++;         
         
         }// End i for loop         
      
      }// End j for loop      
      
   
   }// End method
   

}// End class



/*

   disc positions by row

   gameBoard[1][1]
   gameBoard[1][3]
   gameBoard[1][5]
   gameBoard[1][7]
   gameBoard[1][9]
   gameBoard[1][11]
   gameBoard[1][13]
   
   gameBoard[3][1]
   gameBoard[3][3]
   gameBoard[3][5]
   gameBoard[3][7]
   gameBoard[3][9]
   gameBoard[3][11]
   gameBoard[3][13]
   
   gameBoard[5][1]
   gameBoard[5][3]
   gameBoard[5][5]
   gameBoard[5][7]
   gameBoard[5][9]
   gameBoard[5][11]
   gameBoard[5][13]
   
   gameBoard[7][1]
   gameBoard[7][3]
   gameBoard[7][5]
   gameBoard[7][7]
   gameBoard[7][9]
   gameBoard[7][11]
   gameBoard[7][13]
   
   gameBoard[9][1]
   gameBoard[9][3]
   gameBoard[9][5]
   gameBoard[9][7]
   gameBoard[9][9]
   gameBoard[9][11]
   gameBoard[9][13]
   
   gameBoard[11][1]
   gameBoard[11][3]
   gameBoard[11][5]
   gameBoard[11][7]
   gameBoard[11][9]
   gameBoard[11][11]
   gameBoard[11][13]


 -----------------------------
 
 
 disc positions by column   
   
   gameBoard[1][1]
   gameBoard[3][1]
   gameBoard[5][1]
   gameBoard[7][1]
   gameBoard[9][1]
   gameBoard[11][1]
   
   gameBoard[1][3]
   gameBoard[3][3]
   gameBoard[5][3]
   gameBoard[7][3]
   gameBoard[9][3]
   gameBoard[11][3]
   
   gameBoard[1][5]
   gameBoard[3][5]
   gameBoard[5][5]
   gameBoard[7][5]
   gameBoard[9][5]
   gameBoard[11][5]
   
   gameBoard[1][7]
   gameBoard[3][7]
   gameBoard[5][7]
   gameBoard[7][7]
   gameBoard[9][7]
   gameBoard[11][7]
   
   gameBoard[1][9]
   gameBoard[3][9]
   gameBoard[5][9]
   gameBoard[7][9]
   gameBoard[9][9]
   gameBoard[11][9]
   
   gameBoard[1][11]
   gameBoard[3][11]
   gameBoard[5][11]
   gameBoard[7][11]
   gameBoard[9][11]
   gameBoard[11][11]
   
   gameBoard[1][13]
   gameBoard[3][13]
   gameBoard[5][13]
   gameBoard[7][13]
   gameBoard[9][13]
   gameBoard[11][13]


*/

