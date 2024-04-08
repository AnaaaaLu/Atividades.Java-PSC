import java.util.Scanner;
public class Lista2_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //input de 1 número
        System.out.print("digite um número: ");
        int numero1 = scanner.nextInt();

        //verifica se o valor está entre 100-200
        if (numero1 > 100 && numero1< 200) {
            System.out.println("o numero está entre 100 e 200!");
        } else {
            System.out.println("o numero está fora do intervalo 100 - 200");
        }
    }
}
