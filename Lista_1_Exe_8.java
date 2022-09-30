import java.util.Scanner;

public class Lista_1_Exe_8 {
    public static void main(String[] args){
        try(Scanner teclado = new Scanner(System.in)){
            System.out.println("Digite a posição do número que você deseja saber da série de Fibonacci: ");
            int posicao = teclado.nextInt();
            int serie[] = new int[posicao+1];
            if (posicao == 1 ){
                System.out.println("0");
            }
            else if(posicao == 2){
                System.out.println("0,1");
            }
            else{
                for(int i = 0; i<posicao+1; i++){
                    if(i == 0){
                        serie[0] = 0;
                    }
                    else if(i == 1){
                        serie[1] = 1;
                    }
                    else{
                        serie[i] = serie[i-1]+serie[i-2];
                    }
                }
                for(int j = 0; j<posicao+1; j++ ){
                    System.out.printf(serie[j]+", ");
                }
            }
        }
    } 
}
