package abstract_factory;

public class SofaModerno extends Sofa {

	@Override
	public int densidade() {
		return 120;
	}

	@Override
	public Boolean eDeCouro() {
		return false;
	}

	@Override
	protected void setDensidade_(int i) {
		// TODO Auto-generated method stub
		
	}

}
