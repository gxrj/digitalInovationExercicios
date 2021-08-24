
import java.time.LocalDateTime;


class LDT{

    public static void main(String[] args){
        LocalDateTime firstLocalDateTime = LocalDateTime.of(2010, 05, 15, 10, 00,00);
        LocalDateTime lastLocalDateTime = firstLocalDateTime.plusYears(4).plusMonths(6).plusHours(13);
       
        System.out.println("LocalDateTime Antes: " + firstLocalDateTime);
        System.out.println("LocalDateTime Depois: " + lastLocalDateTime);

    }
    
}