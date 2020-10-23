package factory_method;

public class Caminhao implements Veiculo {
	public int quantidadeRodas;
	public String modelo;
	
	@Override
	public void entregar() {
		System.out.println("Entregar por terra em uma caixa");
		
	}
	
	public int getQuantidadeRodas() {
		return quantidadeRodas;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setQuantidadeRodas(int quantidadeRodas) {
		this.quantidadeRodas = quantidadeRodas;
	}
	
}
