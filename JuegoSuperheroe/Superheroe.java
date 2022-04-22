package ejercicio11;

public class Superheroe {

	private int valor1;
	private int contador;

	private String nombre;
	private int fuerza;
	private int resistencia;
	private int superpoderes;

	public Superheroe(String nombre, int fuerza, int resistencia, int superpoderes) {
		setNombre(nombre);
		setFuerza(fuerza);
		setResistencia(resistencia);
		setSuperpoderes(superpoderes);
	}
	
	

	private void setNombre(String nombre) {
		if (nombre.isEmpty()) {
			System.out.println("No ingresó nombre");
		} else {
			this.nombre = nombre;
		}
	}
	
	private static int getValor(int valor) {
		final int VALOR_MINIMO = 0, VALOR_MAXIMO = 100;
		if (valor >= VALOR_MAXIMO) {
			return VALOR_MAXIMO;
		} else if (valor <= VALOR_MINIMO) {
			return VALOR_MINIMO;
		} else {
			return valor;	
	}
		
	}

	private void setFuerza(int fuerza) {
		this.fuerza = Superheroe.getValor(fuerza);
	
	}
	
	private void setResistencia(int resistencia) {
		this.resistencia = Superheroe.getValor(resistencia);
	}

	private void setSuperpoderes(int superpoderes) {
		this.superpoderes = Superheroe.getValor(superpoderes);
	}

	@Override
	public String toString() {
		return "El superheroe " + nombre + " posee los siguientes atributos: " + this.fuerza + " de fuerza,\n "
				+ this.resistencia + " de resistencia, y " + this.superpoderes + " de superpoderes.";
	}
	
	public void comparar(Superheroe superheroe) {
		if (this.valor1 > superheroe.valor1) {
			this.contador++;
		} else if (superheroe.valor1 > this.valor1){
			superheroe.contador ++;
		}
	}
	

	private void competirFuerza(Superheroe superheroe) {
		this.valor1 = this.fuerza;
		superheroe.valor1 = superheroe.fuerza;
		comparar(superheroe);
	}

	private void competirResistencia(Superheroe superheroe) {
		this.valor1 = this.resistencia;
		superheroe.valor1 = superheroe.resistencia;
		comparar(superheroe);
		
	}

	private void competirSuperPoderes(Superheroe superheroe) {
		this.valor1 = this.superpoderes;
		superheroe.valor1 = superheroe.superpoderes;
		comparar(superheroe);
	}

	public Resultado competir(Superheroe superheroe) {
		Resultado resultado = null;
		competirFuerza(superheroe);
		competirResistencia(superheroe);
		competirSuperPoderes(superheroe);
		if (this.contador > superheroe.contador) {
			resultado = Resultado.VICTORIA;
		} else if (this.contador < superheroe.contador ) {
			resultado = Resultado.DERROTA;
		} else {
			resultado = Resultado.EMPATE;
		}
		return resultado;

	}
	
	public void mostrarResultado(Superheroe superheroe) {
		System.out.println(competir(superheroe));
	}

}
