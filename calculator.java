import java.util.*;

public class calculator
{
	public interface MyInterFace {
		public int operation(int a,int b);
	}
	private int operate(int a, int b, MyInterFace fobj) 
    { 
        return fobj.operation(a, b); 
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int z=sc.nextInt();
		calculator c = new calculator();
		MyInterFace iface[]=new MyInterFace[10];
		iface[1]=(a,b) -> a+b;
		iface[2]=(a,b) -> a-b;
		iface[3]=(a,b) -> a*b;
		iface[4]=(a,b) -> a/b;
		int a=sc.nextInt();
		int b=sc.nextInt();
		int z=sc.nextInt();
		System.out.println(c.operate(a,b,iface[z]));
	}
}