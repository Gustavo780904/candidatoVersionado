package exercicioCandidatoVersionado;

import java.util.Locale;
import java.util.Scanner;

public class candidatoVersionado {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int escolaridade, expProfissional, pontosEscola, pontosExp;
		char disponibilidade, habilitacao;
		
		// Leitura da escolaridade
		System.out.println("Qual sua escolaridade?");
		System.out.println("1) Ensino Fundamental");
		System.out.println("2) Ensino M�dio");
		System.out.println("3) Ensino Superior");
		System.out.println("4) P�s-gradua��o");
		System.out.print("Digite uma op��o: ");
		
		escolaridade = sc.nextInt();
		System.out.println();
		// Leitura dos demais dados
		
		System.out.print("Voc� tem quantos anos de experi�ncia profissional? ");
		expProfissional = sc.nextInt();
		System.out.print("Voc� tem disponibilidade para viajar (S/N)? ");
		disponibilidade = sc.next().charAt(0);
		System.out.print("Voc� tem habilita��o de motorista (S/N)? ");
		habilitacao = sc.next().charAt(0);
		System.out.println();
		// Calculos da pontua��o
		
		if (escolaridade == 1) {
			pontosEscola = 10;
		}
		else if (escolaridade == 2) {
			pontosEscola = 20;
		}
		else if (escolaridade == 3) {
			pontosEscola =30;
		}
		else {
			pontosEscola = 40;
		}
		System.out.println("Pontos por escolaridade: " + pontosEscola);
		sc.close();
		
		if (expProfissional == 0) {
			pontosExp = 0;
		}
		else if (expProfissional > 0 && expProfissional <= 2) {
			pontosExp = 10;
		}
		else if (expProfissional > 2 && expProfissional <= 5) {
			pontosExp = 20;
		}
		else {
			pontosExp = 40;
		}
		System.out.println("Pontos por experi�ncia: " + pontosExp);	
			
		sc.close();	
		
	}

}
