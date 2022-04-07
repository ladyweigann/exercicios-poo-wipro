package televisao;

public class APP {

	public static void main(String[] args) {
		
		ControleRemoto controle = new ControleRemoto();
		
		controle.ligarTV();
		controle.aumentarVolume();
		controle.aumentarVolume();
		controle.aumentarVolume();
		controle.aumentarVolume();
		controle.aumentarVolume();
		controle.diminuirVolume();
		controle.diminuirVolume();
		
		controle.mudarDeCanalDown();
		controle.mudarDeCanalUp();
		controle.canalEscolhido(13);
		
		System.out.println(controle.canalAtual());
		System.out.println(controle.volumeAtual());
		
	}
}
