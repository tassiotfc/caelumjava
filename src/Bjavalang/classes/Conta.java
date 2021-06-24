package Bjavalang.classes;

public class Conta {
	private String titular;
	private double saldo;
	private int numero;
	private String agencia;
	
	
	
	public Conta(String titular, double saldo, int numero, String agencia) {
		this.titular = titular;
		this.saldo = saldo;
		this.numero = numero;
		this.agencia = agencia;
	}
	
		
	@Override
	public String toString() {
		return "Conta [titular=" + titular + ", saldo=" + saldo + ", numero=" + numero + ", agencia=" + agencia + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null)
			return false;
		if(!(obj instanceof Conta))
			return false;
		Conta outraConta = (Conta) obj;
		return (this.numero == outraConta.numero &&
				this.agencia.equals(outraConta.agencia));
	}
	
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

}
