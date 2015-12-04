import java.util.ArrayList;
import java.util.Scanner;


public class ComputeIntersection {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of lines");
		int numLines=sc.nextInt();
		RandomLineGenerator rLines=new RandomLineGenerator(numLines);
		
		ArrayList<HorizontalLines> hLines=rLines.getHorizontalLine();
		ArrayList<VerticalLines> vLines=rLines.getVerticalLine();
		
		
		for(HorizontalLines horizontal: hLines){
			System.out.println("X----"+horizontal.getX()+"---Y---"+horizontal.getY());
		}
		
		
		
	}
	
}
