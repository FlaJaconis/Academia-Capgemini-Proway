package modulo2.aula19_TipoPorValorETipoporReferencia;

public class StringsMain {
    public static void main(String[] args) {
        String nome = "Inês";  
        String nome2 = "inês";     
    
        boolean igual =  nome.toUpperCase().equals(nome2.toUpperCase());     
       
        System.out.println( igual );
        System.out.println( nome );
        System.out.println( nome2 );          
        
    }
}
