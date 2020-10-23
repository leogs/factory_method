package abstract_factory;

public class CadeiraPraia extends Cadeira {

	@Override
	public int quantidadePernas() {
		return 2;
	}

	@Override
	public String cor() {
		return "Amarelo";
	}

}
