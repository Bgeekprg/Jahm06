package UserDefinedExceptions;

public class Colour {
	private String Name;
	
	
	public Colour(String name) {
		try 
		{
			if(name=="Red" || name=="Green" || name=="White")
				Name = name;
			
			else
				throw new ColorException("color must be red or green or white");
		}
		catch(ColorException ce)
		{
			System.out.println(ce.getMessage());
		}
	
		
	}

	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}

	@Override
	public String toString() {
		return "Colour [Name=" + Name + "]";
	}
	

}
