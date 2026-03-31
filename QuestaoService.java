package br.com.ucsal.olimpiadas;

import java.util.List;
import java.util.Scanner;

public class QuestaoService {

    private List<Questao> questoes;
    private List<Prova> provas;
    private long proximaQuestaoId;
    private Scanner in;

    public QuestaoService(List<Questao> questoes, List<Prova> provas, long proximaQuestaoId, Scanner in) {
        this.questoes = questoes;
        this.provas = provas;
        this.proximaQuestaoId = proximaQuestaoId;
        this.in = in;
    }

    public void cadastrar() {
    	if (provas.isEmpty()) {
    		System.out.println("não há provas cadastras");
    		return;
    	}
    	
    System.out.println("\nProvas:");
    
    for (Prova p : provas) {
    	System.out.printf("%d) %s%n", p.getId(), p.getTitulo());
    }
    
    System.out.print("Escolha o id da prova:");
    
    Long provaId;
    
    try {
    	provaId = Long.parseLong(in.nextLine());
    }catch (Exception e) {
    	System.out.println("entrada invalida");
    	return;
    }
    
    System.out.println("Enunciado:");
    String enunciado = in.nextLine();

    String[] alternativas = new String[5];

    for (int i = 0; i < 5; i++) {

        char letra = (char) ('A' + i);

        System.out.print("Alternativa " + letra + ": ");

        alternativas[i] = letra + ") " + in.nextLine();
    }

    System.out.print("Alternativa correta (A–E): ");

    char correta;

    try {
        correta = Questao.normalizar(in.nextLine().trim().charAt(0));
    } catch (Exception e) {
        System.out.println("alternativa inválida");
        return;
    }

    Questao q = new Questao();

    q.setId(proximaQuestaoId++);
    q.setProvaId(provaId);
    q.setEnunciado(enunciado);
    q.setAlternativas(alternativas);
    q.setAlternativaCorreta(correta);

    questoes.add(q);

    System.out.println("Questão cadastrada: " + q.getId());
}
    }
    