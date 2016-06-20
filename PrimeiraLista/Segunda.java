
public class Segunda {

	public static void main(String[] args) 
	{
		Metodos metodos = new Metodos();
		int n = 100000;

		double sucessos = 0;
		for (int j = 0; j < n; j++)
		{
			boolean game = true;
			int i = 0;
			while(game == true)
			{
				i++;
				double dado = Math.random();
				if(dado <= 0.3)
				{
					game = false;
				}
			}
			if (i == 4)
			{
				sucessos++;
			}
		}
		System.out.println("Letra A: " + sucessos/n);
		
		double sucessos1 = 0;
		for (int j = 0; j < n; j++)
		{
			boolean game1 = true;
			int i1 = 0;
			while(game1 == true)
			{
				i1++;
				double dado1 = Math.random();
				if(dado1 <= 0.3)
				{
					game1 = false;
				}
			}
			if (i1 < 5)
			{
				sucessos1++;
			}
		}
		System.out.println("Letra B: " + sucessos1/n);
	}

}
