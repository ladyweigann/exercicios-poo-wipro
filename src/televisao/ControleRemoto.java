package televisao;

public class ControleRemoto {
	
	Televisao tv = new Televisao();
	
	public void ligarTV() {
		if(tv.isLigada()) {
			System.out.println("A TV já está ligada");
		}else {
			tv.setLigada(true);
		}
	}
	
	public void desligarTV() {
		if(tv.isLigada()) {
			tv.setLigada(false);
		}else {
			System.out.println("A TV já está desligada");
		}
	}
	
	public void diminuirVolume() {
		if(tv.getVolume() > 0) {
			tv.volume--;
		}else {
			System.out.println("A tv está no volume mínimo");
		}
		
	}
	
	public void aumentarVolume() {
		if(tv.getVolume() < 100) {
			tv.volume++;
		}else {
			System.out.println("A tv está no volume máximo");
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
		return "A TV está no canal " + tv.getCanal();
	}
	
	public String volumeAtual() {
		return "A TV está no volume " + tv.getVolume();
	}
	
}

