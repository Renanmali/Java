import java.util.Scanner;
import java.lang.Math;

public class Lista_1_Exe_1 {
    public static void main(String[] args){
       try (Scanner teclado = new Scanner(System.in)) {
        double a, b, c, x1, x2, delta;
        a = teclado.nextFloat();
        b = teclado.nextFloat();
        c = teclado.nextFloat();
        delta = (Math.pow(b,2))-(4*a*c);
        if(delta > 0){
            x1 = ((-b)+(Math.sqrt(delta)))/(2*a);
            x2 = ((-b)-(Math.sqrt(delta)))/(2*a);
            System.out.println("Existem duas raízes reais e distintas, são elas: ");
            System.out.println("Raiz 1 = " + x1);
            System.out.println("Raiz 2 = " + x2);
        }
        if(delta == 0){
            x1 = ((-b)+(Math.sqrt(delta)))/(2*a);
            System.out.println("Existem duas raízes reais e iguais de valor: " + x1);
        }
        if(delta<0){
            System.out.println("Não existem raízes reais para essa equação.");
        }
    }
    }
    
}
