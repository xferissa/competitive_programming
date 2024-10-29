import java.util.Scanner;
public class example2{
	public static void main(String[]args){
		Scanner ent = new Scanner(System.in);
		int a, b;
		while(true){
			a = ent.nextInt(); b = ent.nextInt();
			if((a==0)&&(b==0)){break;}
			System.out.println(a+b);
		}
	}
}
