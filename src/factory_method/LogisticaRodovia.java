package factory_method;

public class LogisticaRodovia extends Logistica{

	@Override
	public Veiculo criarTransporte() {
		return new Caminhao();
	}
	
}
