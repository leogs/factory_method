package factory_method;

public class Barco implements Veiculo {
	public int motor;
	public String tamanho;
	
	@Override
	public void entregar() {
		System.out.println("Entregar por mar em um contêiner");
	}

	public int getMotor() {
		return motor;
	}

	public void setMotor(int motor) {
		this.motor = motor;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	
	

}
