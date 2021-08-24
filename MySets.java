public class MySets {
    public static void main(String[] args) {
        java.util.Set<Integer> conjunto = new java.util.HashSet<>();
        java.util.LinkedHashSet<Integer> conjuntoEmLista = new java.util.LinkedHashSet<>();
        java.util.TreeSet<Integer> conjuntoEmArvore = new java.util.TreeSet<>();
        

        int[] numeros = {3,88,20,44,3};

        for (int num: numeros) {
            conjunto.add(num);
            conjuntoEmLista.add(num);
            conjuntoEmArvore.add(num);
        }

        //O iterator deve ser instaciado após o conjunto ser preenchido
        java.util.Iterator<Integer> iterador = conjunto.iterator();
        java.util.Iterator<Integer> iteradorLista = conjuntoEmLista.iterator();
        java.util.Iterator<Integer> iteradorArvore = conjuntoEmArvore.iterator();

        System.out.print("novo hashset: ");
        while(iterador.hasNext()){ System.out.printf("%d ",iterador.next()); }
        System.out.println("");

        System.out.print("novo listset: ");
        while(iteradorLista.hasNext()){ System.out.printf("%d ",iteradorLista.next()); }
        System.out.println("");

        System.out.print("novo treeset: ");
        while(iteradorArvore.hasNext()){ System.out.printf("%d ",iteradorArvore.next()); }
        System.out.println("");

        int i = 0;
        for(int item : conjunto){
            if(i == 0) conjunto.remove(item);
            /**Removendo um item a lista é desfeita e torna-se impossível percorre-lá
             * por isso o break; foi colocado no lugar do i++;
            */
            break;
        }
        System.out.println("\nhashset primeiro item removido: "+ conjunto);

        i=0;
        for(int item : conjuntoEmLista){
            if(i == 0) conjuntoEmLista.remove(item);
            /**Removendo um item a lista é desfeita e torna-se impossível percorre-lá
             * por isso o break; foi colocado no lugar do i++;
            */
            break;
        } 
        System.out.println("listset primeiro item removido: "+ conjuntoEmLista);  

        i=0;     
        for(int item : conjuntoEmArvore){
            if(i == 0) conjuntoEmArvore.remove(item);
            /**Removendo um item a lista é desfeita e torna-se impossível percorre-lá
             * por isso o break; foi colocado no lugar do i++;
            */
            break;
        }

        System.out.println("treeset primeiro item removido: "+ conjuntoEmArvore);
        
        conjunto.add(23);
        conjuntoEmLista.add(23);
        conjuntoEmArvore.add(23);

        System.out.println("\nhashset atualizado: "+conjunto);
        System.out.println("listset atualizado: "+conjuntoEmLista);
        System.out.println("treeset atualizado: "+conjuntoEmArvore);

        System.out.println("\nhashset tamanho: "+conjunto.size());
        System.out.println("listset tamanho: "+conjuntoEmLista.size());
        System.out.println("treeset tamanho: "+conjuntoEmArvore.size());

        System.out.println("\nhashset vazio? "+conjunto.isEmpty());
        System.out.println("listset vazio? "+conjuntoEmLista.isEmpty());
        System.out.println("treeset vazio? "+conjuntoEmArvore.isEmpty());

    }
}
