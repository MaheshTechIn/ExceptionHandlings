import java.util.Scanner;
public class Overloading {
/*
	Overloading(double d)
	{
		this(10);
		System.out.println("Double argumented method");
	}
	Overloading(int i)
	{
		this();
		System.out.println("Integer argumented meth0d");
	}
	Overloading()
	{
		System.out.println("No arguments....");
		
	}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     cons_demo ob =  new  cons_demo();
     cons_demo ob2 =  new  cons_demo("thum",5);
     cons_demo ob3 =  new  cons_demo(50,60);
      //ob.Overloading(); 
	}
}
class cons_demo
{
	int x,y;
	String name;
	double gpa;
	cons_demo()
	{
		x = 10;
		y =20 ;
		name = "abc";
		gpa = 4.8; 
		System.out.println("the marks in two subjects are : "+x+" "+y);
		System.out.println("Name of the student is : "+name);
		System.out.println("the gpa : "+gpa);		
	}
	cons_demo(String n,int gp)
	{
		name  = n;
		gpa = gp;
		System.out.println("Name of the student is : "+name);
		System.out.println("gpa = "+gp);
	}
	cons_demo(int a,int v)
	{
		x = a;
		y = v;
		System.out.println("the values are : "+x+" "+y);
		//System.out.println("")
	}
}

	

