class Item {
	int id;
	String name;
	double price;

	//TODO add variable.
	char tip_danok;

	//TODO constructor
	Item(int id, String name, double price, char tip_danok)
	{
		this.id = id;
		this.name = name;
		this.price = price;
		this.tip_danok = tip_danok;
	}
	
	//TODO setters and getters
	public void setId(int id)
	{
		this.id = id;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setPrice(double price)
	{
		this.price = price;
	}
	
	public void setTip_danok(char tip_danok)
	{
		this.tip_danok = tip_danok;
	}

	public int getId()
	{
		return id;
	}

	public String getName()
	{
		return name;
	}

	public double getPrice()
	{
		return price;
	}

	public char getTip_danok()
	{
		return tip_danok;
	}



	double taxReturn () {
		//TODO
		if (tip_danok == 'A')
			return price*1.18*0.15;
		if (tip_danok == 'B')
			return price*1.05*0.15;
		if (tip_danok == 'V')
			return price*0.15;
	}
}

class Receipt{

	List<Item> receipt;

	public Receipt() 
	{
		this.receipt = new ArrayList<>();
	}

	public void addItem(Item it)
	{
		return receipt.add(it);
	}

	public void removeItem(Item it)
	{
		return receipt.remove(it);	
	}
}