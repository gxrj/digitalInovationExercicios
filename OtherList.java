import java.util.ArrayList;
import java.util.Collections;


public class OtherList {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        String[] nomes = {"Juliana", "Pedro", "Carlos", "Larissa", "Joao"};
        
        for (String nome : nomes) { list.add(nome); }

        list.forEach( item -> { System.out.println(item); } );
        list.set( list.indexOf("Carlos") , "Roberto");

        System.out.printf("Retornando elemento pos 1 = %s \n", list.get(1));

        list.remove(4);
        list.remove("Joao");
        System.out.println("Tamono da lista: " + list.size());


        var resposta = list.contains("Juliano") ? "sim" : "nao";

        System.out.println("Juliano esta na lista? "+ resposta);

        ArrayList<String> list2 = new ArrayList<String>();

        list2.add("Ismael");
        list2.add("Rodrigo");
        list.addAll(list2);

        System.out.println("Lista completa: "+list);

        Collections.sort(list);

        System.out.println("Lista ordenada: " + list);
        System.out.printf("Lista vazia? %s \n", list.isEmpty() ? "sim, esta vazia" : "nao esta vazia");

    }
}
