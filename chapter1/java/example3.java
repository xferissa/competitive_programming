import java.util.Scanner;
public class example3{
	public static void main(String[]args){
		int a, b;
		Scanner ent = new Scanner(System.in);
		while(ent.hasNext()){
			a=ent.nextInt(); b=ent.nextInt();
			System.out.println(a+b);
		}
	}
}
