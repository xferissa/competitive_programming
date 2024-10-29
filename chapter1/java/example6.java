import java.util.Scanner;
public class example6{
	public static void main(String[]args){
		Scanner ent = new Scanner(System.in);
		int k, ans, v;
		while(ent.hasNext()){
			k = ent.nextInt();ans=0;
			while(k-- >0){v=ent.nextInt(); ans += v;}
			System.out.println(ans);
		}
	}
}
