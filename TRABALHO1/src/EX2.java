import java.util.Random;

public class EX2 {
	public static void main(String[] args) {
//		 Escreva um programa em Java que preencha uma matriz quadrada de ordem 4 com 
//		 valores inteiros aleatórios (gerados a partir da classe Random) e, em seguida, faça a impressão dos 
//		 elementos no formato de uma tabela (impressão como apresentado durante as aulas). Após a 
//		 impressão o seu programa deverá trocar os elementos armazenados no triângulo superior da matriz 
//		 com os elementos armazenados no triângulo inferior. Imprima novamente a matriz no vídeo para 
//		 conferência. Veja o exemplo abaixo indicando como a troca dos elementos deverá ser realizada. 
		
		int[][] nums = new int[4][4];
		Random rng = new Random();
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				nums[i][j] = rng.nextInt(101);
				System.out.print(nums[i][j] + "\t");
			}
			System.out.println();
		}

		int aux;

		System.out.println();

		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j <= i; j++) {
				if (i != j) {
					aux = nums[i][j];
					nums[i][j] = nums[j][i];
					nums[j][i] = aux;
				}
			}
		}
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				System.out.print(nums[i][j] + "\t");
			}
			System.out.println();
		}

	}
}
