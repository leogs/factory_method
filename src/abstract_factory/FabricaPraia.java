package abstract_factory;

public class FabricaPraia implements FabricaMoveis {

	@Override
	public Cadeira criarCadeira() {
		return new CadeiraPraia();
	}

	@Override
	public Mesa criarMesa() {
		return new MesaPraia();
	}

	@Override
	public Sofa criarSofa() {
		return new SofaPraia();
	}

}
