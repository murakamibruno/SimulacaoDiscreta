import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Quinta
{
	public static void main(String[] args) 
	{
		double exp_sucesso = 0;
		int nExp = 100000;
		for(int i = 0 ; i < nExp ; i++)
		{
			ArrayList<Integer> num_escolhidos = new ArrayList<Integer>();
			ArrayList<Integer> num_sorteados = new ArrayList<Integer>();
			Random rand = new Random();
			int sucesso = 0;
			for(int j = 0; j < 10; j++)
			{
				int var = rand.nextInt(100)+1;
				while(num_sorteados.contains(var))
				{
					var = rand.nextInt(100)+1;
				}
				num_sorteados.add(var);
			}	
			Collections.sort(num_sorteados);
			//System.out.println(num_sorteados);
			num_escolhidos = escolherNumeros(1,2,3,4,5,6,7,8,9,10);
			
			for(int j = 0; j <10 ; j++)
			{
				if(num_sorteados.contains(num_escolhidos.get(j)))
				{
					sucesso++;
				}
			}
			
			if(sucesso >= 6)
			{
				exp_sucesso++;
			}
		}
		System.out.println(exp_sucesso/nExp);
	}
	
	public static ArrayList<Integer> escolherNumeros(int a0, int a1, int a2, int a3, int a4, int a5, int a6, int a7, int a8, int a9)
	{
		ArrayList<Integer> num_escolhidos = new ArrayList<Integer>();
		num_escolhidos.add(a0);
		num_escolhidos.add(a1);
		num_escolhidos.add(a2);
		num_escolhidos.add(a3);
		num_escolhidos.add(a4);
		num_escolhidos.add(a5);
		num_escolhidos.add(a6);
		num_escolhidos.add(a7);
		num_escolhidos.add(a8);
		num_escolhidos.add(a9);
		return num_escolhidos;
	}
}
