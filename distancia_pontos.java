//Importando as duas classes que serão utilizadas para o funcionamento do programa //

import java.lang.Math;
import java.util.Scanner;

//Programa que calcula a distância entre dois pontos em um espaço tridimensional//
public class distancia_pontos{
    public static void main(String[] args){
        
        //Instanciando o scanner teclado para poder fazer a entrada das variáveis//
        
        try(Scanner teclado = new Scanner(System.in) ){
            
            //Inicializando as variáveis utilizadas no programa//
            
            double x1, x2, y1, y2, z1, z2, dist, soma;

            System.out.println("Insira as 3 coordenadas do primeiro ponto, na seguinte ordem:  x, y, z");
            x1 = teclado.nextFloat();
            y1 = teclado.nextFloat();
            z1 = teclado.nextFloat();
            System.out.println("Insira as 3 coordenadas do segundo ponto, na seguinte ordem:   x, y, z");
            x2 = teclado.nextFloat();
            y2 = teclado.nextFloat();
            z2 = teclado.nextFloat();

            soma = Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2)+Math.pow(z2-z1, 2);
            dist = Math.sqrt(soma);

            System.out.printf("A distância entre esses dois pontos é de: %.2f \n ", dist);

        }
    } 
}