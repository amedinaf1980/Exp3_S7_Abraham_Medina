package teatromoro;

import java.text.DecimalFormat;

public class Decorativo {
	public static final int ANCHO_CONSOLA = 24;
	public static DecimalFormat formatoPrecio = new DecimalFormat("$###,###,###");
	
	public static void separadorLinea() {
		System.out.println("\n\n");
		ColorTexto.colorTexto("_".repeat(ANCHO_CONSOLA * 2) + "\n", ColorTexto.AMARILLO);
		ColorTexto.colorTexto("-".repeat(ANCHO_CONSOLA) + "\n", ColorTexto.AMARILLO);
	}

	public static void separadorSegmentadoCyan() {
		ColorTexto.colorTexto("-".repeat(ANCHO_CONSOLA + 10) + "\n", ColorTexto.CYAN);
	}
	
	public static void separadorSegmentadoCyanNegro() {
		ColorTexto.colorTexto("-".repeat(ANCHO_CONSOLA + 10) + "\n", ColorTexto.CYAN_NEGRO);
	}

	public static void separadorSegmentadoCentro() {
		ColorTexto.colorTexto("-".repeat(ANCHO_CONSOLA * 2) + "\n", ColorTexto.CYAN);
	}
}