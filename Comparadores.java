import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

import java.util.ArrayList;
import java.util.Collections;

class Comparadores {
    public static void main(String[] args) {
        List<ObjComplexo> objList = new ArrayList<ObjComplexo>();
        TreeSet<ObjComplexo> arvoreSet = new TreeSet<>( new RegraReversa()); // Instanciar construtor com uma classe que implemente o comparator
        TreeMap<Integer,Object> arvoreMap = new TreeMap<Integer,Object>( Comparator.reverseOrder() ); // Instanciar construtor com uma classe que implemente o comparator

        objList.add(new ObjComplexo(39, "banana"));
        objList.add(new ObjComplexo(7, "abacate"));
        objList.add(new ObjComplexo(85, "manga"));
        objList.add(new ObjComplexo(30, "morango"));
        objList.add(new ObjComplexo(15, "caqui"));

        
        for(ObjComplexo o: objList){
            arvoreSet.add(o);
            arvoreMap.put(o.getNumero(), o);
        }
        
        //Ordenacao utilizando Lambda
        objList.sort((antes, depois)-> antes.getNumero() - depois.getNumero()); //Ordem crescente
        objList.sort((antes, depois)-> depois.getNumero() - antes.getNumero()); //Ordem decrescente
        
        //Ordenacao utilizando Comparators
        objList.sort(Comparator.comparingInt(ObjComplexo::getNumero));            //Ordem crescente
        objList.sort(Comparator.comparingInt(ObjComplexo::getNumero).reversed()); //Ordem decrescente

        //Ordenacao utilizando Collections
        Collections.sort(objList);                          //Assinatura só permite objetos cuja a classe imlemente o Comparable
        Collections.sort(objList, new RegraReversa());      //Assinatura permite que o primeiro parâmetro seja um List porém o segundo argumento deve ser um comparator
        
       
        
        //Ordenacao utilizando TreeSet
        arvoreSet.comparator(); //Ordem crescente        
        arvoreSet.comparator().reversed(); //Ordem decrescente

        

        //Necessario testar. Os comandos abaixo nao estao funcionando
        //Ordenacao utilizando TreeMap
        arvoreMap.comparator();   //Ordem crescente
        System.out.println(arvoreMap);
        arvoreMap.comparator().reversed();  //Ordem decrescente
     

    }
}


class ObjComplexo implements Comparable<ObjComplexo>{

    private int numero;
    private String palavra;
    
    ObjComplexo(int numero, String palavra){
        this.numero = numero;
        this.palavra = palavra;
    }

    public int getNumero(){ return this.numero; }
    public String getPalavra() { return this.palavra; }

    @Override
    public int compareTo(ObjComplexo o){
        return this.numero - o.getNumero();
    }

    @Override
    public String toString(){
        return this.getNumero() + " - " + this.getPalavra();
    }
}

class RegraReversa implements Comparator<ObjComplexo>{

    @Override
    public int compare(ObjComplexo o1, ObjComplexo o2){
        return o2.getNumero() - o1.getNumero();
    }
}
