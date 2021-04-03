/**
    Exercício proposto pelo vídeo da trilha: Desenvolvimento básico em Java >> Capítulo 8: Trabalhando com datas >>  Vídeo: Classe Calendar
    Bootcamp Java Inter 
*/



import java.util.Calendar;


class Exerc{

    public static void main(String args[]){

        Fatura f = new Fatura(31, 03, 2021);
        
        f.calcularDataLimite(Calendar.getInstance());
    }
}

class Fatura{
    private Calendar vcto;
    private int prazo;

    public Fatura(int dia, int mes, int ano){
        this.vcto = Calendar.getInstance();
        this.vcto.set(Calendar.YEAR, ano);
        this.vcto.set(Calendar.MONTH, mes - 1 );
        this.vcto.set(Calendar.DAY_OF_MONTH, dia);
        this.prazo = 10;  
    }

    public Calendar getVcto(){return this.vcto;}
    public int getPrazo(){return this.prazo;}


    public void calcularDataLimite(Calendar dtAtual){

        int qtdeDias = 0;
        long intervalo = 0;
        Calendar dtLimite = this.vcto;

        dtLimite.add(Calendar.DATE, this.prazo);

        if(dtLimite.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) dtLimite.add(Calendar.DATE, 2);
        if(dtLimite.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) dtLimite.add(Calendar.DATE, 1);
        
        System.out.println("Data atual: " + dtAtual.getTime());
        System.out.println("Data vencimento: " + dtLimite.getTime());

        if( dtLimite.after(dtAtual) ){
            intervalo = dtLimite.getTimeInMillis() - dtAtual.getTimeInMillis();        
            qtdeDias = (int) intervalo /(1000*3600*24);

            System.out.println("Voce tem "+qtdeDias+" dias para pagar sem juros");
        }
        else if( this.vcto.before(dtAtual) ){
            System.out.println("Em atraso, o juros sera acrescentado");
        }
        else{
            System.out.println("Voce tem ate hoje para pagar sem juros");
        }
    }
}
