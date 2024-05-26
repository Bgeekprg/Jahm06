package tns.personinfo;

public class TaxCalc {
	
	public TaxCalc(double income,int age)
	{	
		if(age>=18)
		{
			if(income <=50000 && income>=20000)
			{
				System.out.println("Tax ="+income*0.05);
			}
			else if(income>=100000)
			{
				System.out.println("Tax ="+income*0.10);
			}
			else
			{
				System.out.println("No Tax...! ");
			}
		}
		else
		{
			System.out.println("No Tax ....!");
			
		}
	}
}
