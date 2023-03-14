package entidades;

public class Funcionario {
	private String nome;
	private Double salarioBruto;
	private Double imposto;
	private Double salarioLiquido;
	
	public Funcionario(String nome, Double salarioBruto, Double imposto) {
		this.nome = nome;
		this.salarioBruto = salarioBruto;
		this.imposto = imposto;
		calculaSalarioLiquido(salarioBruto, imposto);
	}
	
	public void calculaSalarioLiquido(Double SalarioBruto, Double imposto) {
		this.salarioLiquido = salarioBruto - imposto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalarioBruto() {
		return salarioBruto;
	}

	public void setSalarioBruto(Double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(Double imposto) {
		this.imposto = imposto;
	}
	
	public Double getSalarioLiquido() {
		return salarioLiquido;
	}

	@Override
	public String toString() {
		return nome+ " R$ "+String.format("%.2f", salarioLiquido);
	}
	
	public void reajusteSalario(Double percentual) {
		salarioBruto += salarioBruto * percentual / 100;
		calculaSalarioLiquido(salarioBruto, imposto);
	}
}
