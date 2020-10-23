package abstract_factory;

public class SofaPraia extends Sofa {
	private int densidade_ = 80;
	
	@Override
	public int densidade() {
		return densidade_;
	}

	@Override
	public Boolean eDeCouro() {
		return false;
	}

	public int getDensidade_() {
		return densidade_;
	}

	@Override
	public void setDensidade_(int densidade_) {
		this.densidade_ = densidade_;
	}
	
	

}
