
public class Quarta {

	public static void main(String[] args) 
	{
		Metodos metodos = new Metodos();
		int nExp = 100000;
		double sucesso = 0;
		double sucesso1 = 0;

		for(int i = 0; i < nExp ; i++)
		{
			int k = metodos.spoisson(3);
			if(k < 3)
			{
				sucesso++;
			}
		}
		System.out.println("Letra A: " + sucesso/nExp);
		
		
		for(int i = 0; i < nExp ; i++)
		{
			int k = metodos.spoisson(3);
			if (k == 0)
			{
				int k1 = metodos.spoisson(3);
				if(k1 == 0)
				{
					int k2 = metodos.spoisson(3);
					if(k2 == 0)
					{
						sucesso1++;
						//System.out.println(sucesso1);
					}
				}
			}
		}
		System.out.println("Letra B: " + sucesso1/nExp);
	}	
}
