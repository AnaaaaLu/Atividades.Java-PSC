package Lista7OO.Lista705;

public class ItemNotaFiscal {
       private String descricao;
       private double preco;
       private double quantidade;
       private double ICMS;

       public ItemNotaFiscal(String descricao, double preco, double quantidade, double ICMS) {
              this.descricao = descricao;
              this.preco = preco;
              this.quantidade = quantidade;
              this.ICMS = ICMS;
       }

       public String getDescricao() {
              return this.descricao;
       }

       public void setDescricao(String descricao) {
              this.descricao = descricao;
       }

       public double getPreco() {
              return this.preco;
       }

       public void setPreco(double preco) {
              this.preco = preco;
       }

       public double getQuantidade() {
              return this.quantidade;
       }

       public void setQuantidade(double quantidade) {
              this.quantidade = quantidade;
       }

       public double getICMS() {
              return this.ICMS;
       }

       public void setICMS(double ICMS) {
              this.ICMS = ICMS;
       }

       public double calcularTotal(double preco, double quantidade, double ICMS) {
              return preco * quantidade + calcularICMS(ICMS, preco * quantidade);
       }

       public double calcularICMS(double ICMS, double calcularTotal) {
              return ICMS/100 * calcularTotal;
       }

       @Override
       public String toString() {
              return  "\n     ITEM" +
                     "\n    Descrição: " + getDescricao() +
                     "\n    Preço: " + getPreco() +
                     "\n    Valor Total: " + calcularTotal(getPreco(), getQuantidade(), getICMS()) +
                     "\n    ICMS: " + calcularICMS(getICMS(), preco * quantidade);
       }
}
