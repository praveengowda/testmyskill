

public class Multipleof3and5 {
	
	  public int multipleOf3and5(){
	  int totalsum=0;
	  for(int i=0;i<1000;i++)
	 {
	 	if(i%3==0 ||i%5==0)
		{
			int num=0;
			totalsum=totalsum+i;
		}
	}
	
	return totalsum;
	}
	
}

