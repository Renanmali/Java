//Calcule a série de Fibonacci para um número inteiro não negativo informado pelo usuário.//
//A série de Fibonacci inicia com os números F0 = 0 e F1 = 1, e cada número posterior//
//equivale à soma dos dois números anteriores (Fn = Fn-1 + Fn-2). Por exemplo, caso o usuário//
//informe o número 9, o resultado seria: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34.//

import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args){
        try(Scanner teclado = new Scanner(System.in)){
            int entrada, fn=0, f0 = 0, f1 = 1;
            System.out.println("Digite a quantidade de números da série de Fibonacci que você quer ver: ");
            entrada = teclado.nextInt();
            if(entrada==0){
                System.out.println("0");
            }
            else if(entrada==1){
                System.out.println("0, 1, ");
            }
            else{
                System.out.printf("%d, %d, ", f0, f1);
                for(int i=0; i<entrada-2; i++){
                    fn = f1 + f0;
                    f0 = f1;
                    f1 = fn;
                    System.out.printf("%d, ", fn);
                }
                
                fn = f1 + f0;
                System.out.println(fn + ".");
                
            }
            
        }
    }
}