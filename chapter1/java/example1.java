import java.util.Scanner;
public class example1{
	public static void main(String[]args){
		int TC, a, b;
		Scanner entrada = new Scanner(System.in);
		TC = entrada.nextInt();
		while(TC-- >0){
			a = entrada.nextInt();
			b = entrada.nextInt();
			System.out.println(a+b);
		}
	}
}
