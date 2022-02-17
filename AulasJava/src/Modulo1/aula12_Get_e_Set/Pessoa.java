package modulo2.aula12_Get_e_Set;
public class Pessoa{
   private String nome;
   private String sobrenome;
   private String cpf;
   private int idade;

   public void setNome(String nome){
         this.nome = nome;
   }
   public String getNome(){
      return this.nome;
   }

   public void setSobrenome(String sobrenome){
      this.sobrenome = sobrenome;
   }
   public String getSobrenome(){
      return this.sobrenome;
   }

   public void setCPF(String cpf){
      this.cpf = cpf;
   }
   public String getCPF(){
      return this.cpf;
   }

   public void setIdade(int idade){
      this.idade = idade;
   }
   public int getIdade(){
      return this.idade;
   }
}