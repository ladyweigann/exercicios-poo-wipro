package formasGeometricas;

public class Circulo implements FormasGeometricas {
	
	@Override
	public String cor() {
		
		return null;
	}

	@Override
	public String quantidadeDeLados() {
		
		return null;
	}

	@Override
	public double area(double a, double b) {
		return Math.PI * (Math.pow(a, 2));
	}

	
}
