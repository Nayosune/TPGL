
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
	public void retire()
	{
		if(this.estVide())
		{
			System.out.println("panier vide");
		}
		else
		{
			panier.remove(panier.size()-1);
		}
	}
	public double getPrix()
	{	
		double somme=0;
		for( int i=0;i<panier.size();i++)
		{
			somme=somme+panier.get(i).getPrix();
		}
		return somme ;
	}	
	public static void main(String []args)
	{
		Orange o=new Orange(5,"France");
		Orange o1=new Orange(5,"France");
		Orange o2=new Orange(5,"France");
		Panier p1=new Panier(5);
		System.out.println(p1.ajoute(o));
		System.out.println(p1.ajoute(o1));
		System.out.println(p1.ajoute(o2));
		System.out.println(p1.getPrix());
	}
}
