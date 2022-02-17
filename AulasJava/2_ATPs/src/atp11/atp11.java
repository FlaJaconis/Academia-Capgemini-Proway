package exerc_revisao;

import java.util.Scanner;

public class atp11{
       public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        short op;
        
        char voltarMenu = 'N';
        
        do{
            System.out.print("\n=========== BRADESCO FINANCIAMENTOS ===========");
            System.out.println("\nEscolha uma opção: "+
                            "\n1 - Crédito Pessoal" +
                            "\n2 - Crédito Imobiliário" +
                            "\n3 - Crédito Empresarial" +
                            "\n4 - Empréstimo Consignado");
                            
             op = Short.parseShort(sc.nextLine());
            

             switch (op){
                
                 case 1:
                 System.out.printf("Você escolheu a opção %d - Crédito Pessoal", op);
                 break;

                 case 2:
                 System.out.printf("Você escolheu a opção %d - Crédito Imobiliário", op);
                 break;

                 case 3:
                 System.out.printf("Você escolheu a opção %d - Crédito Empresarial", op);
                 break;

                 case 4:
                 System.out.printf("Você escolheu a opção %d - Empréstimo Consignado", op);
                 break;

                 default:
                 System.out.println("Opção inválida! Digite uma opção de 1 a 4.");
                 
                 break;
             }                          
             
             if(op >= 1 && op <= 4 ){
                do{
                    System.out.print("\nSe desejar voltar ao menu digite V e para sair digite S: ");
                    voltarMenu = sc.nextLine().toUpperCase().charAt(0);    

                }while(voltarMenu!='V' && voltarMenu!='S');
            }
        }      
          
        while(op < 1 || op > 4 || voltarMenu == 'V');
           
        sc.close();
    }
}
