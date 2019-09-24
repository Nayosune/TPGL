public class Orange{
	private double prix;
	private String origine;
	public Orange(double p,String o)
	{
		if(p<0)
		{
			System.out.println("prix negatif");
			prix=0;
		}
			
		else
		{
			prix=p;
		}
		origine=o;
	}
	public double getPrix()
	{
		return this.prix;
	}
	public String getOrigine()
	{
		return this.origine;
	}
	public static void main(String []args )
	{
		Orange o1=new Orange(12.0,"France");
		Orange o2=new Orange(-5.0,"Espagne");
		Orange o3=new Orange(3.0,"Italie");
		System.out.println(o1.getPrix());
		System.out.println(o1.getOrigine());
		System.out.println(o2.getPrix());
		System.out.println(o2.getOrigine());
		System.out.println(o3.getPrix());
		System.out.println(o3.getOrigine());
		
	}
}

	
