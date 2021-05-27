
public class TestLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=1;
		
		while(a<=10)
		{
			System.out.println(a);
			a++;
//			a=a+1;
		}
		
		System.out.println("--------------------------------------------------");
		
		a=1;
		
		do 
		{
			System.out.println(a);
			a++;
		}while(a>10);
		
		System.out.println("---------------------------------------------------");
		
		for(int i=1;i<=10;i++)
		{
			if(i==5)
				continue;
			System.out.println(i);
		}
		

	}

}
