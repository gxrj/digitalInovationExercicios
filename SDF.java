
import java.text.SimpleDateFormat;
import java.util.Date;

public class SDF {

    public static void main(String[] args){

        Date date = new Date();
        SimpleDateFormat mascara = new SimpleDateFormat("dd/MM/YY HH:mm:ss:SSS");
        System.out.println("Formatando: "+mascara.format(date));

    }
}
