package factory_method;

public class LogisticaAerea extends Logistica{

	@Override
	protected Veiculo criarTransporte() {
		return new Aviao();
	}

}
