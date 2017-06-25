
public class Cal {
	int a=10,b=9;
int add()
{
	return a+b;
}
int sub(){ return a-b ;}
int div(){ return a/b;}
int mul(){ return a*b;}
}
class Test extends Cal{
	public static void main(String args[]){
		Cal A=new Cal();
		System.out.println("Addition :"+A.add());
		System.out.println("Subtraction :"+A.sub());
		System.out.println("Multiplication :"+A.mul());
		System.out.println("Division :"+A.div());
		
	}
}