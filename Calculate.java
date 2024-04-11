package com.chainsys.day5;

public class Calculate
{
	 public static void main(String[] args) 
	 {
	        boolean gameOver=true;
	        int score=800;
	        int levelCompleted=5;
	        int bonus=100;
	        int highScoreTable1=CaluculateHighScorePosition(1500);
	        displayhighScorePosition("Ajith",highScoreTable1);
	        int highScoreTable2=CaluculateHighScorePosition(900);
	        displayhighScorePosition("Hari",highScoreTable2);
	        int highScoreTable3=CaluculateHighScorePosition(400);
	        displayhighScorePosition("Karthik",highScoreTable3);
	        int highScoreTable4=CaluculateHighScorePosition(50);
	        displayhighScorePosition("Mani",highScoreTable4);
	  }
      public static void displayhighScorePosition(String playerName,int highScoreTable)
	  {
		  System.out.println(playerName+" managed to get into position"+highScoreTable+" on the high score table");
		
	  }
      public static int CaluculateHighScorePosition(int playerScore)
	  {
	    	if(playerScore>=1000)
            {
               return 1;
            } 
            else if(playerScore>=500&&playerScore<1000)
            {
               return 2;
            } 
            else if(playerScore>=100&&playerScore<500)
            {
               return 3;
            }
            else 
            {
              return 4;
            }
	   }
}

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    



	

