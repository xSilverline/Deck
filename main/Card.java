

class Card implements Comparable<Card>
{
	public String color;
	public int value;
	
	Card(int Value,String Color)
	{
		if((Value>0 && Value<14)&&(Color != "Heart" || Color != "Tile" || Color != "Pike" || Color !="Clover"))
		{
			this.color=Color;
			this.value = Value;
		}
		else
			throw new IllegalArgumentException();
	}
	
		
	public int getValue()
	{
		return value;
	}
	
	public String getColor()
	{
		return color;
	}
	
	public String toString()
	{
		if(value == 1)
			return "Ace "+color;
		else
		if(value>1 && value<11)
			return Integer.toString(value)+" "+color;
		else
		if(value == 11)
			return "Valet "+color;
		else
		if(value == 12)
			return "Queen "+color;
		else
			return "King "+color;
		
	}
	
	@Override
    public int compareTo(Card other) 
	{
        if (this.getValue() < other.getValue()) return -1;
        
        else if (this.getValue() > other.getValue()) return 1;

        return this.toString().compareTo(other.toString());
	}
	
}
