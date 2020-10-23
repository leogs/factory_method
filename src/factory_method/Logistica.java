package factory_method;

import java.util.ArrayList;
import java.util.List;

public abstract class Logistica {
	private final List<Veiculo> veiculos = new ArrayList<>();
	
	public void planejarEntrega(String dataEntrega) {
	
	}
	
	protected abstract Veiculo criarTransporte();
	
	public void novoTransporte() {
		Veiculo veiculo = criarTransporte();
		veiculos.add(veiculo);
	}
}
