
import java.util.ArrayList;

public class Panier{
	private ArrayList<Orange> panier = new ArrayList<Orange>();
	public int nbMaxOrange;
	public Panier(int nb)
	{
		nbMaxOrange=nb;
	}
	public int getNbOrange()
	{
		return panier.size();
	}
	public int getNbMaxOrange()
	{
		return nbMaxOrange;
	}
	public void setNbMaxOrange(int n)
	{
		nbMaxOrange=n;
	}
	public boolean estPlein()
	{
		return nbMaxOrange==panier.size();
	}
	public boolean estVide()
	{
		return panier.size()==0;
	}	
	public boolean ajoute(Orange o)
	{
		if(this.estPlein())
		{
			System.out.println("panier plein");
			return false;
		}
		else
		{
			panier.add(o);	
			return true;
		}
	}
	public static void main(String []args)
	{
		Orange o=new Orange(5,"France");
		Panier p1=new Panier(5);
		System.out.println(p1.getNbMaxOrange());
		System.out.println(p1.getNbOrange());
		System.out.println(p1.ajoute(o));
		System.out.println(p1.getNbOrange());
		System.out.println(p1.estPlein());
		System.out.println(p1.estVide());
	}
}
