package executioner;
import java.util.HashMap;
import java.util.Map;

public class StartBugs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		listSiglas();

	}
	
	
	public static void listSiglas() {
		HashMap<String, String> mapaEstados = getMapa();
	    
		//mostra apenas a chave, SIGLA no caso
		for (String sigla : mapaEstados.keySet()) {
	        System.out.print(sigla + " ");
	    }
	    
		//mostra todo o objeto
		for (Map.Entry<String, String> entrada : mapaEstados.entrySet()) {
			System.out.println(">> " + entrada);
	    }
		
		for (Map.Entry<String, String> entrada : mapaEstados.entrySet()) {
		    System.out.println(entrada.getKey());//chave no caso a sigla
		    System.out.println(entrada.getValue());//valor no caso o nome do estado
		}
		
		for (String valor : mapaEstados.values()) {
		    System.out.println(valor);//valor no caso o nome do estado
		}
		
		System.out.println("Estado: " + pegaEstadoPorExtenso("AM"));
		
		//IMPRIME OS KEYSET DA MESMA FORMA QUE O PRIMEIRO EXEMPLO, NO CASO AS SIGLAS
		mapaEstados.keySet().stream().forEach(System.out::println);
		
		//IMPRIME AS CHAVES E OS VALORES
		mapaEstados.forEach((sigla, estado) -> System.out.println(sigla + " "));
		
		//IMPRIME APENAS OS VALORES
		mapaEstados.values().stream().forEach(System.out::println);
		
		
	}
	
	
	public static String pegaEstadoPorExtenso(String sigla){
        HashMap<String, String> mapa = getMapa();
        return mapa.get(sigla);
	}
	
	public static HashMap<String, String> getMapa() {
	      HashMap<String, String> map = new HashMap<>();
	      map.put("AC", "Acre");
	      map.put("AL", "Alagoas");
	      map.put("AP", "Amapá");
	      map.put("AM", "Amazonas");
	      map.put("BA", "Bahia");
	      map.put("CE", "Ceará");
	      map.put("DF", "Distrito Federal");
	      map.put("ES", "Espírito Santo");
	      map.put("GO", "Goiás");
	      //resto dos put()
	      return map;
	}

}
