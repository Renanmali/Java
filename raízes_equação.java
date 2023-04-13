import java.lang.Math;
import java.util.Scanner;
//Programa criado para cálculo de raízes de uma equação do segundo grau//
public class raízes_equação{
    public static void main(String[] args){
        try (Scanner teclado = new Scanner(System.in)){
            double a, b, c, x1, x2, delta;
            System.out.println("Escreva os coeficientes da equação, na seguinte ordem: a, b e c.");

            a = teclado.nextFloat();
            b = teclado.nextFloat();
            c = teclado.nextFloat();
            delta = (Math.pow(b,2)-(4*a*c));

            if(delta<0){
                System.out.println("A equação não possui raízes reais");
            }
            
            else if(delta == 0){
                x1 = (b*(-1))/(2*a);
                System.out.println("A equação possui duas raízes reais e iguais a:  " + x1);

            }

            else if(delta>0){
                x1 = ((b*(-1))+Math.sqrt(delta))/(2*a);
                x2 = ((b*(-1))-Math.sqrt(delta))/(2*a);
                System.out.printf("A equação possui duas raízes reais e diferentes, são elas: ");
                System.out.printf(" %.2f", x1);
                System.out.printf(" %.2f \n", x2);
            }
        }
    }

}


