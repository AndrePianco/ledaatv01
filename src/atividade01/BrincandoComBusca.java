package atividade01;

public class BrincandoComBusca {

	public static void main(String[] args) {
		
		//Exemplo para nortear o experimento...
		
		Busca_IF b = new Busca();
		final int numeroParaBuscar = -1; 
		
		final int[] vetor1000 = b.geraVetorNumericoOrdenado(10000000);
		
		//o de cima ta feito
		
		long antes, depois;
		
		antes = System.nanoTime(); //08:52
		b.buscaLinear_iterativa(vetor1000, numeroParaBuscar);
		depois = System.nanoTime(); //08:55
		System.out.println("buscaLinear_iterativa:\t"+getSeconds(depois-antes)); // 55-52 = 3 min
		
		antes = System.nanoTime();
		b.buscaLinear_iterativa_duasPontas(vetor1000, numeroParaBuscar);
		depois = System.nanoTime();
		System.out.println("buscaLinear_iterativa2:\t"+getSeconds(depois-antes));

		
		antes = System.nanoTime();
		b.buscaLinear_recursiva(vetor1000, numeroParaBuscar);
		depois = System.nanoTime();
		System.out.println("buscaLinear_recursiva:\t"+getSeconds(depois-antes));
		
		/*
		antes = System.nanoTime();
		b.buscaBinaria_iterativa(vetor1000, numeroParaBuscar);
		depois = System.nanoTime();
		System.out.println("buscaBinaria_iterativa:\t"+(depois-antes));
		
		antes = System.nanoTime();
		b.buscaBinaria_recursiva(vetor1000, numeroParaBuscar);
		depois = System.nanoTime();
		System.out.println("buscaBinaria_recursiva:\t"+(depois-antes));
		*/
	}
	
	public static double getSeconds(long nanoTime) {
		return nanoTime/1000000000.0;
	}


}