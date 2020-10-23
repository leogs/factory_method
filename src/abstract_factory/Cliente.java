package abstract_factory;

public class Cliente {
	
	public static void main(String[] args) {
		FabricaMoveis minhaFabrica = FabricaMoveis.obterFabrica("Praia");
		
		Cadeira minhaCadeira = minhaFabrica.criarCadeira();
		Sofa meuSofa = minhaFabrica.criarSofa();
		
		System.out.println("A cor da cadeira �:" + minhaCadeira.cor() + " E a densidade do sof�: " + meuSofa.densidade());

		meuSofa.setDensidade_(120);
		
		System.out.println("A cor da cadeira �:" + minhaCadeira.cor() + " E a densidade do sof�: " + meuSofa.densidade());

	}

}