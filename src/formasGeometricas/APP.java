package formasGeometricas;

public class APP {

	public static void main(String[] args) {
		Circulo c1 = new Circulo();
		Quadrado q1 = new Quadrado();
		Retangulo r1 = new Retangulo();
		TrianguloRetangulo t1 = new TrianguloRetangulo();
		
		System.out.println(c1.area(10, 0)); //pi * (r * r)
		System.out.println(q1.area(4, 0)); // l * l
		System.out.println(r1.area(3, 5)); // b * h
		System.out.println(t1.area(5, 2)); //b * h/2
	}
}
