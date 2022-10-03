class Player
{

   private char playerColor;
   private boolean isWinner;
   
//---------------------------------

   Player(char playerColor)
   {
   
      this.playerColor = playerColor;
      isWinner = false;
   
   }// End constructor
   
//----------------------------------------

   public void setPlayerColor(char playerColor)
   {
      this.playerColor = playerColor;
   
   }// End method
   
//----------------------------------------

   public char getPlayerColor()
   {
      return playerColor;
   
   }// End method

//----------------------------------------

   public void setWinner(boolean winner)
   {
      isWinner = winner;
   
   }// End method
   
//----------------------------------------

   public boolean getWinner()
   {
      return isWinner;
   
   }// End method
   
   
}// End class
