package Lista8HOA.Lista804;

import java.util.ArrayList;

public class Cofrinho {
       private ArrayList<Moeda> moedas;    

       public Cofrinho() {
              this.moedas = new ArrayList<Moeda>();
       }

       public void addMoeda(Moeda moeda) {
              moedas.add(moeda);
       }
    
       public void removeMoeda(Moeda moeda) {
              moedas.remove(moeda);
       }

       public int getQuantidade() {
              return moedas.size();
       }

       public ArrayList<Moeda> getMoedas() {
              return this.moedas;
       }

       public double calcTotal() {
              double total = 0.0;
              for (Moeda moeda : moedas) {
                     total += moeda.getValor();
              }
        return total;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(); //Cria "Váriavel" para armazenar string que será chamada

        sb.append("Cofrinho contém as seguintes moedas:\n");
        for (Moeda moeda : moedas) {
            sb.append(moeda.toString()).append("\n");
        }
        sb.append(String.format("Valor total: R$%.2f", calcTotal()));

        return sb.toString();
    }
}