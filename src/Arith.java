
public class Arith{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a =12,b = 0;
		System.out.println("hii");
		try
		{
			System.out.println("the divison of a,b : "+a/b);
			try {
			System.out.println("the multiplication of a,b : "+a*b);
			}catch(Exception f)
			{
				System.out.println("Nested exception ......");
			}
		}catch(Exception e)
		{
			System.out.println(e);
			System.out.println("Exception is catched...");
		
		}
		finally
		{
			System.out.println("the last method ");
			System.out.println("....");
		}
		System.out.println("Exception is catched...");
	}

}
