package abstract_factory;

public class Cliente {
	
	public static void main(String[] args) {
		FabricaMoveis minhaFabrica = FabricaMoveis.obterFabrica("Praia");
		
		Cadeira minhaCadeira = minhaFabrica.criarCadeira();
		Sofa meuSofa = minhaFabrica.criarSofa();
		
		System.out.println("A cor da cadeira é:" + minhaCadeira.cor() + " E a densidade do sofá: " + meuSofa.densidade());

		meuSofa.setDensidade_(120);
		
		System.out.println("A cor da cadeira é:" + minhaCadeira.cor() + " E a densidade do sofá: " + meuSofa.densidade());

	}

}