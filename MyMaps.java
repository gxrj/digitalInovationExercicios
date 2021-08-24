import java.util.Map;
import java.util.TreeMap;
import java.util.Set;

public class MyMaps {
    public static void main(String[] args) {
        Map<String, String> mapa = new TreeMap<>();
        
        String[] siglas = {
            "AC","AL","AP","AM",
            "BA","CE","ES","GO",
            "MA","MT","MS","MG",
            "PA","PB","PR","PE",
            "PI","RJ","RN","RS",
            "RO","RR","SC","SP",
            "SE","TO"
        };
        String[] valores = {
            "Acre","Alagoas","Amapa","Amazonas",
            "Bahia","Ceara","Espirito Santo","Goias",
            "Maranhao","Mato Grosso","Mato Grosso do Sul","Minas Gerais",
            "Para","Paraiba","Parana","Pernambuco",
            "Piaui","Rio de Janeiro","Rio Grande do Norte","Rio Grande do Sul",
            "Rondonia","Roraima","Santa Catarina","Sao Paulo",
            "Sergipe","Tocantis"
        };

        int i = 0;
        for(String key : siglas){
            mapa.put(key, valores[i]);
            i++;
        }

        System.out.println(mapa);
        mapa.remove("MG", mapa.get("MG"));
        System.out.println(mapa);
        mapa.put("DF", "Distrito Federal");
        System.out.println(mapa);

        System.out.println(mapa.size());

        mapa.remove("Mato Grosso do Sul");
        Set<Map.Entry<String,String>> entradas = mapa.entrySet();

        entradas.forEach(
            item -> {
               System.out.printf("%s (%s) \n", item.getValue(), item.getKey());
            });
    
        System.out.println("SC? " + mapa.containsKey("SC")); 
        System.out.println("Maranhao? " + mapa.containsValue("Maranhao"));
    }
}
