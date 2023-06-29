package br.com.senaisp.bauru.richard.classes;

public class Prisioneiro {
	private static int qtdePrisioneiros = 0;
	//propriedades do prisioneiro
	private String nome;
	private double altura;
	private double detencao;
	//comportamentos do prisioneiro
	
	//constructor padrão
	
	public Prisioneiro() {
		this("sem nome",0.50,0.01);
		/* nome = "sem nome";
		altura = 0.50;
		detencao = 0.01; */
	}
	
	//constructor com parâmetros
	public Prisioneiro(String nom, double alt, double det) {
		setNome(nom);
		setAltura(alt);
		setDetencao(det);
		qtdePrisioneiros++;
	}
	
	@Override
	public String toString() {
		return "-".repeat(10)+
			   "\nNome: " + nome + 
			   "\nAltura: " + altura +
			   "\nDetenção: " + detencao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome == null) {
			System.out.println("Valor inválido para o nome!");
		}
		this.nome = nome;
	}
	public void setDetencao(double detencao) {
		if (detencao<0.01 || detencao > 160.00) {
			System.out.println("Detenção inválida!");
		}
		this.detencao = detencao;
	}
	public void setAltura(double altura) {
		if (altura<0.01 || altura > 5.00) {
			System.out.println("Altura inválida!");
		}
		this.altura = altura;
	}

	public double getDetencao() {
		return detencao;
	}

	public double getAltura() {
		return altura;
	}
	
	public static int getQtdePrisioneiros() {
		return qtdePrisioneiros;
	}
}
