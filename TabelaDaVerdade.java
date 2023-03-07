import java.util.Scanner;

public class Principal{

    static void criaTabela(int colunas, int linhas, int tabela[][]){
        int cont = 1;
        int lim = 1;

        for(int i = 0; i < colunas ; i++){
            for(int j = 0; j < linhas; j++){
                if(cont <= lim){
                    tabela[j][i] = 0;
                    cont++;
                }
                else{
                    tabela[j][i] = 1;
                    cont++;
                    if(cont > (lim)*2){
                        cont = 1;
                    }
                }
            }
            lim = lim*2;
        }

    }

    static void printTabela(int colunas, int linhas, int tabela[][], char portas[], int nPortas, int valores[]){
        for(int i =0; i <= nPortas; i++){
            System.out.print(portas[i]+ " ");
        }

        System.out.println();

        for(int i = 0; i < linhas ; i++){
            for(int j = 0; j < colunas ; j++){
                System.out.print(tabela[i][j]+ " ");
            }
            System.out.println();
        }
    }

    static void lePortas(int nPortas, char portas[], Scanner teclado){
        for(int i = 1; i <= nPortas; i ++){
            System.out.println("Porta #"+ i);    
            portas[i-1] = teclado.next().charAt(0);
        }
        portas[nPortas] = 'X';
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o número de portas: ");
        int nPortas = teclado.nextInt();

        char portas[] = new char[nPortas + 1];
        int valores[] = new int[nPortas];

        int resultados = (int) Math.pow(2, nPortas);
        System.out.println(); 

        int colunas = nPortas;
        int linhas = resultados;
        int tabela[][] = new int[linhas][colunas];
      
        lePortas(nPortas, portas, teclado);
        for(int i = 0; i < nPortas; i++){
            System.out.print("Valor da entrada " + portas[i] + ": ");
            valores[i] = teclado.nextInt();
        }
        System.out.println();
        System.out.println();

        criaTabela(colunas, linhas, tabela);
        printTabela(colunas, linhas, tabela, portas, nPortas, valores);
        teclado.close();
    }
}
