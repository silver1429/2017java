import java.util.Scanner;
public class Homework1 {

	
	public static void isEnalbeTriangle(int x, int y, int z)
	{
		int max;
		 if (x >= y && x >= z &&(x<y+z)) {
	            max = x;
	            System.out.println("삼각형을 만들 수 있음");
	        } else if (y >= x && y >= z &&(y<x+z)) {
	            max = y;
	            System.out.println("삼각형을 만들 수 있음");
	        } else if (z >= x && z >= y &&(z<y+x)){
	            max = z;
		        System.out.println("삼각형을 만들 수 있음");
	        }else
	        	System.out.println("삼각형을 만들 수 없음");
		 
     }

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int x=s.nextInt();
		int y=s.nextInt();
		int z=s.nextInt();
		
		isEnalbeTriangle(x,y,z);
		
	}

}
