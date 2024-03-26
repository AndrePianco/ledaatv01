package atividade01;

public class Busca implements Busca_IF {

	@Override
	public int[] geraVetorNumericoOrdenado(int tamanho) {
		int[] vetor = new int[tamanho];
		for(int i = 0; i<tamanho; i++) {
			vetor[i] = i;
		}
		return vetor;
	}

	@Override
	public boolean buscaLinear_iterativa(int[] numeros, int k) {
		for(int i = 0; i<numeros.length; i++) {
			if(numeros[i] == k) return true;
		}
		return false;
	}

	@Override
	public boolean buscaLinear_recursiva(int[] numeros, int k) {
		return buscaLinearRecursiva(numeros, k, 0);
	}
	
	private boolean buscaLinearRecursiva(int[] numeros, int num, int i) {
		if(i == numeros.length) return false;
		if(num == numeros[i]) return true;
		return buscaLinearRecursiva(numeros,num,i+1);
	}

	@Override
	public boolean buscaLinear_iterativa_duasPontas(int[] numeros, int k) {
		int tam = numeros.length/2;
		if(numeros.length % 2 != 0) tam++;
		for(int i = 0; i<tam; i++) {
			if(numeros[i] == k || numeros[tam-1-i] == k) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean buscaBinaria_iterativa(int[] numeros, int k) {
		
		return false;
	}

	@Override
	public boolean buscaBinaria_recursiva(int[] numeros, int k) {
		
		return false;
	}

}
