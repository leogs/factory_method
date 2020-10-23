package abstract_factory;

public class SofaVitoriano extends Sofa{

	@Override
	public int densidade() {
		return 180;
	}

	@Override
	public Boolean eDeCouro() {
		return true;
	}

	@Override
	protected void setDensidade_(int i) {
		// TODO Auto-generated method stub
		
	}

}
