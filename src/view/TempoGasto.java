package view;
//Gera o tempo gasto para percorrer e preencher os vetores com 1.000, 10.000 e 100.000 posicoes
public class TempoGasto{
	
    public static void main(String[] args) {
        int mil[] = new int[1000];
        int dezMil[] = new int[10000];
        int cemMil[] = new int[100000];
        double tempoInicial = 0;
        double tempoFinal = 0;
        double tempoGeral = 0;
       
        tempoInicial = System.nanoTime(); //Atribui para a variável o horário em nanosegundos no momento em que a linha de código for compilada
        
        for (int posicao : mil) {
            mil[posicao] = 0;
        }
        tempoFinal = System.nanoTime();	
        
        tempoGeral = tempoFinal - tempoInicial;	//Calcula o tempo gasto para atribuir todos os valores ao vetor
        
        System.out.println("Tempo gasto para preencher o vetor com 1.000 valores: "+tempoGeral+" nS");
        
        tempoInicial = System.nanoTime();
        for (int posicao : dezMil) {
            dezMil[posicao] = 0;
        }
        tempoFinal = System.nanoTime();	
        tempoGeral = tempoFinal - tempoInicial;
        
        System.out.println("Tempo gasto para preencher o vetor com 10.000 valores: "+tempoGeral+" nS");
        
        tempoInicial = System.nanoTime();
        for (int posicao : cemMil) {
            cemMil[posicao] = 0;
        }
        tempoFinal = System.nanoTime();	
        tempoGeral = tempoFinal - tempoInicial;
        
        System.out.println("Tempo gasto para preencher o vetor com 100.000 valores: "+tempoGeral+" nS");
    }
}