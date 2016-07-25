package com.ssa.ptboatgame;

public class PTBoat 
{
	String row;
	int column;
	
	public boolean isHit(String row, int column)
	{
		if((this.row == row) && (this.column == column))
		return true;
		
		else {
			return false;
		}
		
	}
	
	public PTBoat(String row, int column) 
	{		
		this.row = row;
		this.column = column;
	}
	
	

}
