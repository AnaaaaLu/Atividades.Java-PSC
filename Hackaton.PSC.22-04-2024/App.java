import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
       //declaração das variáveis
        int rows = 5;
        int cols = 5;

        int[][] matrix = new int[rows][cols];

        createRandomMatrix(matrix, rows, cols);
        printMatrix(matrix);

        Scanner read = new Scanner(System.in);
        int menu;

        //menu
        do {
            // System.out.println("----------------------menu---------------------");
            System.out.println("1: a soma dos elementos de todas as linhas pares da matriz.");
            System.out.println("2: a soma dos elementos de todas as colunas ímpares da matriz.");
            System.out.println("3: a soma dos elementos da diagonal principal");
            System.out.println("4: a média de todos os elementos da matriz.");
            System.out.println("5: a quantidade de elementos negativos da matriz.");
            System.out.println("6: o resultado da multiplicação dos elementos da diagonal principal com a média dos elementos da diagonal secundária.");

            System.out.printf("digite o numero que deseja: ");
            menu = read.nextInt();

            //node de decisão
            switch (menu) {
                case 1:
                    EvenLinesSum(matrix);
                    break;
                case 2:
                    unevenColumnsSum(matrix);
                    break;
                case 3:
                    diagonalElementsSum(matrix);
                    break;
                case 4:
                    calculateAverage(matrix);
                    break;
                case 5:
                    amountNegativeNumbers(matrix);
                    break;
                case 6:
                    diagonalSum(matrix);
                    break;
                default:
                    System.out.println("Por favor insira um número válido!");
            }
        } while (menu != -1); //caso -1 seja digitado, o código termina o seu loop
    }

    //cria preenche a matriz com números randomizados dentro do parâmetro -5 && 5
    public static int[][] createRandomMatrix(int[][] matrix, int rows, int cols) {
        Random random = new Random();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(10) - 5;
            }
        }

        return matrix;
    }

    //imprime a matriz
    public static void printMatrix(int[][] matrix) {
        System.out.println("Matriz gerada aleatoriamente");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    //soma os valores das linhas pares 
    public static void EvenLinesSum(int[][] matrix) {
        int sumMatrix = 0;

        for (int i = 0; i < matrix.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < matrix[i].length; j++) {
                    sumMatrix += matrix[i][j];
                }
            }
        }

        System.out.println("Soma dos elementos de todas as linhas pares: " + sumMatrix);
    }

    //soma dos valores das colunas impares
    public static void unevenColumnsSum(int[][] matrix) {
        int sumMatrix = 0;

        for (int j = 0; j < matrix[0].length; j++) {
            if (j % 2 != 0) {
                for (int i = 0; i < matrix.length; i++) {
                    sumMatrix += matrix[i][j];
                }
            }
        }

        System.out.println("Soma dos elementos de todas as colunas impares: " + sumMatrix);
    }

    //soma dos elementos da diagonal principal, saindo do canto esquerdo superior e migrando 
    //para o canto direito inferior
    public static void diagonalElementsSum(int[][] matrix) {
        int sumMatrix = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    sumMatrix += matrix[i][j];
                }
            }
        }

        System.out.println("Soma dos elementos da diagonal principal: " + sumMatrix);
    }

    //média de todos os elementos da matriz
    public static void calculateAverage(int[][] matrix) {
        int sumMatrix = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sumMatrix += matrix[i][j];
            }
        }

        double average = (double) sumMatrix / (matrix.length * matrix[0].length);

        System.out.println("Média de todos os elementos da matriz: " + average);
    }

    //calcula e imprime a quantidade de elementos negativos da matriz
    public static void amountNegativeNumbers(int[][] matrix) {
        int[] vectorC = new int[matrix.length];
        int count = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < 0) {
                    count++;
                }
            }
            vectorC[i] = count;
        }

        System.out.println("Quantidade de elementos negativos: " + count);
    }    
    
    //soma dos elementos da diagonal
    public static void diagonalSum(int[][] matrix) {
        int sumMatrix = 0;

        int diagonal = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    sumMatrix += matrix[i][j];
                }
            }
        }

        int avg = 0;
        for (int i=0;i<matrix.length;i++) {
            for (int j=0;j<matrix[i].length;j++) {
                sumMatrix += matrix[i][j];
            }
        }

        sumMatrix = sumMatrix / matrix.length;

        int diagonalSum =  avg * diagonal;

        System.out.println("Soma dos elementos da diagonal principal: " + diagonalSum);
        

    }
}