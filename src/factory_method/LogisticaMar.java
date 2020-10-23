package factory_method;

public class LogisticaMar extends Logistica {

	@Override
	protected Veiculo criarTransporte() {
		return new Barco();
	}

}
