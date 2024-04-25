/* Preencher um vetor X de 10 elementos (índices de 0 a 9) em tempo de execução 
com o valor inteiro 30. Escrever o vetor X após seu total reenchimento.
*/

public class Lista4_01 {
       public static void main(String[] args) throws Exception {
              int[] array = new int[10];

        for (int i = 0; i < 10; i++) {
            array [i] = 30;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("array[" + i + "] = " + array[i]);
        }
    }
}