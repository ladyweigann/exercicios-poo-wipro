package televisao;

public class ControleRemoto {
	
	Televisao tv = new Televisao();
	
	public void ligarTV() {
		if(tv.isLigada()) {
			System.out.println("A TV j� est� ligada");
		}else {
			tv.setLigada(true);
		}
	}
	
	public void desligarTV() {
		if(tv.isLigada()) {
			tv.setLigada(false);
		}else {
			System.out.println("A TV j� est� desligada");
		}
	}
	
	public void diminuirVolume() {
		if(tv.getVolume() > 0) {
			tv.volume--;
		}else {
			System.out.println("A tv est� no volume m�nimo");
		}
		
	}
	
	public void aumentarVolume() {
		if(tv.getVolume() < 100) {
			tv.volume++;
		}else {
			System.out.println("A tv est� no volume m�ximo");
		}
	}
	
	public void mudarDeCanalUp() {
		if(tv.getCanal() >= 1) {
			tv.canal++;
		}
	}
	
	public void mudarDeCanalDown() {
		if(tv.getCanal() > 0) {
			tv.canal--;
		} 
	}
	
	public void canalEscolhido(int canal) {
		tv.setCanal(canal);
	}
	
	public String canalAtual() {
		return "A TV est� no canal " + tv.getCanal();
	}
	
	public String volumeAtual() {
		return "A TV est� no volume " + tv.getVolume();
	}
	
}

