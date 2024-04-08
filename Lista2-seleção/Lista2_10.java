/* Produtos em uma mercearia possuem preços variados 
de acordo com o tipo de produto e a quantidade a ser 
comprada. Implemente um programa em Java que apresente 
a lista de produtos disponíveis juntamente com seus 
preços e solicite ao usuário que escolha (1) o produto 
a ser comprado e (2) a quantidade escolhida do produto 
e informe o valor da compra. Os produtos e seus preços 
são: banana (R$ 0,30 se forem compradas menos que uma 
dúzia, e R$ 0,25 se forem compradas pelo menos doze), 
laranja (R$ 0,40 se forem compradas menos que uma dúzia, 
e R$ 0,35 se forem compradas pelo menos doze), maçã 
(R$ 0,50 se forem compradas menos que uma dúzia, e 
R$ 0,45 se forem compradas pelo menos doze), kiwi 
(R$ 0,40 se forem compradas menos que uma dúzia, e 
R$ 0,30 se forem compradas pelo menos doze). (DICA: 
utilizar “if-else” e “switch()” como estruturas de 
seleção, e dados tipo “double” com duas casas decimais 
(%.2f) para a representação dos preços a serem cobrados. 
Utilizar um único “printf()” para montar o menu de 
opções conforme ilustração abaixo) */

import java.util.Scanner;

public class Lista2_10 {
       public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);

        System.out.println("---------Lista de Produtos e Preços---------");
        System.out.println("01. Banana -> R$0.30 'preço granel' ou R$0.25 na compra de uma duzia ou mais");
        System.out.println("02. Laranja -> R$0.40 'preço granel' ou R$0.35 na compra de uma duzia ou mais");
        System.out.println("03. Maçã -> R$0.50 'preço granel' ou R$0.45 na compra de uma duzia ou mais");
        System.out.println("04. Kiwi -> R$0.40 'preço granel' ou R$0.30 na compra de uma duzia ou mais");
        System.out.println("Escolha o produto desejado ou digite -1 para sair");

        int userInput = read.nextInt();

        if (userInput != -1) {
            double debito = 0;
            double precoDaFruta = 0;
            String frutaEscolhida = null;

//node de decisão, onde o user seleciona a fruta, quantidade e o programa seleciona se o preço será a granel ou atacado

            switch (userInput) {
                case 1:
                    frutaEscolhida = "banana";
                    System.out.println("Escolha a quantidade de banana(s) desejada");
                    userInput = read.nextInt();
                    if (userInput >= 12) {
                        precoDaFruta = 0.25;
                        debito = userInput * precoDaFruta;
                    } else {
                        precoDaFruta = 0.30;
                        debito = userInput * precoDaFruta;
                    }
                    break;
                case 2:
                    frutaEscolhida = "laranja";
                    System.out.println("Escolha a quantidade de laranja(s) desejada");
                    userInput = read.nextInt();
                    if (userInput >= 12) {
                        precoDaFruta = 0.35;
                        debito = userInput * precoDaFruta;
                    } else {
                        precoDaFruta = 0.40;
                        debito = userInput * precoDaFruta;
                    }
                    break;
                case 3:
                    frutaEscolhida = "maçã";
                    System.out.println("Escolha a quantidade de maçã(s) desejada");
                    userInput = read.nextInt();
                    if (userInput >= 12) {
                        precoDaFruta = 0.45;
                        debito = userInput * precoDaFruta;
                    } else {
                        precoDaFruta = 0.50;
                        debito = userInput * precoDaFruta;
                    }
                    break;
                case 4:
                    frutaEscolhida = "kiwi";
                    System.out.println("Escolha a quantidade de kiwi(s) desejada");
                    userInput = read.nextInt();
                    if (userInput >= 12) {
                        precoDaFruta = 0.30;
                        debito = userInput * precoDaFruta;
                    } else {
                        precoDaFruta = 0.40;
                        debito = userInput * precoDaFruta;
                    }
                    break;
                default:
                    break;
            }

            System.out.println("---------Valor da Compra---------");
            System.out.println(userInput + " unidade(s) de " + frutaEscolhida + " a R$" + precoDaFruta + " a unidade = " + debito);
        } else {
            System.out.println("Operação finalizada!");
        }

        read.close();
    }
}