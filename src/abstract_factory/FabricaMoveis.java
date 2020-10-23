package abstract_factory;

public interface FabricaMoveis {

	public Cadeira criarCadeira();
	public Mesa criarMesa();
	public Sofa criarSofa();
	
	public static FabricaMoveis obterFabrica(String tipo) {
		if (tipo == "Vitoriano") {
			return new FabricaVitoriana();
		} else if (tipo == "Moderno") {
			return new FabricaModerna();
		} else if (tipo == "Praia") {
			return new FabricaPraia();
		}
		
		return null;		
	}
}
