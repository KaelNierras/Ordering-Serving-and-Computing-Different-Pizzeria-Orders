package pizzeria;
import java.util.*;

public class Pizza
{
	private String name;
	private PizzaSize size;
	private PizzaBase base;

	public Pizza (PizzaSize size)
	{
		this.name = null;
		this.base = PizzaBase.Original;
		this.size = size;
	}

	public Pizza (String name, PizzaSize size, PizzaBase base)
	{
		this.name = name;
		this.size = size;
		this.base = base;	
	}

	public String getName()
	{
		return this.name;
	}

	public PizzaSize getSize()
	{
		return this.size;
	}

	public PizzaBase getBase()
	{
		return this.base;
	}

}