import java.util.Scanner;

public class quiz {
	// Feito por Julia e João Pedro
	
	public static void main(String[] args) {
	
		Scanner Sc = new Scanner(System.in); // criando scanner

		System.out.println("Quiz sobre o Corinthians! Digite o número da resposta"
				+ "correta em cada pergunta. Insira seu nome para começar: ");
		String name = Sc.nextLine();

		int x = 0; // contador de rodadas
		int y = 0; // contador de pontos

		System.out.println("Em que ano o Corinthians ganhou sua primeira Libertadores da América?"
				+ "\n1- 2012\n2- 2010 \n3- Não tem Libertadores");
		int lib = Sc.nextInt();

		System.out.println("Quem era o goleiro do Corinthians na conquista do primeiro Mundial de Clubes?"
				+ "\n1. Dida \n2. Cássio\n 3.Ronaldo");
		int gk = Sc.nextInt();

		System.out.println(
				"Qual jogador foi o símbolo da democracia corinthiana?" + "\n1. Rincón \n2. Marcelinho \n3. Sócrates");
		int dem = Sc.nextInt();

		System.out.println(
				"Qual o nome do atual presidente do Corinthians? (2021)" + "\n1. Andrés \n2. Duílio \n3. Mário");
		int pres = Sc.nextInt();

		System.out.println("Em que ano foi construída a Arena Corinthians?" + "\n1. 2010 \n2.1998 \n3. 2014");
		int ar = Sc.nextInt();

		System.out.println("Quantos títulos de Brasileirão o Corinthians tem? (2021) " + "\n1. 2 \n2. 7 \n3. 5");
		int br = Sc.nextInt();

		System.out
				.println("Em que ano foi fundado o Sport Club Corinthians Paulista?" + "\n1. 1910 \n2. 1908 \n3. 1911");
		int fun = Sc.nextInt();

		System.out.println(
				"Qual destes não é um apelido do Corinthians? " + "\n1. Coringão \n2. Timão \n3. Gigante da Colina");
		int nick = Sc.nextInt();

		System.out.println("Como é conhecida a torcida do Corinthians? " + "\n1. Sonora \n2. Grandiosa \n3. Fiel");
		int fan = Sc.nextInt();

		System.out.println("Qual é o décimo mandamento do Corinthianismo?"
				+ "\n1. Vai, Corinthians \n2. Amar o corinthians sobre todas as coisas "
				+ "\n3. Nossas glórias mil são contra tudo e contra todos ");
		int mand = Sc.nextInt();

		while (x < 10) { // laço de repetição para repetir por 10 rodadas
			if (lib == 1) { // cada if verifica uma das perguntas do quiz
				y++;
			}
			if (gk == 1) {
				y++;
			}
			if (dem == 3) {
				y++;
			}
			if (pres == 2) {
				y++;
			}
			if (ar == 3) {
				y++;
			}
			if (br == 2) {
				y++;
			}
			if (fun == 1) {
				y++;
			}
			if (nick == 3) {
				y++;
			}
			if (fan == 3) {
				y++;
			}
			if (mand == 1) {
				y++;
			}

			x++;
		}

		int points = y / 10; // contador de pontos, dividindo y por 10 devido às 10 repetições do while

		System.out.println("Parabéns, " + name + ", você conseguiu " + points + " pontos!"); // imprimindo a pontuação

		Sc.close();

	}

	}

