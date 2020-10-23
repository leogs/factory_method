package abstract_factory;

public class FabricaVitoriana implements FabricaMoveis{

	@Override
	public Cadeira criarCadeira() {
		return new CadeiraVitoriana();
	}

	@Override
	public Mesa criarMesa() {
		return new MesaVitoriana();
	}

	@Override
	public Sofa criarSofa() {
		return new SofaVitoriano();
	}

}
