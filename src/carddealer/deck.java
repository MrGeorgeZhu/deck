package carddealer;

import java.util.*;
import java.lang.Math;



public class deck 
{
	private int Ndecks;
	private String type;
	private List<Integer> deckindex = new ArrayList<Integer>();
	private List<String> suit = new ArrayList<String>();
	private List<String> face = new ArrayList<String>();
	private List<Integer> rank = new ArrayList<Integer>();
	
	
	public deck()
	{
		this.Ndecks = 1;
		type = "poker";
		
		for (int i = 0; i < 52 * Ndecks; i++)
		{
			deckindex.add(i);
			
			switch((int)Math.floor(i/13)%4)
			{
			case 0:
				suit.add("clubs");				
				break;
			case 1:
				suit.add("diamonds");
				break;
			case 2:
				suit.add("hearts");
				break;
			case 3:
				suit.add("spades");
				break;
			default:
				break;
			}
			
			switch(i%13)
			{
			case 0:
				face.add("ace");
				rank.add(13);
				break;
			case 10:
				face.add("jack");
				rank.add(10);
				break;
			case 11:
				face.add("queen");
				rank.add(11);
				break;
			case 12:
				face.add("king");
				rank.add(12);
				break;
			default:
				face.add(Integer.toString(i%13+1));
				rank.add(i%13);
				break;
			}
		}
		 
	} // end deck() constructor
	
	public deck(int ndecks)
	{
		this.Ndecks = ndecks;
		for (int i = 0; i < 52*Ndecks; i++)
		{
			deckindex.add(i);
			
			switch((int)Math.floor(i/13)%4)
			{
			case 0:
				suit.add("clubs");				
				break;
			case 1:
				suit.add("diamonds");
				break;
			case 2:
				suit.add("hearts");
				break;
			case 3:
				suit.add("spades");
				break;
			default:
				break;
			}
		}
		
		
	} // end deck(int ndecks) constructor
	
	public static void main(String[] args)
	{
		
			deck udeck = new deck();
			for (int i : udeck.deckindex)
			{
				System.out.println(i + "= " + udeck.face.get(i) + " of " + udeck.suit.get(i) + " rank = " + udeck.rank.get(i));
			}
			
	} // end main	
} // end deck class
  