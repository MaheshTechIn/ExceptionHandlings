import java.util.*;
public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collect ob =new Collect();
		Scanner sc=new Scanner(System.in);
		List<Integer>al=new ArrayList<Integer>();
		System.out.println("Enter student name : ");
		String s=sc.nextLine();
		System.out.println("Enter student roll no : ");
		int in=sc.nextInt();
		System.out.println("Enter 5 subject marks : ");
		for(int i=1;i<=5;i++)
		{
			al.add(sc.nextInt());
		}
		//System.out.println(al);
		ob.display(s,in,al);
	}

}
class Collect 
{
	public void display(String s,int ob,List<Integer>A)
	{
		System.out.println("Student details : ");
		System.out.println("Student Name : "+s+"\nStudent roll no : "+ob);
		System.out.println("Student Marks:"+A);
		int total=0;
		for(int i=0;i<A.size();i++)
		{
			total=total+A.get(i);
		}
		System.out.println("Student Marks total = "+total);
	}
}