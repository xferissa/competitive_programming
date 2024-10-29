import java.util.Scanner;
public class example5{
	public static void main(String[]args){
		Scanner ent = new Scanner(System.in);
		int a, b, c=0;
		while(ent.hasNext()){
			a=ent.nextInt(); b=ent.nextInt();
			if(c>0)System.out.println();
			System.out.printf("Case %d: %d\n", ++c, a+b);
		}
	}
}
