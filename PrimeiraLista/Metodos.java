
public class Metodos 
{

	
	public static int bernoulli(int n, double p)
	{
		int k = 0;

		for (int i = 0; i < n ; i++)
		{
			double dado = Math.random();
			if (dado <= p)
			{
				k++;
			}
		}
		return k;
	}
	
    public static int binomial(int n, double p)
    {
        int k = 0;
        for(int i=0;i<n;i++)
        {
            if(Math.random() < p) k++;
        }
        
        return k;
    }
    
    public static int spoisson(double lambda)
    {
        int k = -1;
        double p = 1;
        double e = Math.exp(-lambda);
        
        do
        {
            k++;
            p = p * Math.random();
        } while(p > e);
        
        return k;
    }
}
