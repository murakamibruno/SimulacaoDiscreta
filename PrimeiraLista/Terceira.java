import java.util.Random;

public class Terceira
{
	public static void main(String[] args)
	{
		Random rand = new Random();
		int n = 100000;
		double sucesso = 0;
		for(int i = 0; i < n ; i++)
		{
			int dado1 = rand.nextInt(6) + 1;
			int dado2 = rand.nextInt(6) + 1;
			int soma = dado1 + dado2 ;
			if(soma > 6)
			{
				if (dado1 == 5 || dado2 == 5)
				{
					sucesso++;
				}
			}
		}
		
		System.out.println(sucesso/n);
	}
}
