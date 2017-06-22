import java.util.Scanner;
public class Homework2 {

	public static double triangle(int x1, int y1,int x2,int y2,int x3,int y3)
	{
		double A=0;
		A=(0.5)*((x1*y2+x2*y3+x3*y1)-(x2*y1+x3*y2+x1*y3));
		
		return A;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Input:");
		int x1=s.nextInt();
		int y1=s.nextInt();
		int x2=s.nextInt();
		int y2=s.nextInt();
		int x3=s.nextInt();
		int y3=s.nextInt();
		
		System.out.println(triangle(x1,y1,x2,y2,x3,y3));

	}

}
