import java.util.Scanner;
public class example4{
	public static void main(String[]args){
		Scanner ent = new Scanner(System.in);
		int a,b, c=0;
		while(ent.hasNext()){
			a=ent.nextInt(); b=ent.nextInt();
			System.out.printf("Case %d: %d\n\n", ++c, a+b);
		}
	}
}
