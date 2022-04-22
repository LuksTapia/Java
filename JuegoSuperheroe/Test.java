package ejercicio11;


public class Test {
	public static void main(String[] args) {
		
		Superheroe batman;
		batman = new Superheroe("Batman", 80, 70, 0);
		Superheroe superman = new Superheroe("Superman", 95, 60, 70);
		Superheroe superHelena = new Superheroe("Super Helena", 70, 85, 80);
		Superheroe darkPaladin = new Superheroe("Dark Paladin", 1200, 90, 95);
		
		
		System.out.println(batman);
		System.out.println(darkPaladin);
		System.out.println(superman);
		System.out.println(superHelena);
		
		
		batman.mostrarResultado(superHelena);
		darkPaladin.mostrarResultado(superHelena);
		superman.mostrarResultado(darkPaladin);
		
		
		
		
		
		
		
	}

}
