//Programa que calcula o retorno de alguns investimentos a juros compostos e imprime o capital após um ano, sem utilizar a fórmula de juros compostos// 

import java.util.Scanner;

public class Rendimento{
    public static void main(String[] args){
        float taxa, juros, capital;
        String nome, continua;
        int investimentos;
        Scanner teclado = new Scanner(System.in);
        investimentos = teclado.nextInt();
        String ordena[] = new String[investimentos+1];
        float Capital[] = new float[investimentos+1];
        float Taxa[] = new float[investimentos+1];
        boolean compara = true ;
        for(int i=0; i<investimentos+1; i++){
            nome = teclado.nextLine();
            ordena[i] = nome;
            System.out.println(ordena[i]);
        }

        for(int i=0; i<investimentos; i++){
            capital = teclado.nextFloat();
            Capital[i] = capital;
            System.out.println(Capital[i]);
        }

        for(int i=0; i<investimentos; i++){
            taxa = teclado.nextFloat();
            Taxa[i] = taxa;
            System.out.println(Taxa[i]);
        }
        
        do{
            for(int i=0; i<investimentos; i++){
                for(int j=0; j<12; j++){
                    juros = (Capital[i]*Taxa[i])/100;
                    Capital[i] = Capital[i]+juros;
                }
                System.out.printf("%.2f \n", Capital[i]);
            }
            continua = teclado.nextLine();
            if(continua == "s"){
                compara = true;
            }
            else if(continua == "n"){
                compara = false;
            }
        }while(compara == true);
        
    }
}


