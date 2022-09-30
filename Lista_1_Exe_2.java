import java.util.Scanner;
import java.lang.Math;

public class Lista_1_Exe_2{
    public static void main(String[] args){
        try (Scanner teclado = new Scanner(System.in)){
            int pos[] = new int[6];
            for (int i=0; i<6; i++) {
                if (i==0){
                    System.out.println("Digite as coordenadas do primeiro ponto: ");
                }
                if (i==3){
                    System.out.println("Digite as coordenadas do segundo ponto: ");
                }
                pos[i] = teclado.nextInt();
            }
            double dist, radicando, x, y, z;
            x = pos[3]-pos[0];
            y = pos[4]-pos[1];
            z = pos[5]-pos[2];
            radicando = Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2);
            dist = Math.sqrt(radicando);
            System.out.printf("A distância entre os dois pontos é: %.2f  \n",  dist);
        }
    }
}