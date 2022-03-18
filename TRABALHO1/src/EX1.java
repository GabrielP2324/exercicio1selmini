import java.util.Scanner;

//Escreva um programa em Java que leia inicialmente as dimens�es da matriz (n�mero 
//de linhas e n�mero de colunas) e, em seguida, fa�a o preenchimento da matriz com valores inteiros 
//fornecidos pelo usu�rio. Ap�s o preenchimento da matriz dever� ser lido via teclado um valor X e 
//o seu programa dever� fazer a busca desse valor na matriz. Se o valor for encontrado dever� ser 
//impresso no v�deo a sua localiza��o (n�mero da linha e n�mero da coluna). Caso o valor n�o esteja 
//na matriz dever� ser impresso no v�deo a mensagem: �X n�o se encontra na matriz�. 
public class EX1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Por favor informe o numero de linhas que ser�o utilizadas: ");
		int linhas = in.nextInt();
		System.out.print("Por favor informe o numero de colunas que ser�o utilizadas: ");
		int colunas = in.nextInt();

		int[][] nums = new int[linhas][colunas];

		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				System.out.println("Informe o valor da linha " + (i + 1) + " coluna " + (j + 1) + " -> ");
				nums[i][j] = in.nextInt();
			}
		}

		System.out.println("Por favor informe um valor para procurar na matriz ->");
		int x = in.nextInt();
		boolean check = false;
		int[][] pos = new int[1][2];
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				if (nums[i][j] == x) {// basta encontrar o primeiro (acho) Verificar com Selmini
					pos[0][0] = i + 1;
					pos[0][1] = j + 1;
					check = true;
					break;
				}
			}
			if (check) {
				break;
			}
		}
		if (check) {
			System.out.println(x + " est� na posi��o " + pos[0][0] + ", " + pos[0][1]);
		} else {
			System.out.println(x + " n�o est� na matriz");
		}
	}
}
