package utilidades;

//EJ31
public class StringUtil {
	
	public static void main(String[] args) {
//		System.out.println(insert("Hola", "adios", 2));
//		System.out.println(insert("Hola", "adios", 0));
//		System.out.println(insert("Hola", "adios", 7));
		
//		System.out.println(delete("Hola", 1, 2));
//		System.out.println(delete("Hola", 0, 2));
//		System.out.println(delete("Hola", 0, 5));

//		System.out.println(indexOf("Hola", "ol"));
//		System.out.println(indexOf("Hola", "Ol"));
//		System.out.println(indexOf("Hola", "H"));
//		System.out.println(indexOf("Hola", "a"));
//		System.out.println(indexOf("Hola", "Hola"));

		System.out.println(replace("Hola que tal", "que", "x"));
		System.out.println(replace("Hola que tal", "que", "xxx"));
		System.out.println(replace("Hola que tal", "que", "xxxxx"));
	}

	public static String insert(String cadena, String insertado, int pos) {
		if (pos >= cadena.length())
			return cadena;
		return cadena.substring(0, pos) + insertado + cadena.substring(pos);
	}
	
	//hasta sin incluir
	public static String delete(String cadena, int desde, int hasta) {
		if (desde < 0 || hasta <= desde || hasta > cadena.length())
			return cadena;
		return cadena.substring(0, desde) + cadena.substring(hasta);
	}
	
	public static int indexOf(String cadena, String buscado) {
		int resu = -1;
		for (int i = 0; i < cadena.length() - buscado.length() + 1; i++) {
			if (cadena.substring(i, i + buscado.length()).equals(buscado))
				resu = i;
		}
		return resu;
	}

	
	//	NO FUNCIONA
	public static String replace(String cadena, String buscado, String reemplazo) {
		if(indexOf(cadena, buscado) == -1)
			return cadena;
		return cadena.substring(0, indexOf(cadena, buscado)) + reemplazo + 
				(buscado.length() > reemplazo.length() ? cadena.substring(cadena.length()-buscado.length() - 1) 
													   : cadena.substring(cadena.length()-reemplazo.length() - 1));
	}
	
	public static String capitalize(String cadena) {
		return null;
	}
	
	public static int cuentaPalabras(String cadena) {
		return 0;
	}
	
	public static int cuentaParrafos(String cadena) {
		return 0;
	}
}
