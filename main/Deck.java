

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Deck 
{
	ArrayList<Card> cards= new ArrayList<>();

	private String color;
	
	Deck(int numberOfCards)
	{
		int minimalCard;
		if(numberOfCards == 52) minimalCard=2;
		else
		if(numberOfCards == 32) minimalCard=7;
		else
		if(numberOfCards == 24) minimalCard=9;
		else
			throw new IllegalArgumentException();
		
		for(int i = 0; i<4; i++)
		{
			if(i==0) color = "Heart";
			if(i==1) color = "Tile";
			if(i==2) color = "Pike";
			if(i==3) color = "Clover";
			
			cards.add(new Card(1,color));
			
			for(int j = minimalCard; j < 14; j++)
			{
				cards.add(new Card(j,color));
			}
		}
		cards.sort(Comparator.naturalOrder());
	}
	
	public void sorting()
	{
		cards.sort(Comparator.naturalOrder());
	}
	
	public void shuffling()
	{
		Collections.shuffle(cards);
	}
	
	public Card showTopCard()
	{
		return cards.get(0);
	}
	
	public String toString()
	{
		StringBuilder x = new StringBuilder();
		for(Card y : this.cards)
		{
			x.append(y);
			x.append(System.lineSeparator());
			
		}
		return x.toString();
	}
}
