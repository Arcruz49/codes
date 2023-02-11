import java.util.Scanner;
import java.util.Random;

public class GeradordeSenhas{
	
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		Random gerador = new Random();
		
		String letrasMin = "abcdefghijklmnopqrstuvwxyz";
		String letrasMai = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String simbolos = "+-[]*~_@#:?";
		String numeros = "0123456789";
		
		String senha = "";
		String answer1 = "";
		String answer2 = "";
		
		boolean simbolo = false;
		boolean numero = false;

		int n = 0;
		
		System.out.println("Gerador de senha aleatória: ");
		System.out.println("Quantos caracteres?");
		n = teclado.nextInt();
		
		System.out.print("Precisa de caracteres especiais? (S/N)");
		answer1 = teclado.next();
		
		System.out.println("Precisa de números? (S/N)");
		answer2 = teclado.next();
		
		if(answer1.equals("S"))
			simbolo = true;
		if(answer2.equals("S"))
			numero = true;
		
		if (simbolo && numero) {
			for (int i = 0; i < n; i ++) {
				senha = senha + letrasMin.charAt(gerador.nextInt(25));
				senha = senha + letrasMai.charAt(gerador.nextInt(25));
				senha = senha + simbolos.charAt(gerador.nextInt(9));
				senha = senha + numeros.charAt(gerador.nextInt(9));
			}
		}
		
		if (simbolo && !numero) {
			for (int i = 0; i < n; i ++) {
				senha = senha + letrasMin.charAt(gerador.nextInt(25));
				senha = senha + letrasMai.charAt(gerador.nextInt(25));
				senha = senha + simbolos.charAt(gerador.nextInt(9));
			}
		}
		
		if(!simbolo && numero) {
			for (int i = 0; i < n; i ++) {
				senha = senha + letrasMin.charAt(gerador.nextInt(25));
				senha = senha + letrasMai.charAt(gerador.nextInt(25));
				senha = senha + numeros.charAt(gerador.nextInt(9));
			}
		}
		
		if(!simbolo && !numero) {
			for (int i = 0; i < n; i ++) {
				senha = senha + letrasMin.charAt(gerador.nextInt(25));
				senha = senha + letrasMai.charAt(gerador.nextInt(25));
			}
		}
		System.out.print("Sua nova senha: ");
		System.out.print(senha.substring(0, n));
		
		teclado.close();
		
	}
}
