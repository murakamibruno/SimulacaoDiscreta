
public class Primeira
{
	public static void main(String[] args)
	{
		int m = 100000;
		double sucessos = 0;
		Metodos metodos = new Metodos();
		for(int i = 0; i < m ; i++)
		{
			int k = metodos.bernoulli(3, 0.6);
			if(k == 2)
			{
				sucessos++;
			}
		}
		System.out.println("Letra A: " + sucessos/m);
		
		int m1 = 100000;
		double sucessos1 = 0;
		for(int i = 0; i < m ; i++)
		{
			int k1 = metodos.bernoulli(5, 0.6);
			if(k1 > 2)
			{
				sucessos1++;
			}
		}
		System.out.println("Letra B: " + sucessos1/m);
	}
}
