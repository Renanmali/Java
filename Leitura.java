// Determine o	número	de	dígitos	de	um	número	informado

import java.util.Scanner;
public class Leitura{
    public static void main(String[] args){
        try(Scanner teclado = new Scanner(System.in)){
            int i=0;
            System.out.println("Escreva o número que deseja: ");    
            String numero = teclado.nextLine();
            for (char número: numero.toCharArray()) {
                if(número == '.' || número == ' ' || número == ','){
                }
                else{
                    i++;
                }
            }
            System.out.println("Este número possui: " + i + " dígitos");
        }
    }
}