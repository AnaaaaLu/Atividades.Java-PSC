package Lista7OO.Lista704;

public class Proprietario {
       private String nome;
       private String endereco;
       private char sexo;
       private String cpf;
       private String cnh;

       public Proprietario(String nome, String endereco, char sexo, String cpf, String cnh) {
              this.nome = nome;
              this.endereco = endereco;
              this.sexo = sexo;
              this.cpf = cpf;
              this.cnh = cnh;
       }

       public String getNome() {
              return this.nome;
       }

       public void setNome(String nome) {
              this.nome = nome;
       }

       public String getEndereco() {
              return this.endereco;
       }

       public void setEndereco(String endereco) {
              this.endereco = endereco;
       }

       public char getSexo() {
              return this.sexo;
       }

       public void setSexo(char sexo) {
              this.sexo = sexo;
       }

       public String getCpf() {
              return this.cpf;
       }

       public void setCpf(String cpf) {
              this.cpf = cpf;
       }

       public String getCnh() {
              return this.cnh;
       }

       public void setCnh(String cnh) {
              this.cnh = cnh;
       }

       @Override
       public String toString() {
              return this.nome;
       }
}
