package aula31Javaio.P1.view;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Escrita {
    public static void main(String[] args) {
        //java.io

        // criando o fluxo de entrada através de um arquivo
        try{
            FileOutputStream fos = new FileOutputStream("dados/pratos.txt");
            //System.out.println(fis.read());
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            BufferedWriter bw = new BufferedWriter(osw);
            
            try {
                FileOutputStream fos = new FileOutputStream("P1/dados/molhos.txt");
                OutputStreamWriter osw = new OutputStreamWriter(fos);
                BufferedWriter bw = new BufferedWriter(osw);
    
                bw.write("Sugo\n");
                bw.write("Branco\n");            
                bw.close();
                
            } catch (FileNotFoundException e) {
                System.out.println("Nao foi possivel encontrar o arquivo");
            } catch (IOException e) {
                System.out.println("Nao foi possivel escrever no arquivo");
            }
    
    
    }
}