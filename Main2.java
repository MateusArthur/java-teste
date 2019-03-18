import java.util.Scanner;


class Main
{
	public static void print(String a)
	{
		System.out.println(a);
	}
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);

		/*Data a;
		print("Insira o dia:");
		int d = s.nextInt();
		print("Insira o mes:");
		int m = s.nextInt();
		a = new Data(d, m);
		a.imprime();

		///////////////////////////[ Calcular ]///////////////////////////////
		Calcula b;
		print("Insira o numero 1:");
		double n1 = s.nextDouble();
		print("Insira o numero 2:");
		double n3 = s.nextDouble();
		print("Insira o numero 3:");
		double n2 = s.nextDouble();
		b = new Calcula(n1, n2, n3);
		double resultado = b.resultado();
		print("Resultado da média dos Doubles = " + resultado);

		print("Insira a sua string");
		String texto = s.nextLine();
		char chrt = texto.charAt(4);
		print("4 sring = " + chrt);
		chrt = texto.charAt(5);
		print("5 sring = " + chrt);*/

		print("Insiria a string que deseja reverter:");

		String reverter = s.nextLine();
		String reversa = "";

		for(int i = reverter.length() - 1; i >= 0; i--)
		{
			reversa = reversa + reverter.charAt(i);
		}
		print("A String reversa é: " + reversa);

	}
}