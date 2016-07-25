package com.ssa.ptboatgame;

public class PTBoatGame {

	private PTBoat[] ptBoats = new PTBoat[6];
	private int numberOfBoats = 0;
	
	public PTBoatGame() 
	{
	}
	
	
	public PTBoatGame(PTBoat[] ptBoats, int numberOfBoats) 
	{
		this.ptBoats = ptBoats;
		this.numberOfBoats = numberOfBoats;
	}


	public void addBoat(String row, int column)
	{
		ptBoats[numberOfBoats]= new PTBoat(row, column);
		numberOfBoats ++;
	}
	
	public void guess(String row, int column)
	{

		for (int i = 0; i < numberOfBoats; i++) 
			if(ptBoats[i].isHit(row, column))
				System.out.println("Hit!");
			else
				System.out.println("Miss");
			
		
	}
	
	public static void main(String[] args) 
	{
//		PTBoat boat1 = new PTBoat("B", 2);
//		PTBoat boat2 = new PTBoat("A", 3);
//		PTBoat boat3 = new PTBoat("C", 4);
//		PTBoat boat4 = new PTBoat("D", 5);
//		PTBoat boat5 = new PTBoat("E", 6);
//		PTBoat boat6 = new PTBoat("F", 7);
//	
		PTBoatGame newboat = new PTBoatGame();		
		newboat.addBoat("A", 4);
		newboat.guess("B", 7);
		newboat.guess("C", 3);
		newboat.guess("A", 4);
	}

}
