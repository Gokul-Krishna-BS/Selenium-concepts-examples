package selenium_mkt;

public class ComparingnumberinArray {

	public static void main(String[] args) 
	{
		int rollno[]= {10,20,30,40};
		int checknumber=40;
		for(int i=0;i<rollno.length;i++)
		{
			if(checknumber==rollno[i])
			{
				System.out.println("Present");
				break;
			}
			else
			{
				System.out.println("not present");
				break;
			}
		}
	}

}
