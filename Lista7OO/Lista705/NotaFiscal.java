package Lista7OO.Lista705;

public class NotaFiscal {
       private ItemNotaFiscal item1;
       private ItemNotaFiscal item2;
       private ItemNotaFiscal item3;

       public NotaFiscal(ItemNotaFiscal item1, ItemNotaFiscal item2, ItemNotaFiscal item3) {
              this.item1 = item1;
              this.item2 = item2;
              this.item3 = item3;
       }

    public double calcularTotalNota() { /* */
        return 
        (item1.calcularTotal(item1.getPreco(), item1.getQuantidade(), item1.calcularICMS(item1.getICMS(), item1.getPreco() * item1.getQuantidade()))) +
        (item2.calcularTotal(item2.getPreco(), item2.getQuantidade(), item2.calcularICMS(item2.getICMS(), item2.getPreco() * item2.getQuantidade()))) +
        (item3.calcularTotal(item3.getPreco(), item3.getQuantidade(), item3.calcularICMS(item3.getICMS(), item3.getPreco() * item3.getQuantidade()))) ;
    }

    @Override
    public String toString(){
        return  item1.toString() + 
                item2.toString() + 
                item3.toString() +
                "\n Valor Total da Nota: " + calcularTotalNota(); 
    }
}
