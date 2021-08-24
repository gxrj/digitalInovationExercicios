import java.util.Queue;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class Filas {
    
    public static void main(String[] args) {
    
        Queue<String> fila = new LinkedList<String>();
    
        String[] nomes = {"Juliana", "Pedro", "Carlos", "Larissa", "Joao"};
        for (String nome : nomes) { fila.add(nome);  }

        fila.forEach( elemento -> System.out.printf( "%s -- ", elemento) );

        try{
            fila.element();
        }catch(NoSuchElementException e){
            System.out.println( "Erro: " + e.getMessage() );
        }

        System.out.println("Primeiro da fila: " + fila.poll());
        fila.add("Daniel");
        
        System.out.println("Fila atualizada: " + fila);
        System.out.println("Tamanho da lista: " + fila.size());

        System.out.printf("A fila esta vazia? %s \n", fila.isEmpty() ? "sim, esta vazia" : "nao esta vazia");

        System.out.printf("Carlos esta na fila? %s \n", fila.contains("Carlos") ? "sim, esta na fila" : "nao se encontra na fila");
    }
    
    
}
