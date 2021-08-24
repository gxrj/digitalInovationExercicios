import java.util.ArrayList;
import java.lang.Exception;
class MyList{

    public static void main(String[] args) {
        
        ArrayList<String> list = new ArrayList<String>();
        
        list.add("Ana");
        list.add("Joana");
        list.add("Mariana");
        
        try{
            list.set(3, "Luana");
        }
        catch(Exception e){
            System.out.println("Erro: "+e.getMessage());
        }
    }
}